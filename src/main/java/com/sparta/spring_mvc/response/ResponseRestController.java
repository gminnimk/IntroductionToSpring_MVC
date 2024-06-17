package com.sparta.spring_mvc.response;

import org.springframework.web.bind.annotation.GetMapping;  // HTTP GET 요청을 매핑하기 위해 GetMapping 애노테이션을 임포트합니다.
import org.springframework.web.bind.annotation.RequestMapping;  // 특정 경로에 요청을 매핑하기 위해 RequestMapping 애노테이션을 임포트합니다.
import org.springframework.web.bind.annotation.RestController;  // RESTful 웹 서비스를 위한 RestController 애노테이션을 임포트합니다.

@RestController  // 이 클래스를 RESTful 웹 서비스의 컨트롤러로 지정합니다.
@RequestMapping("/response/rest")  // 이 컨트롤러의 모든 요청 경로 앞에 "/response/rest"를 추가합니다.
public class ResponseRestController {

    // 이 메서드는 "/response/rest/json/string" 경로로 들어오는 HTTP GET 요청을 처리합니다.
    // [Response header]
    //   Content-Type: text/html  (기본 설정)
    // [Response body]
    //   {"name":"Robbie","age":95}  (JSON 문자열 반환)
    @GetMapping("/json/string")
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";  // JSON 형식의 문자열을 응답으로 반환합니다.
    }

    // 이 메서드는 "/response/rest/json/class" 경로로 들어오는 HTTP GET 요청을 처리합니다.
    // [Response header]
    //   Content-Type: application/json
    // [Response body]
    //   {"name":"Robbie","age":95}  (JSON 객체 반환)
    @GetMapping("/json/class")
    public Star helloClassJson() {
        return new Star("Robbie", 95);  // Star 객체를 응답으로 반환합니다. Jackson 라이브러리가 자동으로 JSON 형식으로 변환합니다.
    }
}

