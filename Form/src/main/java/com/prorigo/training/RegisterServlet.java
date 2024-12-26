package com.prorigo.training;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");

		String cond = request.getParameter("condition");

		if(cond.equals("checked")) {
			out.println("<h2>Name : " + name+ "</h2>");
			out.println("<h2>Email : "+ email+ "</h2>");
			out.println("<h2>Password : "+ password+ "</h2>");
			out.println("<h2>Gender : "+ gender+ "</h2>");
			out.println("<h2>Course : "+ course + "</h2>");
		}
		else {
			out.println("<h2>You have not accepted terms and conditions</h2>");
		}


	}

}
