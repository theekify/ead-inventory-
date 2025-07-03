package com.example.Inventory.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployee(int eid) {
        return employeeRepository.findById(eid).isPresent() ? employeeRepository.findById(eid).get() : null;
    }

    @Transactional
    public Employee updateEmployee(int eid, String name, int age, String email, String occupation) {
        Employee employee = employeeRepository.findById(eid).orElseThrow(() -> new IllegalStateException("Employee with id does not exist"));

        if (name != null && name.length() > 0 && !Objects.equals(employee.getName(), name)) {
            employee.setName(name);
        }

        if (email != null && email.length() > 0 && !Objects.equals(employee.getEmail(), email)) {
            employee.setEmail(email);
        }

        if (occupation != null && occupation.length() > 0) {
            employee.setOccupation(occupation);
        }

        if (age != 0 && !Objects.equals(employee.getAge(), age)) {
            employee.setAge(age);
        }

        return employee;

    }

    public void deleteEmployee(int eid) {
        employeeRepository.deleteById(eid);
    }
}
