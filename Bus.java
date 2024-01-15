package busreservation;

public class Bus 
{
	private int busNo;
	private boolean sleeper;
	private int capacity;
	public Bus(int busNo, boolean sleeper, int capacity) 
	{
		super();
		this.busNo = busNo;
		this.sleeper = sleeper;
		this.capacity = capacity;
	}
	public int getBusNo() 
	{
		return busNo;
	}
	public boolean isSleeper() 
	{
		return sleeper;
	}
	public void setSleeper(boolean sleeper) 
	{
		this.sleeper = sleeper;
	}
	public int getCapacity() 
	{
		return capacity;
	}
	public void setCapacity(int capacity) 
	{
		this.capacity = capacity;
	}
//	public void displayBusInfo()
//	{
//		System.out.println("Bus no :"+ busNo + " Sleeper :"+ sleeper + " Capacity:" + capacity);
//	}
	
}
