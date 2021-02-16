package com.smarteinc.assignment.booking;

public class BookCarTicket implements BookingHandlerIntf {

	@Override
	public int bookTicket(Ticket x) throws Exception {
		BookingApp _oBookingApp = BookingApp.getInstance();
		_oBookingApp.validateAllFieldsPresent(x);
		System.out.println("You Have Applied For Car Ticket...");
		sendTicketBookedMail(x);
		return x.getType();
	}
	
	@Override
	public void sendTicketBookedMail(Ticket x) throws Exception {
		System.out.println("Hello Sir, Your Ticket For The Car Has Been Booked....");
		if (x.getType() != 1 && x.getType() != 2){
			System.out.println("Hello Sir, Please Correct The Option.... 1. For Bus 2. For Car");
		}
	}

}
