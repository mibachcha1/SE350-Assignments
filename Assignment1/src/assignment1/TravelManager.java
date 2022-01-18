package assignment1;

import java.util.Date;

import exceptions.IllegalParameterException;

public class TravelManager {

	public static void main(String[] args) {
		Airport origin = null;
		Airport destination = null;
		Airline airline = null;
		Flight flight = null;
		try {
			origin = new Airport("ORD");
			destination = new Airport("LAX");
			airline = new Airline("Spirit");
			flight = new Flight(airline,origin,destination,new Date("1/13/2022 12:30:00"));
		} catch (IllegalParameterException e) {
			System.out.println(e);
		}

		System.out.println(flight);
	}

}
