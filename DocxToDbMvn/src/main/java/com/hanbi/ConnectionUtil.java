package com.hanbi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public ConnectionUtil() {
	}
	
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "aptx4869";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/docx";
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	
	public Connection connect() throws SQLException, ClassNotFoundException {
		Class.forName(JDBC_DRIVER);
		Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		return connection;
	}
	
}
