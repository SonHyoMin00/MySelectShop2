package com.sparta.myselectshop2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserTimeDto {
    String username;
    long totalTime;
}