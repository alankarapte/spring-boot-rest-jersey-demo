package com.alankar.springbootrestjerseydemo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alankar.springbootrestjerseydemo.dao.EmployeeDAO;
import com.alankar.springbootrestjerseydemo.model.Employee;

@SpringBootApplication
public class SpringBootRestJerseyDemoApplication {

	@Autowired
	private EmployeeDAO employeeDAO;

	@PostConstruct
	public void initDb() {
		employeeDAO.saveAll(Stream.of( 
				new Employee(1, "Alankar", "DEV"),
				new Employee(2, "Sneha", "HR"),
				new Employee(3, "Venky", "DEV"),
				new Employee(4, "Rajesh", "DEV"),
				new Employee(5, "Dnyanada", "QA"))
				.collect(Collectors.toList())
				);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestJerseyDemoApplication.class, args);
	}

}
