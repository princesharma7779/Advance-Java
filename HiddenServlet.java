package com.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/com.basic.HiddenServlet")
public class HiddenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HiddenServlet() {
        super();
            }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("user");
		out.println("welcome" +user);
		out.println("<form action='com.basic.HddServlet' mthod='post'>");
		out.println("<input type='hidden' name='user' value='"+user+"'>");
		out.println("<input type='submit' value='click to go other page'>");
		out.println("</form>");;
	}

}
