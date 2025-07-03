package com.example.Inventory.Employee;

import jakarta.persistence.*;

@Entity
@Table(name = "workers")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eid")
    private int eid;

    private String name;
    private int age;
    private String email;
    private String occupation;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, String email, String password, String occupation, double salary) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.occupation = occupation;
        this.salary = salary;
    }

    public Employee(int eid, String name, int age, String email, String password, String occupation, double salary) {
        this.eid = eid;
        this.name = name;
        this.age = age;
        this.email = email;
        this.occupation = occupation;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }


    public String getOccupation() {
        return occupation;
    }

    public double getSalary() {
        return salary;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", occupation='" + occupation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
