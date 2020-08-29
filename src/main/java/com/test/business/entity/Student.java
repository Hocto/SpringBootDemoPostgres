package com.test.business.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "student", schema = "test")
public class Student implements Serializable {

    @Id
    @Column(name = "\"PKID\"")
    private Long pkid;

    @Column(name = "\"FIRSTNAME\"")
    private String firstName;

    @Column(name = "\"SURNAME\"")
    private String lastName;

    @Column(name = "\"DEPARTMENT\"")
    private String department;

    @Column(name = "\"GRADUATED\"")
    private char graduated;

    public Long getPkid() {
        return pkid;
    }

    public void setPkid(Long pkid) {
        this.pkid = pkid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public char getGraduated() {
        return graduated;
    }

    public void setGraduated(char graduated) {
        this.graduated = graduated;
    }
}
