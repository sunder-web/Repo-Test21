package com.banking.bankingData.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "com.banking")
@EnableMongoRepositories("com.banking.repository")
@Configuration
public class BankingDataApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(BankingDataApplication.class, args);
	}

}
