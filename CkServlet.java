package com.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/com.basic.CkServlet")
public class CkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CkServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("name");
		Cookie ck=new Cookie("username",user);
		out.println("welcome="+user);
		response.addCookie(ck);
		out.println("<form action='com.basic.Ck2Servlet' method='post'>");
		out.println("<input type='submit' value='go'>");
		out.println("</form");
		}

}
