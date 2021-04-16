package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/queryTest2")
public class QueryTest2Servlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>Post 방식 Query 문자열 추출</h1>");
		ServletInputStream input = req.getInputStream();
		int len = req.getContentLength(); // 요청정보 몸체의 길이
		byte[] buf = new byte[len]; // 바이트 배열 메모리에 생성
		input.readLine(buf, 0, len); // input 입력스트림으로부터 줄 단위로 데이터 읽음
		String s = new String(buf);
		out.print("전체 문자열 : " + s);
		out.println("</body></html>");
		out.close();
	}
}