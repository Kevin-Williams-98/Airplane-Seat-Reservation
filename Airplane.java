package proj1;
/**
 * Title: The Airplane Class
 * Description : The Airplane Class has an array of seat objects and has methods to count how many firstClassSeats or coachClassSeats are available. 
 * Also has a method to count the number of seats that are occupied. It also contains methods to return a string array for first, coach, or reserved seats to be used in app 
 * class.Lastly there is a toString method that returns a reference to a String containing the State of the plane.
 * @author Kevin Williams 
 * Helped by Jefery Zavala
 */
public class Airplane 
{

	private Seat[] theSeats;
	private int seatNum;
	private Seat[]theFirstClassSeats;
	private Seat[]theCoachSeats;
	private Seat[]cancelEm;

	/**
	 * Default Constructor for an Airplane object;
	 */
	public Airplane ()
	{
		theSeats = new Seat[10];
		for(int i = 0;i<theSeats.length;i++)
		{
			seatNum = i+1;
			if (i<4)
				theSeats[i]= new Seat(seatNum,"First Class");
			else
				theSeats[i]=new Seat(seatNum,"Coach");
		}
	}

	/**
	 * HowManyFCSeats method
	 * the how many first class seat method finds how many first class seats are available
	 * @return the integer number of how many first class seats are available
	 */
	public int HowManyFCSeats()
	{
		int howMany = 0;
		for(int i = 0; i<theSeats.length;i++)
		{
			if((theSeats[i].getSeatType()).equals("First Class")&&(theSeats[i].isSeatEmpty()==true))
				howMany = howMany+1;
		}
		return howMany;
	}

	/**
	 * CheckingFirstClassSeatAvailibilty method
	 * instantiates a seat array of the size of first class seats that are currently available, then stores the address of that array within theFirstClassSeats.
	 * It then checks each seat in the first class to see if they are empty. if they are the address of the seat is stored in the next available index of theFirstClassSeats.
	 * A string array is then created and the substring that grabs the number of the seat from the toString of the seat to store it in the next available index of the string Array;
	 * 
	 * @return strArray to be used as buttons in the app class.
	 */
	public String[] checkingFirstClassSeatAvailability()
	{
		int counter = 0;
		theFirstClassSeats = new Seat[this.HowManyFCSeats()];

		if(theSeats[0].isSeatEmpty()==true)
		{
			theFirstClassSeats[counter]= theSeats[0];
			counter=counter+1;
		}

		if(theSeats[1].isSeatEmpty()==true)
		{
			theFirstClassSeats[counter]= theSeats[1];
			counter = counter+1;
		}

		if(theSeats[2].isSeatEmpty()==true)
		{
			theFirstClassSeats[counter]= theSeats[2];
			counter=counter+1;
		}

		if(theSeats[3].isSeatEmpty()==true)
		{
			theFirstClassSeats[counter]= theSeats[3];
			counter=counter+1;
		}
		//counter=counter+1;
		String[] strArray = new String[theFirstClassSeats.length] ;

		for(int i = 0;i<theFirstClassSeats.length;i++)
		{
			strArray[i]= (theFirstClassSeats[i].toString()).substring(16,17);
		}
		return strArray;
	}

	/**
	 * HowManyCoachSeats method
	 * checks how many coach seats can be requested 
	 * @return integer number of coach seats that can be requested
	 */
	public int HowManyCoachSeats()
	{
		int howMany = 0;
		for(int i = 0; i<theSeats.length;i++)
		{
			if((theSeats[i].getSeatType()).equals("Coach")&&(theSeats[i].isSeatEmpty()==true))
				howMany = howMany+1;
		}
		return howMany;
	}

	/**
	 * CheckingCoachSeatAvailibilty method
	 * instantiates a seat array of the size of coach class seats that are currently available, then stores the address of that array within theCoachSeats.
	 * It then checks each seat in the Coach class to see if they are empty. if they are the address of the seat is stored in the next available index of theCoachSeats.
	 * A string array is then created and the substring that grabs the number of the seat from the toString of the seat to store it in the next available index of the string Array;
	 * 
	 * @return strArray to be used as buttons in the app class.
	 */

