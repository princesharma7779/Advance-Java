package com.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/com.basic.SessionServlet")

public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Session() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		try {
			response.setContentType("text/html");
			PrintWriter  out=response.getWriter();
			String n=request.getParameter("userName");
			out.print("welcome"+n);
			
			HttpSession session=request.getSession();
			session.setAttribute("uname",n);
			
			out.print("<a href='com.basic.Serv2'>visit</a>");
			out.close();
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
