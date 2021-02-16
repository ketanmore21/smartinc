package com.smarteinc.assignment.booking;

import java.util.Objects;

public class BookingApp {
	
	//Added to make this class singleton
	private static BookingApp _oBookingApp;
	
	public static BookingApp getInstance()
	{
		if(_oBookingApp == null)
		{
			_oBookingApp = new BookingApp();
			return _oBookingApp;
		}
		else
			return _oBookingApp;
    }
	
//Modified whole method to use factory pattern	
public int bookingProcess(Ticket x) throws Exception {
	int type;
	if (x.getType() != 1 && x.getType() != 2) {
		throw new IllegalArgumentException("Only type 1 and 2 tickets are supported");
	}
	else
	{
		BookingHandlerIntf handler = BookingHandlerFactory.getBookingHandler(x);
		type = handler.bookTicket(x);
	}
	
	return type;
}

//Commented as we have removed direct call
/*private void bookCarTicket(Ticket x) {
	System.out.println("You Have Applied For Car Ticket...");
}

private void bookBusTicket(Ticket x) {
	System.out.println("You Have Applied For Bus Ticket...");
}*/


/*private void sendTicketBookedMail(Ticket x) {
	if(x.getType() == 1) {
		System.out.println("Hello Sir, Your Ticket For The Bus Has Been Booked....");
	}
	else if(x.getType() == 2) {
		System.out.println("Hello Sir, Your Ticket For The Car Has Been Booked....");
	}
	else if (x.getType() != 1 && x.getType() != 2){
		System.out.println("Hello Sir, Please Correct The Option.... 1. For Bus 2. For Car");
	}
}*/

//Ensure all input data is present
void validateAllFieldsPresent(Ticket ticket) {
	Objects.requireNonNull(ticket);
	Objects.requireNonNull(ticket.getStartDate());
	Objects.requireNonNull(ticket.getEndDate());
	
	Objects.requireNonNull(ticket.getFrom());
	Objects.requireNonNull(ticket.getDestination());
	Objects.requireNonNull(ticket.getPassenger());
	
}
}


