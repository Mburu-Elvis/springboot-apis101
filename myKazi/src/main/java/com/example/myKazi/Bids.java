package com.example.myKazi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

import java.time.LocalDateTime;

@Entity
public class Bids {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private Integer jobId;

    private LocalDateTime dateOfBid;
    
    @ManyToOne
    @JoinColumn(name="job_id")
    private Jobs job;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getJobId() {
        return jobId;
    }



    public void setDateOfBid(LocalDateTime dateOfBid) {
        this.dateOfBid = dateOfBid;
    }

    public LocalDateTime getDateOfBid() {
        return dateOfBid;
    }

    public void setJob(Jobs job) {
        this.job = job;
    }
    
    public Jobs getJob() {
        return job;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

}
