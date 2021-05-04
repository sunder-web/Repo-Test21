package com.banking.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.entity.LoanDetails;
import com.banking.repository.LoanRepository;
import ch.qos.logback.classic.Logger;

@Service
public class LoanService 
{
	@Autowired
	LoanRepository loanRepository;
	
	Logger logger=(Logger) LoggerFactory.getLogger(LoanService.class);
	public LoanDetails insertData(LoanDetails loanDetails)
	{
		double intrest = (loanDetails.loanAmount * loanDetails.rate * loanDetails.term) /100;
		//write formula for APR here and insert the data into Database 
		int fee=0;
		if(loanDetails.type.equalsIgnoreCase("AUTO"))
			fee=500;
		else if(loanDetails.type.equalsIgnoreCase("Personal"))
			fee=750;
		else if(loanDetails.type.equalsIgnoreCase("MORTGAGE"))
			fee=1500;
		
		double amount=(fee+intrest)/(loanDetails.loanAmount);
		loanDetails.setAPR((amount/loanDetails.term)*365*100);
//		System.out.println(loanDetails.APR);
//		System.out.println(loanDetails.loanAmount);
//		System.out.println(loanRepository);
		loanRepository.save(loanDetails);
		return loanDetails;
	}
	
	public LoanDetails getLoanDetails(String SSN)
	{
		return loanRepository.findBySSN(SSN);
	}
}
