package ru.davydenko.spring.springbootrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.davydenko.spring.springbootrest.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository <Employee, Integer>{
    List<Employee> findByName(String name);
}
