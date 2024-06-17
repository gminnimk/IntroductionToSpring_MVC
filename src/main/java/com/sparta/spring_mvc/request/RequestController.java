package com.sparta.spring_mvc.request;

import org.springframework.stereotype.Controller;  // Spring MVC의 Controller 애노테이션을 임포트합니다.
import org.springframework.web.bind.annotation.*;  // 여러 Spring 애노테이션들을 임포트합니다.




// 이 클래스는 다양한 요청 방법(GET, POST)에 대해 경로 변수와 요청 매개변수를 처리하는 방법을 보여줍니다.



@Controller  // 이 클래스를 Spring MVC의 컨트롤러로 지정합니다.
@RequestMapping("/hello/request")  // 이 컨트롤러의 모든 요청 경로 앞에 "/hello/request"를 추가합니다.
public class RequestController {


    // GET 요청을 처리하여 HTML 폼 페이지를 반환합니다.
    // [Request sample]
    // GET http://localhost:8080/hello/request/form/html

    @GetMapping("/form/html") // /hello/request/form/html 경로로 들어오는 HTTP GET 요청을 이 메서드에 매핑합니다.
    public String helloForm() { // HTML 폼 페이지를 반환합니다.
        return "hello-request-form";  // "hello-request-form"이라는 이름의 HTML 파일을 반환합니다.
    }


    // 경로 변수로부터 데이터를 받아 처리하는 메서드입니다.
    // [Request sample]
    // GET http://localhost:8080/hello/request/star/Robbie/age/95

    @GetMapping("/star/{name}/age/{age}") // /hello/request/star/{name}/age/{age} 경로로 들어오는 HTTP GET 요청을 이 메서드에 매핑합니다.
    @ResponseBody  // 반환값을 HTTP 응답 본문으로 사용합니다.
    public String helloRequestPath(@PathVariable String name, @PathVariable int age) { // 경로 변수에서 데이터를 받아 처리합니다.
        return String.format("Hello, @PathVariable.<br> name = %s, age = %d", name, age);  // 경로 변수에서 받은 name과 age를 사용하여 문자열을 반환합니다.
    }


    // 요청 매개변수로부터 데이터를 받아 처리하는 메서드입니다.
    // [Request sample]
    // GET http://localhost:8080/hello/request/form/param?name=Robbie&age=95
    @GetMapping("/form/param") // /hello/request/form/param 경로로 들어오는 HTTP GET 요청을 이 메서드에 매핑합니다.
    @ResponseBody  // 반환값을 HTTP 응답 본문으로 사용합니다.
    public String helloGetRequestParam(@RequestParam(required = false) String name, @RequestParam int age) { // 요청 매개변수에서 데이터를 받아 처리합니다.
        return String.format("Hello, @RequestParam.<br> name = %s, age = %d", name, age);  // 요청 매개변수에서 받은 name과 age를 사용하여 문자열을 반환합니다.
    }


    // POST 요청으로 전달된 데이터를 받아 처리하는 메서드입니다.
    // [Request sample]
    // POST http://localhost:8080/hello/request/form/param
    // Header
    //  Content type: application/x-www-form-urlencoded
    // Body
    //  name=Robbie&age=95
    @PostMapping("/form/param") // /hello/request/form/param 경로로 들어오는 HTTP POST 요청을 이 메서드에 매핑합니다.
    @ResponseBody  // 반환값을 HTTP 응답 본문으로 사용합니다.
    public String helloPostRequestParam(@RequestParam String name, @RequestParam int age) { // 요청 본문에서 데이터를 받아 처리합니다
        return String.format("Hello, @RequestParam.<br> name = %s, age = %d", name, age);  // 요청 본문에서 받은 name과 age를 사용하여 문자열을 반환합니다.
    }
}
