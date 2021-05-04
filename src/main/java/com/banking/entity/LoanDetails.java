package com.banking.entity;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanDetails 
{
	public String Name;
	public	String SSN;
	public	String DOB;
	public double loanAmount;
	public double rate;
	public int term;
	public String type;
	public double APR;
}
