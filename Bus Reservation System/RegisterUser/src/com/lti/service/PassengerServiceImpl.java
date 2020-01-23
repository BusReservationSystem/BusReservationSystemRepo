package com.lti.service;

import com.lti.dao.PassengerDao;
import com.lti.dao.PassengerDaoImpl;
import com.lti.model.Passenger;

public class PassengerServiceImpl implements PassengerService {
	private PassengerDao dao;
	
	
	public PassengerServiceImpl() {
		dao=new PassengerDaoImpl();
	}


	@Override
	public boolean RegisterPassenger(Passenger passenger,String password) {
		dao.beginTransaction();
		int result = dao.RegisterPassenger(passenger,password);
		if(result==1){
			dao.commitTransaction();
			return true;
		}
		else{
			dao.rollbackTransaction();
			return false;
		}
	}

}
