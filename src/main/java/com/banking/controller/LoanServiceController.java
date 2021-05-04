package com.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.entity.LoanDetails;
import com.banking.service.LoanService;

@CrossOrigin
@RestController
@RequestMapping("/banking")
public class LoanServiceController 
{
	@Autowired(required = true)
	LoanService loanService;
	
	@PostMapping("/saveLoanDetails")
	public LoanDetails saveLoanDetails(@RequestBody LoanDetails loanDetails)
	{
		System.out.println(loanDetails);
		return loanService.insertData(loanDetails);
	}
	@GetMapping("/fetchLoanDetails/{SSN}")
	public LoanDetails getLoanDeatils(@PathVariable("SSN") String SSN)
	{
		return loanService.getLoanDetails(SSN);
	}
}
