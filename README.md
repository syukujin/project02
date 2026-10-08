# 프로젝트 소개

## 1. 프로젝트개요

Spring Boot와 Thymeleaf로 구현한 MY COMPANY 회사 소개 웹 애플리케이션입니다. 서버에서 HTML 템플릿을 렌더링하고 CSS와 배너 이미지를 정적 리소스로 제공합니다.

작업 폴더는 `project02`이지만 현재 Gradle 프로젝트명과 애플리케이션명은 `project01`, Java 기본 패키지는 `com.mycompany.project01`로 설정되어 있습니다. 아래 명령과 JAR 파일명은 이 설정을 기준으로 합니다.

## 2. 제공기능

- `GET /`: 회사 소개 홈 화면을 표시합니다.
- 홈, 회사 소개, 핵심 가치, 문의 안내 영역으로 이동하는 페이지 내 메뉴를 제공합니다.
- 배너 이미지와 신뢰·도전·동반 성장 소개를 제공합니다.
- 모바일 화면에 맞춘 반응형 레이아웃과 키보드 사용자를 위한 본문 바로가기를 제공합니다.

현재 문의 영역은 연락처와 주소 준비 중 안내를 표시합니다. 별도의 문의 접수, 회원 관리, 게시판 REST API 및 데이터베이스 연동은 구현되어 있지 않습니다.

## 3. 실행환경구축

### Windows 환경 설정

1. JDK 21을 설치합니다.
2. `JAVA_HOME` 환경 변수를 JDK 21 설치 폴더로 설정합니다.
3. `Path` 환경 변수에 `%JAVA_HOME%\bin`을 추가합니다.
4. PowerShell을 새로 열고 버전을 확인합니다.

```powershell
java -version
javac -version
```

프로젝트 폴더로 이동한 후 Gradle Wrapper를 확인합니다.

```powershell
cd C:\gen-ai-course\projects\agentic-coding\project02
.\gradlew.bat --version
```

Gradle을 별도로 설치할 필요는 없습니다. 최초 실행 시 Gradle 배포본과 Maven Central 의존성을 다운로드하므로 인터넷 연결이 필요합니다. 현재 프로젝트는 별도 DB 서버나 추가 환경 변수 없이 실행할 수 있습니다.

### 실행 방법

#### Gradle로 실행

```powershell
.\gradlew.bat bootRun
```

#### 빌드된 JAR로 실행

빌드를 완료한 후 다음 명령을 실행합니다.

```powershell
java -jar .\build\libs\project01-0.0.1-SNAPSHOT.jar
```

서버가 시작되면 브라우저에서 [http://localhost:8080](http://localhost:8080)에 접속합니다. 실행 중인 터미널에서 `Ctrl+C`를 누르면 서버가 종료됩니다.

8080 포트가 사용 중이면 JAR 실행 시 다른 포트를 지정할 수 있습니다.

```powershell
java -jar .\build\libs\project01-0.0.1-SNAPSHOT.jar --server.port=8081
```

이 경우 접속 주소는 [http://localhost:8081](http://localhost:8081)입니다.

## 4. 빌드방법

`project02` 폴더에서 다음 명령을 실행합니다. 소스를 컴파일하고 테스트를 수행한 후 실행 가능한 JAR을 생성합니다.

```powershell
.\gradlew.bat clean build
```

실행 가능한 JAR의 기본 생성 경로는 `build/libs/project01-0.0.1-SNAPSHOT.jar`입니다. `-plain.jar` 파일이 함께 생성되는 경우 애플리케이션 실행에는 위의 실행 가능한 JAR을 사용합니다.

테스트만 실행하려면 다음 명령을 사용합니다.

```powershell
.\gradlew.bat test
```

테스트 보고서는 `build/reports/tests/test/index.html`에서 확인할 수 있습니다.

## 5. 주요사용기술

| 항목 | 설정 |
| --- | --- |
| Java | JDK 21 |
| Spring Boot | 4.1.1 |
| Gradle | 9.7.1, 프로젝트에 포함된 Wrapper 사용 |
| 웹 | Spring MVC, Thymeleaf |
| 화면 | HTML, CSS, 정적 이미지 |
| 테스트 | JUnit Platform, Spring Boot 테스트 지원 |
