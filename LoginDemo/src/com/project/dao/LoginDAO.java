package com.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class LoginDAO {
	public boolean check(String uname, String pass) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			try {
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
				PreparedStatement statement = conn.prepareStatement("select * from USER_DETAILS where "
						+ "username=? and password=?");
				statement.setString(1, uname);
				statement.setString(2, pass);
				ResultSet rs = statement.executeQuery();
				
				if(rs.next()) {
					return true;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
