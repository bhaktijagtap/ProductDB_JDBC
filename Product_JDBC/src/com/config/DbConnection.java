package com.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	public static Connection getConnection() {	
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","SAI@123");
		    System.out.println("connected");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
		
		
	}

}
