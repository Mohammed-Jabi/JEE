package com.jee.logic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet	{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		//coment the below line if u are using the include method
		int sum = num1+num2;
		
		PrintWriter out = res.getWriter();
		//out.println("The sum is: "+(num1+num2) );
		
		//coment the below line if u are using the include method
		RequestDispatcher rd=req.getRequestDispatcher("product");
		
		req.setAttribute("mySum", sum);
		rd.forward(req, res);//forward will not consider the current page uotput and it will move next page
		//rd.include(req,res);
		
		
	}

}
