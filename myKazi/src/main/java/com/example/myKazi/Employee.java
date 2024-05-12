package com.example.myKazi;

// import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee {
    
    @Id@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    // private Integer bidId;
    
    // @OneToMany(mappedBy = "employee")
    // private List<Jobs> jobs;

    // @OneToMany(mappedBy = "employee")
    // private List<Bids> bids;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return phoneNumber;
    }

    // public void setBidId(Integer bidId) {
    //     this.bidId = bidId;
    // }

    // public Integer getBidId() {
    //     return bidId;
    // }

    // public void setJobs(List<Jobs> jobs) {
    //     this.jobs = jobs;
    // }

    // public List<Jobs> getJobs() {
    //     return jobs;
    // }

    // public void setBids(List<Bids> bids) {
    //     this.bids = bids;
    // }

    // public List<Bids> getBids() {
    //     return bids;
    // }
}
