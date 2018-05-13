package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Company")
public class Company {
    @Id
    private long id;
    private String companyName;
    private Integer employeesNumber;

    public Company(){}
    public Company(String companyName, Integer employeesNumber, long id){

        this.id = id;
        this.companyName = companyName;
        this.employeesNumber = employeesNumber;
    }

    public long getId() {
        return id;
    }

    public Company setId(long id) {
        this.id = id;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Company setCompanyName(String companyName) {
        this.companyName = companyName;
        return  this;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public Company setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
        return this;
    }
}
