package org.example.spring_data_jpa.employee.repository;

import org.example.spring_data_jpa.employee.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Employee, String> {
}
