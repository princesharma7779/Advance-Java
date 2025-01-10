package com.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/com.basic.InsertRecord")
public class InsertRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public InsertRecord() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int res=0;
		String name=request.getParameter("name");
		int rollnumber=Integer.parseInt(request.getParameter("rollnumber"));
		int age=Integer.parseInt(request.getParameter("age"));
     String city=request.getParameter("city");		
    
	if(res>0) {
    	 out.println("record inserted");
     }
     else {
    	 out.println("error in insertion");
     }
	}

}
