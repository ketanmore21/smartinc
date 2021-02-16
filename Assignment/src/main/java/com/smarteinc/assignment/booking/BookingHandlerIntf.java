package com.smarteinc.assignment.booking;
public interface BookingHandlerIntf 
{
	public int bookTicket(Ticket x) throws Exception;
	public void sendTicketBookedMail(Ticket x) throws Exception;
}
