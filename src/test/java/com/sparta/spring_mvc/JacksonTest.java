package com.sparta.spring_mvc;

import com.fasterxml.jackson.core.JsonProcessingException;  // JSON 처리 중 발생할 수 있는 예외를 임포트합니다.
import com.fasterxml.jackson.databind.ObjectMapper;  // Jackson 라이브러리의 ObjectMapper 클래스를 임포트합니다.
import com.sparta.spring_mvc.response.Star;  // Star 클래스를 임포트합니다.
import org.junit.jupiter.api.DisplayName;  // JUnit 테스트의 DisplayName 애노테이션을 임포트합니다.
import org.junit.jupiter.api.Test;  // JUnit 테스트 애노테이션을 임포트합니다.



// 이 테스트 클래스는 Jackson 라이브러리를 사용하여 객체를 JSON으로 변환하고, JSON을 객체로 변환하는 방법을 보여줍니다.



public class JacksonTest {

    // 객체를 JSON 문자열로 변환하는 테스트 메서드입니다.
    @Test
    @DisplayName("Object To JSON : get Method 필요")  // 테스트의 이름을 지정합니다.
    void test1() throws JsonProcessingException {
        Star star = new Star("Robbie", 95);  // Star 객체를 생성합니다.

        ObjectMapper objectMapper = new ObjectMapper();  // Jackson 라이브러리의 ObjectMapper 객체를 생성합니다.
        String json = objectMapper.writeValueAsString(star);  // Star 객체를 JSON 문자열로 변환합니다.

        System.out.println("json = " + json);  // 변환된 JSON 문자열을 출력합니다.
    }


    // JSON 문자열을 객체로 변환하는 테스트 메서드입니다.
    @Test
    @DisplayName("JSON To Object : 기본 생성자 & (get OR set) Method 필요")  // 테스트의 이름을 지정합니다.
    void test2() throws JsonProcessingException {
        String json = "{\"name\":\"Robbie\",\"age\":95}";  // JSON 타입의 문자열을 정의합니다.

        ObjectMapper objectMapper = new ObjectMapper();  // Jackson 라이브러리의 ObjectMapper 객체를 생성합니다.

        Star star = objectMapper.readValue(json, Star.class);  // JSON 문자열을 Star 객체로 변환합니다.
        System.out.println("star.getName() = " + star.getName());  // 변환된 객체의 이름을 출력합니다.
    }
}
