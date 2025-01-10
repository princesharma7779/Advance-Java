package com.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/com.basic.Ck2Servlet")
public class Ck2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Ck2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		try {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			Cookie ck[]=request.getCookies();
			out.println(ck[0].getName()+""+ck[0].getValue());
			out.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
