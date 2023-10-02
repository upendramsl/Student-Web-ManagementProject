package com.techpalle.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.model.Student;
import com.techpalle.Req.MyApplication;

@WebServlet("/")
public class My extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getServletPath();
		switch(path)
		{
		case "/reg":
			registerMethod(request,response);
			break;
		case "/login":
		        loginMethod(request,response);
		         break;
			default :
				startUpPage(request,response);
				break;
		
		}
	}
	
	private void loginMethod(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String email=request.getParameter("tbEmail");
		String pass=request.getParameter("tbPass");
		
	   MyApplication mp=new MyApplication();
	   boolean b=mp.login(email,pass);
	   if(b)
	   {
		   RequestDispatcher rd=request.getRequestDispatcher("successpage.jsp");
		   rd.forward(request, response);
	   }
	   else
	   {
		   RequestDispatcher rd=request.getRequestDispatcher("errorpage.jsp");
		   rd.forward(request, response);
		   
	   }
		
		
		
		
		
	}

	private void startUpPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher rd=request.getRequestDispatcher("startuppage.jsp");
		rd.forward(request, response);
		
	}

	private void registerMethod(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("tbName");
		String email=request.getParameter("tbEmail");
		long mobile=Long.parseLong(request.getParameter("tbMobile"));
		String pass=request.getParameter("tbPass");
		Student s1=new Student(name, email, mobile, pass);
		MyApplication mp=new MyApplication();
		mp.reg(s1);
		
		
		
		RequestDispatcher rd=request.getRequestDispatcher("loginpage.jsp");
		rd.forward(request, response);
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}