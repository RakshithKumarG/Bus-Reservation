package busreservation;
import java.util.Scanner;
import java.sql.SQLException;
public class BusDemo 
{
	public static void main(String[] args) throws SQLException 
	{

		BusDAO busdao = new BusDAO();
		try 
		{
		busdao.displayBusInfo();
		
		int userOpt =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to RK Travels");
		System.out.println("Current services to Bangalore, Mangalore, Karkala, Kasargode");

		while(userOpt == 1)
		{
		System.out.println("Enter 1 to book and 2 to exit");
		userOpt = sc.nextInt();
		if(userOpt == 1)
		{
			Booking booking = new Booking();
			if(booking.isAvailable())
			{
				BookingDAO bookingdao = new BookingDAO();
				bookingdao.addBooking(booking);
				System.out.println("Your booking is confirmed");
			}
			else
			{
				System.out.println("No seats available");
			}
		}
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}
