package com.text.ajax.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.text.ajax.repository.AjaxDAO;

@WebServlet("/ex02data.do")
public class Ex02Data extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		int n=0;
//		System.out.println(100/n);
		
		
		
		
		AjaxDAO dao=new AjaxDAO();
		
		int count=dao.getMemoCount();
		
		
		//Ajax용은 JSP안만들고 이런식으로 데이터만 보내는 PrintWriter를 써서 보낸다
		PrintWriter writer=resp.getWriter();
		
		writer.print(count);
		
		writer.close();
		
		
		
		
//		req.setAttribute("count", count);
//				
//		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/ex02data.jsp");
//		dispatcher.forward(req, resp);

	}

}
