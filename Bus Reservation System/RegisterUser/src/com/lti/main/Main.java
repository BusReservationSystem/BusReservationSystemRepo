package com.lti.main;


import com.lti.model.Passenger;
import com.lti.service.PassengerService;
import com.lti.service.PassengerServiceImpl;

public class Main {

	public static void main(String[] args) {
		Passenger passenger =new Passenger();
		passenger.setPassengerName("Krishna");
		passenger.setPassengerEmail("krishna@gmail.com");
		passenger.setPassengerAge(24);
		passenger.setPassengerGender('M');
		passenger.setPassengerPhoneNumber("9652600864");
		PassengerService service= new PassengerServiceImpl();
		
		String password = "krishna@123";
		boolean result= service.RegisterPassenger(passenger,password);
		if(result){
			System.out.println("User Registered");
		}
	}

}
