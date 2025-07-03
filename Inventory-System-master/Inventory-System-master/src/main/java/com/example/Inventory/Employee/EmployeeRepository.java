package com.example.Inventory.Employee;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface EmployeeRepository extends JpaRepository<Employee, Integer> {

//    @Query("select e.salary from Employee e where e.eid)
//    void same();
}
