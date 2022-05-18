package com.example.dao;

import com.example.member.model.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberDao {
    // select문 메소드
    List<Member> selectAll(); // 부서 정보 select 하는 메소드

    void insert(Member member); // 부서 정보 insert 하는 메소드
}
