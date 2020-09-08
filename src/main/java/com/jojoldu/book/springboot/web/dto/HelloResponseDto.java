package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor        // ==> final 선언 변수 포함하여 생성자를 만듬
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
