package com.example.boseoksite.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * packageName : com.example.boseoksite.model
 * fileName : BoardDto
 * author : Seok
 * date : 2022-05-17
 * description : 개발순서: Model - Dao - xml - Service - Controller
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-17         Seok          최초 생성
 */

// @lombok 라이브러리에서 제공하는 어노테이션
@Getter
@Setter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class BoardDto {
    // 번호(PK_PrimaryKey:기본키)
    private long idx;
    // 제목
    private String title;
    // 내용
    private String content;
    // 작성자
    private String writer;
    // 조회수
    private int viewCnt;
    // 공지여부 (Y,N)
    private String noticeYn;
    // 비밀여부 (Y,N)
    private String secretYn;
    // 삭제여부 (Y,N)
    private String deleteYn;
    // 등록일 - 항상 넣어주는게 좋음
    private LocalDateTime insertTime;
    // 수정일 - 항상 넣어주는게 좋음
    private LocalDateTime updateTime;
    // 삭제일 - 항상 넣어주는게 좋음
    private LocalDateTime deleteTime;
}