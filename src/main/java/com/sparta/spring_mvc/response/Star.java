package com.sparta.spring_mvc.response;

import lombok.Getter;  // Lombok의 Getter 애노테이션을 임포트합니다.


/*
간단한 데이터 객체로, 별의 이름과 나이를 저장하고 관리하는 목적을 가지고 있습니다.
Lombok의 @Getter 애노테이션을 사용하여 Getter 메서드를 자동으로 생성하여 코드의 가독성을 높였습니다.
 */

@Getter  // 모든 필드에 대한 Getter 메서드를 자동으로 생성합니다.
public class Star {
    public String name;  // 별의 이름을 나타내는 필드입니다.
    public int age;  // 별의 나이를 나타내는 필드입니다.

    // 생성자
    public Star(String name, int age) {
        this.name = name;  // 주어진 이름으로 별 객체를 초기화합니다.
        this.age = age;  // 주어진 나이로 별 객체를 초기화합니다.
    }

    // 기본 생성자
    public Star() {}  // 기본 생성자입니다.
}