package com.smarteinc.assignment.booking;

public class BookingHandlerFactory {
	
	public static BookingHandlerIntf getBookingHandler(Ticket x) throws Exception{
		
		BookingHandlerIntf handler = null;
		
		if(x.getType() == 1) {
			handler = new BookBusTicket();
		}
		else if(x.getType() == 2) {
			handler = new BookCarTicket();
		}
		return handler;
	}

}
