/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Trung
 */
public class Enrollment {
    private Date from;
    private Date to;
    private int cid;
    private int eid;
    private Course cour;
    private Employee employ;
    private boolean active;
    private String note;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public Course getCour() {
        return cour;
    }

    public void setCour(Course cour) {
        this.cour = cour;
    }

    public Employee getEmploy() {
        return employ;
    }

    public void setEmploy(Employee employ) {
        this.employ = employ;
    }

    public void setEmploy(Course c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
