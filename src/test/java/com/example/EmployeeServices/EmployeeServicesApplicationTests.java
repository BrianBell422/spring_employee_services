package com.example.EmployeeServices;

import com.example.EmployeeServices.models.Department;
import com.example.EmployeeServices.models.Employee;
import com.example.EmployeeServices.models.Project;
import com.example.EmployeeServices.repositories.DepartmentRepository;
import com.example.EmployeeServices.repositories.EmployeeRepository;
import com.example.EmployeeServices.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeServicesApplicationTests {

	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment() {
		Department department = new Department("Technology");
		departmentRepository.save(department);

		Employee employee = new Employee("Brian", 33, 101, "brian@brian.com", department);
		employeeRepository.save(employee);
	}

	@Test
	public void addEmployeesAndProjects() {
		Department department = new Department("Technology");
		departmentRepository.save(department);

		Employee employee = new Employee("Brian", 33, 101, "brian@brian.com", department);
		employeeRepository.save(employee);

		Project project = new Project("Big Project", 7);
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);
	}



}
