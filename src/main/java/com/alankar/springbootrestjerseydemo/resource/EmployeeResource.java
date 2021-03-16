package com.alankar.springbootrestjerseydemo.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import com.alankar.springbootrestjerseydemo.dao.EmployeeDAO;
import com.alankar.springbootrestjerseydemo.model.Employee;

@Path("/api")
public class EmployeeResource {

	@Autowired
	private EmployeeDAO employeeDAO;

	@POST
	@Consumes(MediaType.APPLICATION_JSON_VALUE)
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	@Path("/employees")
	public Employee saveEmployee(Employee employee) {
		return employeeDAO.save(employee);
	}

	@GET
	@Consumes(MediaType.APPLICATION_JSON_VALUE)
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	@Path("/employees")
	public List<Employee> getAllEmployee() {
		return employeeDAO.findAll();
	}

	@GET
	@Consumes(MediaType.APPLICATION_JSON_VALUE)
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	@Path("/employees/name/{name}")
	public Employee getAllEmployee(@PathParam("name") String name) {
		return employeeDAO.findByName(name).get();
	}
}
