package com.mycompany.project01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
@Slf4j
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index";
    } 

    // 회사 소개 주소를 별도의 Thymeleaf 화면으로 연결한다.
    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
