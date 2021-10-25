/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Trung
 */
public class Employee {
    private int id;
    private String name;
    private Date dob;
    private boolean gender;
    private String did;

    private ArrayList<Enrollment> enrollments = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public ArrayList<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(ArrayList<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }
    
    
    
}
