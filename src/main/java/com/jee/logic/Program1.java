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
		out.print("Hello "+un);
		
		//To hide user name and password do use dopost method insted of doget; 
		//doget is a default method called if we dont specify and it can be called using service method whhre as dopost will be called if call the dopost method
		
	}



}
