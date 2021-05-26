package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {
	private static final String CONNECTION_USERNAME = "postgres";
	private static final String CONNECTION_PASSWORD = "password";
	
	// URL connection follows
	//protocol
	
	private static final String CONNECTION_URL = "jdbc:postgres://localhost:5432/bankapp";
	

	public static void main (String [] args) {
		try {
			Class.forName("org,postgresql.Driver");
		}catch(ClassNotFoundException e) {
			System.out.print("Could not register driver!");
			e.printStackTrace();
		}
		try { Connection connection = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
		}catch(SQLException ex) {
			System.out.print("Faliure");
			ex.printStackTrace();
		}
		
		
	}
}
