package com.example.member.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

// 라이브러리 lombok 설치해야 사용 가능
@Getter
@Setter
public class Member {
    // @JsonProperty : insert 테스트 시 json 형식으로 넣을 때
    // json의 속성명 : value="userId"
    // { "userId" : "iooe9094" }

    @JsonProperty(value="userId")
    private String userId;

    @JsonProperty(value="userName")
    private String userName;

    @JsonProperty(value="userAuth")
    private String userAuth;

    @JsonProperty(value="appendDate")
    private String appendDate;

    @JsonProperty(value="updateDate")
    private String updateDate;
}
