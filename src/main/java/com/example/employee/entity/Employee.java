package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    private long id;
    private String name;
    private Integer age;
    private String gender;
    private Integer companyId;
    private Integer salary;

    public Employee() { }

    public Employee(String name, Integer age, String gender, Integer salary, Integer companyId, long id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.companyId = companyId;
        this.salary = salary;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public Employee setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Employee setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Employee setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Integer getCompanyId() {
        return companyId;
    }
    public Employee setCompanyId(Integer companyId) {
        this.companyId = companyId;
        return this;
    }

    public Integer getSalary() {
        return salary;
    }

    public Employee setSalary(Integer salary) {
        this.salary = salary;
        return this;
    }
}

