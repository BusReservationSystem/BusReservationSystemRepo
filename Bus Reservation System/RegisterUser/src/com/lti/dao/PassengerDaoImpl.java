package com.lti.dao;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.lti.model.Passenger;
import com.lti.utils.Utils;

public class PassengerDaoImpl implements PassengerDao {
	private EntityManager entityManager;
	
	
	
	public PassengerDaoImpl() {
		entityManager = Utils.getEntityManager();
	}


	@Override
	public int RegisterPassenger(Passenger passenger,String password) {
		String sql1 = "insert into passenger(passenger_id,passenger_name,passenger_email,passenger_phone,passenger_age,passenger_gender) values (passenger_id_seq.nextval,:name,:email,:phone,:age,:gender)";
		String sql2 = "insert into credentials(credential_id ,username,password,passenger_id) values(cred_cred_id.nextval,:email,:password,passenger_id_seq.currval)";
		Query query1 = entityManager.createNativeQuery(sql1);
		Query query2 = entityManager.createNativeQuery(sql2);
		
		query1.setParameter("name", passenger.getPassengerName());
		query1.setParameter("email", passenger.getPassengerEmail());
		query1.setParameter("phone", passenger.getPassengerPhoneNumber());
		query1.setParameter("age", passenger.getPassengerAge());
		query1.setParameter("gender", passenger.getPassengerGender());
		
		query2.setParameter("email", passenger.getPassengerEmail());
		query2.setParameter("password", password);
		
	
		int passengerResult = query1.executeUpdate();
		int credentialResult = query2.executeUpdate();
		if(passengerResult==1 && credentialResult==1){
			return 1;
		}
		else{
			return 0;
		}
		
		
	}


	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public void rollbackTransaction() {
		entityManager.getTransaction().rollback();
	}

}
