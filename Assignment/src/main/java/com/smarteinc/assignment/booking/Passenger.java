package com.smarteinc.assignment.booking;

public class Passenger {
	private String name;
	
	//Added to make this class singleton
	private static Passenger _oPassenger;
	
	public static Passenger getInstance()
	{
		if(_oPassenger == null)
		{
			_oPassenger = new Passenger();
			return _oPassenger;
		}
		else
			return _oPassenger;
    }
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
