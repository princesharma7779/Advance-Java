package com.basic;
import java.sql.Connection;
import java.sql.DriverManager;
public class DbConnect 
{
 static Connection con=null;
 public static Connection connectdb()
 {
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adj","root","Rio3341");
	 }
	 catch (Exception e)
	 {
		 e.printStackTrace();
	 }
	 return con;
 }
}
