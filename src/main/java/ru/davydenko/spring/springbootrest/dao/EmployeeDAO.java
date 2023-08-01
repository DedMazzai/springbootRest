package ru.davydenko.spring.springbootrest.dao;

import ru.davydenko.spring.springbootrest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    Employee getEmployee(int id);

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    void deleteEmployee(int id);
}
