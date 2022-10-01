package com.example.productdetailsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EnableMongoRepositories(basePackageClasses = ProductRepo.)
public class ProductdetailsserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductdetailsserviceApplication.class, args);
	}

}
