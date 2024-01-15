package busreservation;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking 
{
	String passengerName;
	int busNo;
	Date date;
	Booking()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter passenger's name");
		passengerName = sc.next();
		System.out.println("Enter Bus no");
		busNo = sc.nextInt();
		System.out.println("Enter date of journey dd-mm-yyyy");
		String dateInput = sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try 
		{
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) 
		{
			e.printStackTrace();
		}
		
	}
	public boolean isAvailable() throws SQLException
	{
		BusDAO busdao = new BusDAO();
		int capacity = busdao.getCapacity(busNo);
		BookingDAO bookingdao = new BookingDAO();
		int booked = bookingdao.getBookedCount(busNo,date);

		return booked<capacity;
	}
}
