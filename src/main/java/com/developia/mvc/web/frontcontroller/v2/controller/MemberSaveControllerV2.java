package com.developia.mvc.web.frontcontroller.v2.controller;

import com.developia.mvc.domain.member.Member;
import com.developia.mvc.domain.member.MemberRepository;
import com.developia.mvc.web.frontcontroller.MyView;
import com.developia.mvc.web.frontcontroller.v2.ControllerV2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberSaveControllerV2 implements ControllerV2 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        //Model에 데이터를 보관한다.
        request.setAttribute("member",member);
        return new MyView("/WEB-INF/views/save.jsp");
    }
}
