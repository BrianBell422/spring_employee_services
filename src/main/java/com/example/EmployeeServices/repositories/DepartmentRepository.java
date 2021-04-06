package com.example.EmployeeServices.repositories;

import com.example.EmployeeServices.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
