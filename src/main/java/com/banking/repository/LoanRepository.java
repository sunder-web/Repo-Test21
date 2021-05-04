package com.banking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.banking.entity.LoanDetails;

@Repository
@Component
public interface LoanRepository extends MongoRepository<LoanDetails,String>{
	
	
	public LoanDetails findBySSN(String SSN);
}
