package com.sparta.spring_mvc.html;

import org.springframework.stereotype.Controller;  // Spring MVC의 Controller 애노테이션을 임포트합니다.
import org.springframework.ui.Model;  // Spring MVC에서 뷰로 데이터를 전달하기 위해 Model 클래스를 임포트합니다.
import org.springframework.web.bind.annotation.GetMapping;  // HTTP GET 요청을 매핑하기 위해 GetMapping 애노테이션을 임포트합니다.


// 정적 HTML 파일, 템플릿, 리디렉션, 동적 콘텐츠를 처리하는 다양한 방식의 HTTP GET 요청을 처리하는 Spring MVC 컨트롤러를 정의합니다.




@Controller  // 이 클래스를 Spring MVC의 컨트롤러로 지정합니다.
public class HtmlController {

    private static long visitCount = 0;  // 정적 필드로 방문 횟수를 저장합니다.

    @GetMapping("/static-hello")  // "/static-hello" 경로로 들어오는 HTTP GET 요청을 처리합니다.
    public String hello() {
        return "hello.html";  // "hello.html" 정적 HTML 파일을 응답으로 반환합니다.
    }

    @GetMapping("/html/redirect")  // "/html/redirect" 경로로 들어오는 HTTP GET 요청을 처리합니다.
    public String htmlStatic() {
        return "redirect:/hello.html";  // "/hello.html"로 리디렉션합니다.
    }

    @GetMapping("/html/templates")  // "/html/templates" 경로로 들어오는 HTTP GET 요청을 처리합니다.
    public String htmlTemplates() {
        return "hello";  // "hello"라는 이름의 템플릿(예: Thymeleaf 템플릿)을 응답으로 반환합니다.
    }

    @GetMapping("/html/dynamic")  // "/html/dynamic" 경로로 들어오는 HTTP GET 요청을 처리합니다.
    public String htmlDynamic(Model model) {
        visitCount++;  // 방문 횟수를 증가시킵니다.
        model.addAttribute("visits", visitCount);  // 모델에 "visits"라는 이름으로 방문 횟수를 추가합니다.
        return "hello-visit";  // "hello-visit"이라는 이름의 템플릿을 응답으로 반환합니다.
    }
}
