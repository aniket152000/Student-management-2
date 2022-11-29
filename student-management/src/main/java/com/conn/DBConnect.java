package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private static Connection conn = null;
	
	public static Connection getConn() {
		try {
			
			
	         //Class.forName("org.postgresql.Driver");
	         
	         
	         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			//conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/students_db","postgres", "ani24");
			
			
			 conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=studentsdb","sa","Aniket15");
	         
	         //Connection conn = DriverManager.getConnection("jdbc:sqlserver://172.17.0.1/students_db","sa","Aniket15");
	         
	         //Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;students_db","sa","Aniket15");

			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
