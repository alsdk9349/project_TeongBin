package com.ssafy.teongbin.common.reseponse;

import lombok.Getter;

@Getter
public enum MsgType {

    SIGNUP_SUCCESSFULLY("회원가입이 완료되었습니다."),
    LOGIN_SUCCESSFULLY("로그인이 완료되었습니다."),
    SEARCH_SUCCESSFULLY("조회 성공"),
    DATA_SUCCESSFULLY("데이터 생성 성공"),
    UPDATE_SUCCESSFULLY("수정 성공"),
    GENERATE_TOKEN_SUCCESSFULLY("토큰 생성 성공");

    private final String msg;

    MsgType(String msg){
        this.msg = msg;
    }
}
