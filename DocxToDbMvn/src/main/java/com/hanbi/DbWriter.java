package com.hanbi;

import java.sql.SQLException;

public class DbWriter {

	public DbWriter() {
	}
	
	public static void importToDb() throws SQLException, ClassNotFoundException {
		ConnectionUtil connection = new ConnectionUtil();
		connection.connect();
		
		
	}
}