	public String[] checkingCoachSeatAvailability()
	{

		theCoachSeats = new Seat[this.HowManyCoachSeats()];
		int counter = 0;
		if(theSeats[4].isSeatEmpty()==true)
		{
			theCoachSeats[counter]= theSeats[4];
			counter=counter+1;
		}

		if(theSeats[5].isSeatEmpty()==true)
		{
			theCoachSeats[counter]= theSeats[5];
			counter=counter+1;
		}

		if(theSeats[6].isSeatEmpty()==true)
		{
			theCoachSeats[counter]= theSeats[6];
			counter=counter+1;
		}

		if(theSeats[7].isSeatEmpty()==true)
		{
			theCoachSeats[counter]= theSeats[7];
			counter=counter+1;
		}

		if(theSeats[8].isSeatEmpty()==true)
		{
			theCoachSeats[counter]= theSeats[8];
			counter=counter+1;
		}

		if(theSeats[9].isSeatEmpty()==true)
		{
			theCoachSeats[counter]= theSeats[9];
			counter=counter+1;
		}
		String[] strArray = new String[theCoachSeats.length] ;
		for(int i = 0;i<theCoachSeats.length;i++)
		{
			String theIndexAfter =((theCoachSeats[i].toString()).substring(17,18));
			if(theIndexAfter.equals("0"))
				strArray[i]= (theCoachSeats[i].toString()).substring(16,18);
			else
				strArray[i]= (theCoachSeats[i].toString()).substring(16,17);

		}
		return strArray;
	}

	/**
	 * reserveFlight method
	 * reserves a flight for passenger by seat number
	 * @param youWantWhichSeat is the seat the passenger would select
	 */
	public void reserveFlight(int youWantWhichSeat)
	{
		theSeats[youWantWhichSeat-1].reserveSeat();
	}

	/**
	 * HowManySeatsCanICancel method
	 * finds the number of seats that are currently reserved
	 * @return number of seats that are reserved
	 */
	public int HowManySeatsCanICancel()
	{
		int howMany = 0;
		for(int i = 0; i<theSeats.length;i++)
		{
			if(theSeats[i].isSeatEmpty()==false)
				howMany = howMany+1;
		}
		return howMany;
	}

	/**
	 * checkWhichToCancel method
	 * 
	 * checkWhichToCancel method
	 * instantiates a seat array of the size of how many seats that are currently reserved, then stores the address of that array within cancelEm.
	 * It then checks each seat in the entire plane to see if they are reserved. if they are the address of the seat is stored in the next available index of cancelEm.
	 * A string array is then created and the substring that grabs the number of the seat from the toString of the seat to store it in the next available index of the string Array;
	 * 
	 * @return strArray to be used as buttons in the app class.
	 */

	public String[] checkWhichToCancel()
	{
		int counter= 0;
		cancelEm = new Seat[this.HowManySeatsCanICancel()];

		if(theSeats[0].isSeatEmpty()==false)
		{
			cancelEm[counter]= theSeats[0];
			counter=counter+1;
		}

		if(theSeats[1].isSeatEmpty()==false)
		{
			cancelEm[counter]= theSeats[1];
			counter=counter+1;
		}

		if(theSeats[2].isSeatEmpty()==false)
		{
			cancelEm[counter]= theSeats[2];
			counter=counter+1;
		}

		if(theSeats[3].isSeatEmpty()==false)
		{
			cancelEm[counter]= theSeats[3];
			counter=counter+1;
		}

		if(theSeats[4].isSeatEmpty()==false)
		{
			cancelEm[counter]= theSeats[4];
			counter=counter+1;
		}

		if(theSeats[5].isSeatEmpty()==false)
		{
			cancelEm[counter]= theSeats[5];
			counter=counter+1;
		}

		if(theSeats[6].isSeatEmpty()==false)
		{
			cancelEm[counter]= theSeats[6];
			counter=counter+1;
		}

		if(theSeats[7].isSeatEmpty()==false)
		{
			cancelEm[counter]= theSeats[7];
			counter=counter+1;
		}

		if(theSeats[8].isSeatEmpty()==false)
		{

			cancelEm[counter]= theSeats[8];
			counter=counter+1;
		}

		if(theSeats[9].isSeatEmpty()==false)
		{
			cancelEm[counter]= theSeats[9];
			counter=counter+1;
		}
		String[] strArray = new String[cancelEm.length] ;
		for(int i = 0;i<cancelEm.length;i++)
		{
			String theIndexAfter =((cancelEm[i].toString()).substring(17,18));

			if(theIndexAfter.equals("0"))
				strArray[i]= (cancelEm[i].toString()).substring(16,18);
			else
				strArray[i]= (cancelEm[i].toString()).substring(16,17);

		}
		return strArray;
	}

	/**
	 * cancelSeat method
	 * cancels a reserved seat by using the seat number passed
	 * @param youDontWantThatSeat seat number the user wants to cancel
	 */
	public void cancelSeat(int youDontWantThatSeat)
	{
		theSeats[youDontWantThatSeat-1].cancelSeat();
	}

	/**
	 * toString method
	 * @return str a reference to aString containing the state of each seat in the airplane.
	 */
	public String toString()
	{
		String str = new String();
		for(int i = 0;i<theSeats.length;i++)
			str= str +"\n"+ theSeats[i].toString();
		return str;
	}
}






























