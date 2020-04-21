package com.as.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;


public class ConnectDB {
	

	static String databaseName = "";
	static String url = "jdbc:mysql://localhost:3306/" +databaseName;
	
	static String user = "root";
	static String pass = "WYing2402";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, user, pass);
				Statement stmt = con.createStatement();
				
				stmt.execute("insert into test value('1')");
				System.out.print("dsfhg");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
		

	}

}
