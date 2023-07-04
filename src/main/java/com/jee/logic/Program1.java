package com.jee.logic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Program1 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req,HttpServletResponse res ) throws IOException {
		
		String un = req.getParameter("username");
		
		PrintWriter out = res.getWriter();
		out.print("Hello"+un);
		
	}



}
