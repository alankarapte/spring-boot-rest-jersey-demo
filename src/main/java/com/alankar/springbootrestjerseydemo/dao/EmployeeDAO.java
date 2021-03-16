package com.alankar.springbootrestjerseydemo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alankar.springbootrestjerseydemo.model.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
	Optional<Employee> findByName(String name);
}
