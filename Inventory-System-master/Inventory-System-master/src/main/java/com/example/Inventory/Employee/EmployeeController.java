package com.example.Inventory.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping(path = "/employees/{eid}")
    public Employee getEmployee(@PathVariable int eid) {
        return employeeService.getEmployee(eid);
    }

    @PutMapping(path = "/employee/{eid}")
    public Employee updateEmployee(@PathVariable int eid, @RequestParam String name, @RequestParam int age, @RequestParam String email, @RequestParam String occupation) {
        return employeeService.updateEmployee(eid, name, age, email, occupation);
    }


    @PostMapping(path = "/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);

    }

    @DeleteMapping(path = "/employee/{eid}")
    public void deleteEmployee(@PathVariable int eid) {
        employeeService.deleteEmployee(eid);
    }

}
