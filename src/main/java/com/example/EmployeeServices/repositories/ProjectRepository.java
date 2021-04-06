package com.example.EmployeeServices.repositories;

import com.example.EmployeeServices.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
