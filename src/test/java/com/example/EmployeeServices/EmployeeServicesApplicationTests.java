package com.example.EmployeeServices;

import com.example.EmployeeServices.models.Employee;
import com.example.EmployeeServices.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeServicesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee brian = new Employee("Brian", 33, 101, "brian@brian.com");
		employeeRepository.save(brian);
	}

}
