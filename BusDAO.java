package busreservation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusDAO 
{
	public void displayBusInfo() throws SQLException
	{
		String query = "Select * from bus";
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println("Bus no :"+rs.getInt(1));
			System.out.println("Sleeper : Yes");
			System.out.println("Capacity :"+rs.getInt(3));
			System.out.println();
		}
		System.out.println("..........................");
	}
	public int getCapacity(int id) throws SQLException
	{
		String query = "Select capacity from bus where id=" +id;
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
	}
}