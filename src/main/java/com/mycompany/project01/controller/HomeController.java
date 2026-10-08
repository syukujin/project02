package com.mycompany.project01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 애너테이션 처리 없이 로거를 직접 생성한다.
    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public String home() {
        // 화면 요청을 기록해 개발 중 라우팅을 확인한다.
        log.debug("HomeController.home(): 홈 화면 요청");
        return "index";
    } 

    // 회사 소개 주소를 별도의 Thymeleaf 화면으로 연결한다.
    @GetMapping("/about")
    public String about() {
        log.debug("HomeController.about(): 회사 소개 화면 요청");
        return "about";
    }

    public void method1() {
        log.debug("HomeController.method1(): 메소드 호출");
    }

    public void method2() {
        log.debug("HomeController.method2(): 메소드 호출");
    }
}
