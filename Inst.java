package com.basic;

import java.sql.Connection;
import java.sql.Statement;

import jakarta.el.ELException;

public class Inst
{
static Connection con=null;
static Statement stmt=null;
static int result=0;
public static int insertData(String name, int age, int rollnumber, String city) {
 try{
	con=DbConnect.connectdb();
	stmt=con.createStatement();
	String sql="insert into student values('"+name+"','"+rollnumber+"','"+age+"','"+city+"')";
	result=stmt.executeUpdate(sql);
	
}   catch(Exception e)
{
	e.printStackTrace();
}
 return result;
}
}
