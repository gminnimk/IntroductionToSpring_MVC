package com.sparta.spring_mvc.controller;

import org.springframework.stereotype.Controller;  // Spring MVC의 Controller 애노테이션을 임포트합니다.
import org.springframework.web.bind.annotation.*;  // Spring Web 애노테이션을 임포트합니다.



// 다양한 HTTP 메서드(GET, POST, PUT, DELETE)에 대한 요청을 처리하는 RESTful 웹 서비스 컨트롤러를 정의합니다.




@Controller  // 이 클래스를 Spring MVC의 컨트롤러로 지정합니다.
@RequestMapping("/api")  // 이 컨트롤러의 모든 요청 경로 앞에 "/api"를 추가합니다.
public class HelloController {

    @GetMapping("/hello")  // "/api/hello" 경로로 들어오는 HTTP GET 요청을 처리합니다.
    @ResponseBody  // 메서드의 반환값을 HTTP 응답 본문으로 사용합니다.
    public String hello() {
        return "Hello World";  // "Hello World" 문자열을 응답으로 반환합니다.
    }

    @GetMapping("/get")  // "/api/get" 경로로 들어오는 HTTP GET 요청을 처리합니다.
    @ResponseBody  // 메서드의 반환값을 HTTP 응답 본문으로 사용합니다.
    public String get() {
        return "GET Method 요청";  // "GET Method 요청" 문자열을 응답으로 반환합니다.
    }

    @PostMapping("/post")  // "/api/post" 경로로 들어오는 HTTP POST 요청을 처리합니다.
    @ResponseBody  // 메서드의 반환값을 HTTP 응답 본문으로 사용합니다.
    public String post() {
        return "POST Method 요청";  // "POST Method 요청" 문자열을 응답으로 반환합니다.
    }

    @PutMapping("/put")  // "/api/put" 경로로 들어오는 HTTP PUT 요청을 처리합니다.
    @ResponseBody  // 메서드의 반환값을 HTTP 응답 본문으로 사용합니다.
    public String put() {
        return "PUT Method 요청";  // "PUT Method 요청" 문자열을 응답으로 반환합니다.
    }

    @DeleteMapping("/delete")  // "/api/delete" 경로로 들어오는 HTTP DELETE 요청을 처리합니다.
    @ResponseBody  // 메서드의 반환값을 HTTP 응답 본문으로 사용합니다.
    public String delete() {
        return "DELETE Method 요청";  // "DELETE Method 요청" 문자열을 응답으로 반환합니다.
    }
}
