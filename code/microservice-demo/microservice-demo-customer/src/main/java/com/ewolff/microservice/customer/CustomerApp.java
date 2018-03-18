package com.ewolff.microservice.customer;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
@EnableAutoConfiguration
@EnableDiscoveryClient
@Component
public class CustomerApp {

	private final CustomerRepository customerRepository;

	@Autowired
	public CustomerApp(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@PostConstruct
	public void generateTestData() {
		customerRepository.save(new Customer("Yamil", "Urbina",
				"yamil.urbina@gmail.com", "Cochabamba", "Bolivia"));
		customerRepository.save(new Customer("Richard", "Lopez",
				"richard.lopez@jalasoft.com", "Cochabamba", "Bolivia"));
		customerRepository.save(new Customer("Martin", "Michalsky",
				"martin.michalsky@gmail.com", "Cochabamba", "Bolivia"));
		customerRepository.save(new Customer("Julio", "Silva",
				"julio.silva@gmail.com", "Cochabamba", "Bolivia"));
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomerApp.class, args);
	}

}
