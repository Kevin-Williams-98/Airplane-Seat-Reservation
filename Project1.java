package proj1;
import javax.swing.JOptionPane;

/**
 * Title: Project1
 * Description: Instantiates an airplane object and sets up an interface for the user to reserve and cancel seats. They may also see the state of every seat and quit the program
 * at will. 
 * @author Kevin Williams
 *Helped by Jefrey Zavala
 */

public class Project1 
{

	public static void main (String Args[])
	{

		Airplane thePlane = new Airplane();

		boolean runIt = true;
		while(runIt)
		{
			String[] choices = {"Make a reservation", "Cancel a reservation", "Display a seating chart", "Quit"};
			int choice = JOptionPane.showOptionDialog(
					null,
					"Enter your choice...", 
					"Main Menu", 
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,
					choices, 
					choices[0]); 

			if(choice==0)
			{
				String[] choices0 = {"First Class","Coach"};
				int choice0 = JOptionPane.showOptionDialog(
						null,
						"Enter what type of seat you would like", 
						"Seat Type", 
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						choices0, 
						choices0[0]); 

				if(choice0==0)
				{
					if(thePlane.HowManyFCSeats()==0)
					{	
						JOptionPane.showMessageDialog(

								null,
								"There are currently no First Class seats available due to all of them being reserved.", 
								"Reserve Seat", 
								JOptionPane.INFORMATION_MESSAGE);
					}
					else
					{
						String[] choices00 = thePlane.checkingFirstClassSeatAvailability();
						int choice00 = JOptionPane.showOptionDialog(
								null,
								"Enter which seat you would like", 
								"First Class Seats", 
								JOptionPane.DEFAULT_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null,
								choices00, 
								choices0[0]); 
						int[] theSeatNumbersToReserve00 = new int[choices00.length];
						for(int i = 0; i<choices00.length;i++)
							theSeatNumbersToReserve00[i]= Integer.parseInt(choices00[i]);


						if(choice00==0)
						{
							thePlane.reserveFlight(theSeatNumbersToReserve00[0]);

							JOptionPane.showMessageDialog(
									null,
									"You have successfully reserved First Class Seat"+ " "+ theSeatNumbersToReserve00[0], 
									"Reserve Seat", 
									JOptionPane.INFORMATION_MESSAGE);
						}


						if(choice00==1)
						{
							thePlane.reserveFlight(theSeatNumbersToReserve00[1]);
							JOptionPane.showMessageDialog(
									null,
									"You have successfully reserved First Class Seat"+ " "+ theSeatNumbersToReserve00[1], 
									"Reserve Seat", 
									JOptionPane.INFORMATION_MESSAGE);
						}

						if(choice00==2)
						{
							thePlane.reserveFlight(theSeatNumbersToReserve00[2]);
							JOptionPane.showMessageDialog(
									null,
									"You have successfully reserved First Class Seat"+ " "+ theSeatNumbersToReserve00[2], 
									"Reserve Seat", 
									JOptionPane.INFORMATION_MESSAGE);
						}

						if(choice00==3)
						{
							thePlane.reserveFlight(theSeatNumbersToReserve00[3]);
							JOptionPane.showMessageDialog(
									null,
									"You have successfully reserved First Class Seat"+ " "+ theSeatNumbersToReserve00[3], 
									"Reserve Seat", 
									JOptionPane.INFORMATION_MESSAGE);
						}
					}

				}      
				else
				{
					String[]choices01 = thePlane.checkingCoachSeatAvailability();
					if(thePlane.HowManyCoachSeats()==0)
					{	
						JOptionPane.showMessageDialog(

								null,
								"There are currently no Coach seats available due to all of them being reserved.", 
								"Reserve Seat", 
								JOptionPane.INFORMATION_MESSAGE);
					}
					else
					{
						int choice01 = JOptionPane.showOptionDialog(
								null,
								"Enter which seat you would like", 
								"Coach Seats", 
								JOptionPane.DEFAULT_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null,
								choices01, 
								choices0[0]); 

						int[] theSeatNumbersToReserve01 = new int[choices01.length];
						for(int i = 0; i<choices01.length;i++)
							theSeatNumbersToReserve01[i]= Integer.parseInt(choices01[i]);

						if(choice01==0)
						{
							thePlane.reserveFlight(theSeatNumbersToReserve01[0]);
							JOptionPane.showMessageDialog(
									null,
									"You have successfully reserved Coach Seat"+ " "+ theSeatNumbersToReserve01[0], 
									"Reserve Seat", 
									JOptionPane.INFORMATION_MESSAGE);

						}

						if(choice01==1)
						{
							thePlane.reserveFlight(theSeatNumbersToReserve01[1]);
							JOptionPane.showMessageDialog(
									null,
									"You have successfully reserved Coach Seat"+ " "+ theSeatNumbersToReserve01[1], 
									"Reserve Seat", 
									JOptionPane.INFORMATION_MESSAGE);
						}

						if(choice01==2)
						{
							thePlane.reserveFlight(theSeatNumbersToReserve01[2]);
							JOptionPane.showMessageDialog(
									null,
									"You have successfully reserved Coach Seat"+ " "+ theSeatNumbersToReserve01[2], 
									"Reserve Seat", 
									JOptionPane.INFORMATION_MESSAGE);
						}

						if(choice01==3)
						{
							thePlane.reserveFlight(theSeatNumbersToReserve01[3]);
							JOptionPane.showMessageDialog(
									null,
									"You have successfully reserved Coach Seat"+ " "+ theSeatNumbersToReserve01[3],
									"Reserve Seat", 
									JOptionPane.INFORMATION_MESSAGE);
						}


						if(choice01==4)
						{
							thePlane.reserveFlight(theSeatNumbersToReserve01[4]);
							JOptionPane.showMessageDialog(
									null,
									"You have successfully reserved Coach Seat"+ " "+ theSeatNumbersToReserve01[4], 
									"Reserve Seat", 
									JOptionPane.INFORMATION_MESSAGE);
						}

						if(choice01==5)
						{
							thePlane.reserveFlight(theSeatNumbersToReserve01[5]);
							JOptionPane.showMessageDialog(
									null,
									"You have successfully reserved Coach Seat"+ " "+ theSeatNumbersToReserve01[5], 
									"Reserve Seat", 
									JOptionPane.INFORMATION_MESSAGE);
						}
					}
				}
			}
			if(choice==1)
			{
				if(thePlane.HowManySeatsCanICancel()==0)
				{
					JOptionPane.showMessageDialog(
							null,
							"There are currently no reserved seats so no seats can be cancelled ", 
							"Cancelling Seat", 
							JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					String[] choices1 = thePlane.checkWhichToCancel();
					int choice1 = JOptionPane.showOptionDialog(
							null,
							"Enter which seat you would like to cancel", 
							"Main Menu", 
							JOptionPane.DEFAULT_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null,
							choices1, 
							choices1[0]); 
					int [] seatNumsToCancel  = new int[choices1.length];

					for(int i = 0; i<choices1.length;i++)
						seatNumsToCancel[i]= Integer.parseInt(choices1[i]);
					if(choice1==0)
					{
						thePlane.cancelSeat(seatNumsToCancel[0]);
						String seatType;
						if(seatNumsToCancel[0]>4)
							seatType = "Coach";
						else
							seatType= "First Class";

						JOptionPane.showMessageDialog(
								null,
								"You have successfully cancelled "+seatType+ " seat "+  seatNumsToCancel[0], //text displayed within the window
								"Reserve Seat", //text displayed in the window's title bar
								JOptionPane.INFORMATION_MESSAGE);
					}
					else
					{
						if(choice1==1)

						{
							thePlane.cancelSeat(seatNumsToCancel[1]);
							String seatType;
							if(seatNumsToCancel[1]>4)
								seatType = "Coach";
							else
								seatType= "First Class";

							JOptionPane.showMessageDialog(
									null,
									"You have successfully cancelled "+seatType+ " seat "+  seatNumsToCancel[1], //text displayed within the window
									"Reserve Seat", //text displayed in the window's title bar
									JOptionPane.INFORMATION_MESSAGE);
						}
						else
						{
							if(choice1==2)

							{
								thePlane.cancelSeat(seatNumsToCancel[2]);
								String seatType;
								if(seatNumsToCancel[2]>4)
									seatType = "Coach";
								else
									seatType= "First Class";

								JOptionPane.showMessageDialog(
										null,
										"You have successfully cancelled "+seatType+ " seat "+  seatNumsToCancel[2], //text displayed within the window
										"Reserve Seat", //text displayed in the window's title bar
										JOptionPane.INFORMATION_MESSAGE);
							}

							else
							{
								if(choice1==3)

								{
									thePlane.cancelSeat(seatNumsToCancel[3]);
									String seatType;
									if(seatNumsToCancel[3]>4)
										seatType = "Coach";
									else
										seatType= "First Class";

									JOptionPane.showMessageDialog(
											null,
											"You have successfully cancelled "+seatType+ " seat "+  seatNumsToCancel[3], //text displayed within the window
											"Reserve Seat", //text displayed in the window's title bar
											JOptionPane.INFORMATION_MESSAGE);

								}
								else
								{
									if(choice1==4)
									{
										thePlane.cancelSeat(seatNumsToCancel[4]);
										String seatType;
										if(seatNumsToCancel[4]>4)
											seatType = "Coach";
										else
											seatType= "First Class";

										JOptionPane.showMessageDialog(
												null,
												"You have successfully cancelled "+seatType+ " seat "+  seatNumsToCancel[4], //text displayed within the window
												"Reserve Seat", //text displayed in the window's title bar
												JOptionPane.INFORMATION_MESSAGE);
									}
									else
									{
										if(choice1==5)
										{
											//for(int i = 0; i<seatNumsToCancel.length;i++)	
											//{


											thePlane.cancelSeat(seatNumsToCancel[5]);
											String seatType;
											if(seatNumsToCancel[5]>4)
												seatType = "Coach";
											else
												seatType= "First Class";

											JOptionPane.showMessageDialog(
													null,
													"You have successfully cancelled "+seatType+ " seat "+  seatNumsToCancel[5], //text displayed within the window
													"Reserve Seat", //text displayed in the window's title bar
													JOptionPane.INFORMATION_MESSAGE);

										}

										else
										{
											if(choice1==6)

											{
												//for(int i = 0; i<seatNumsToCancel.length;i++)	
												//{


												thePlane.cancelSeat(seatNumsToCancel[6]);
												String seatType;
												if(seatNumsToCancel[0]>4)
													seatType = "Coach";
												else
													seatType= "First Class";

												JOptionPane.showMessageDialog(
														null,
														"You have successfully cancelled "+seatType+ " seat "+  seatNumsToCancel[6], //text displayed within the window
														"Reserve Seat", //text displayed in the window's title bar
														JOptionPane.INFORMATION_MESSAGE);
											}
										}
									}
								}
							}
						}

					}
				}
			}
			if(choice==2)
			{
				JOptionPane.showMessageDialog(
						null,
						thePlane.toString() , //text displayed within the window
						"Seating Chart", //text displayed in the window's title bar
						JOptionPane.INFORMATION_MESSAGE);
			}
			if(choice==3)
			{
				runIt=false;
			}
		}
	}
}