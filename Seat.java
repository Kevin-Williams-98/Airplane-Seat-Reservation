package proj1;
/**
 * Title : The Seat Class 
 * The Seat class has instance variables seatNumber and seatType. Has methods such as getSeatNumber,getSeatType,isSeatEmpty,reserveSeat,cancelSeat, and a 
 * toString method to return the state of the seat object
 * @author Kevin Williams 
 * Helped by Jefrey Zavala
 */
public class Seat {

	boolean seatIsOccupied ;
	int seatNum;
	String seatType;

	/**
	 * parameterized constructor for a seat object 
	 * @param theSeatNum is the number on the seat
	 * @param theSeatType refers to whether the seat is first or coach class
	 */
	public Seat (int theSeatNum, String theSeatType)
	{
		seatNum=theSeatNum;
		seatType=theSeatType;
		seatIsOccupied=false;
	}

	/**
	 * The getSeatNumber method
	 * An accessor method for the seat number 
	 * @return the seat number 
	 */
	public int getSeatNumber()
	{
		return seatNum;
	}
	/**
	 *  The getSeatType method
	 *  accessor method for the seat type
	 * @return the seat type
	 */
	public String getSeatType()
	{

		return seatType;
	}
	/**
	 * the isSeatEmpty method
	 * checks if the seat is occupied
	 * @return false if it is occupied and true if it is not 
	 */
	public boolean isSeatEmpty()
	{
		if(seatIsOccupied==true)
			return false;
		else 
			return true;
	}
	/**
	 * reserveSeat method
	 * changes the seat from being free to occupied by changing the boolean operator 
	 */
	public void reserveSeat()
	{
		seatIsOccupied=true;
	}
	/**
	 * cancelSeat method
	 * The cancel seat method undoes a seat already occupied 
	 */
	public void cancelSeat()
	{
		seatIsOccupied = false;
	}
	/**
	 * toString method
	 * @returns a reference to a string whose contents hold the current state of the seat object
	 */
	public String toString()
	{
		String str = new String();
		if (seatIsOccupied==true)
			str= "The seat number " +seatNum+ " is occupied and is a "+ seatType + " seat" ;
		else
			str = "The Seat number "+seatNum+" is not occupied and is a " + seatType + " seat";

		return str;
	}
}
