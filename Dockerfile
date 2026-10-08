FROM eclipse-temurin:21-jdk AS builder
WORKDIR /app
COPY gradle gradle
COPY gradlew build.gradle settings.gradle ./
RUN chmod +x gradlew
COPY src src
RUN ./gradlew --no-daemon bootJar

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=builder /app/build/libs/project01-0.0.1-SNAPSHOT.jar app.jar
# Render가 지정한 포트에서 요청을 받고 종료 신호를 Java에 전달한다.
ENV JAVA_TOOL_OPTIONS="-XX:MaxRAMPercentage=70.0"
EXPOSE 10000
CMD ["sh", "-c", "exec java -jar app.jar --server.address=0.0.0.0 --server.port=${PORT:-10000}"]
