package com.revature.day.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.UserDAO;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Login: ").append(request.getContextPath());
		String email = request.getParameter("email");
        String password = request.getParameter("password");
        PrintWriter out = response.getWriter();
        out.println("Email:" + email);
        out.println("Password:" + password );
        
        boolean isvaliduser=false;
        try {
        UserDAO userDAO = new UserDAO();
        isvaliduser = userDAO.login(email, password);
        }catch(Exception e)
        {
        	e.printStackTrace();
        }
        if(isvaliduser)
        {
        	response.sendRedirect("home.jsp");
        }
        else
        {
        	response.sendRedirect("index.jsp?message=Invalid User Login  Credentials");
        }
        }
	}

	


