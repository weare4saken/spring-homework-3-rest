package weare4saken.dao;

import weare4saken.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getEmployees();
    Employee getEmployeeById(int id);
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);

}