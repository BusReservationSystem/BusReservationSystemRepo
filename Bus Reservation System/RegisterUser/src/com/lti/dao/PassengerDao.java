package com.lti.dao;

import com.lti.model.Passenger;

public interface PassengerDao {

	public int RegisterPassenger(Passenger passenger,String password);
	public void beginTransaction();
	public void commitTransaction();
	public void rollbackTransaction();
}
