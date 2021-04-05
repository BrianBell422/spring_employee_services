package com.example.EmployeeServices.repositories;

import com.example.EmployeeServices.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
