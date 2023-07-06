package com.jee.logic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectMain extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String password	 = "abcdef";
	
	String name = req.getParameter("usernmae");
	String myPassword = req.getParameter("password");

	if (myPassword != null && myPassword.equals(password)) {
		
		resp.sendRedirect("rdirect");
		
	}
	
	
	}

}
