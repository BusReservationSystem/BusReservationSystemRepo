package com.lti.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passenger")
public class Passenger {
	@Id
	@Column(name="passenger_id")
	private int passengerId;
	@Column(name="passenger_name")
	private String passengerName;
	@Column(name="passenger_email")
	private String passengerEmail;
	@Column(name="passenger_phone")
	private String passengerPhoneNumber;
	@Column(name="passenger_age")
	private int passengerAge;
	@Column(name="passenger_gender")
	private char passengerGender;
	
	public Passenger() {
	
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerEmail() {
		return passengerEmail;
	}

	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}

	public String getPassengerPhoneNumber() {
		return passengerPhoneNumber;
	}

	public void setPassengerPhoneNumber(String passengerPhoneNumber) {
		this.passengerPhoneNumber = passengerPhoneNumber;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public char getPassengerGender() {
		return passengerGender;
	}

	public void setPassengerGender(char passengerGender) {
		this.passengerGender = passengerGender;
	}	


	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", passengerEmail="
				+ passengerEmail + ", passengerPhoneNumber=" + passengerPhoneNumber + ", passengerAge=" + passengerAge
				+ ", passengerGender=" + passengerGender + "]";
	}
	
	
	
	
	 
}
