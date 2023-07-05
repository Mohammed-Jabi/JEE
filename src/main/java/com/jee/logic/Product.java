package com.jee.logic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Product extends HttpServlet	{
		
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
			
			int num1 = Integer.parseInt(req.getParameter("num1"));
			int num2 = Integer.parseInt(req.getParameter("num2"));
			
			PrintWriter out=res.getWriter();
			out.println("Product is : "+(num1*num2));
			
			
		}
	
}
