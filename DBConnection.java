package busreservation;

import java.sql.*;

public class DBConnection 
{
	public static final String url = "jdbc:mysql://localhost:3306/busreservation";
	public static final String username = "root";
	public static final String password = "root";
	
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(url, username, password);
	}
}
