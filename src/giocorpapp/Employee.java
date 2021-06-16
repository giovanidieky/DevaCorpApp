/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devacorpapp;

import java.io.*;
/**
 *
 * @author User
 */
public class Employee implements Serializable{
    private String name;
    private String username;
    private Job job;
    private int staffNr;

    public Employee(String name, String username, Job job, int staffNr) {
        this.name = name;
        this.username = username;
        this.job = job;
        this.staffNr = staffNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getStaffNr() {
        return staffNr;
    }

    public void setStaffNr(int staffNr) {
        this.staffNr = staffNr;
    }
    
    
}
