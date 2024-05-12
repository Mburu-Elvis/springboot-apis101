package com.example.myKazi;

import jakarta.persistence.Column;
// import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.Temporal;
// import jakarta.persistence.TemporalType;
import java.time.LocalDateTime;
// import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Jobs {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String jobTitle;

    private LocalDateTime datePosted;

    // private BidState bidState;

    // public enum BidState {
    //     ON("bid on"),
    //     OFF("bid off");
        
    //     private String stateDescription;

    //     BidState(String stateDescription) {
    //         this.stateDescription = stateDescription;
    //     }

    //     public String getStateDescription() {
    //         return stateDescription;
    //     }

    //     // public static BidState fromString(String text) {
    //     //     for (BidState state: BidState.values()) {
    //     //         if (state.stateDescription.equalsIgnoreCase(text)) {
    //     //             return state;
    //     //         }
    //     //     }
    //     //     throw new IllegalArgumentException("No constant with text " + text + "found");
    //     // }
    // };


    private Integer numberOfBids;

    private String jobDescription;

    private Float budget;

    private LocalDateTime dateBidWon;

    @Column(name="employee_id")
    private Integer employeeId;

    private Integer contractorId;

    // @ManyToOne
    // @JoinColumn(name="employee_id")
    // private Employee employee;

    // @ManyToOne
    // @JoinColumn(name="contractor_id")
    // private Contractor contractor;

    // @OneToMany(mappedBy = "job")
    // private List<Bids> bids;

    public Jobs() {}

    public Jobs(Integer id, String jobTitle) {
        this.id = id;
        this.jobTitle = jobTitle;
        // this.contractor = contractor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setDatePosted(LocalDateTime datePosted) {
        this.datePosted = datePosted;
    }

    public LocalDateTime getDatePosted() {
        return datePosted;
    }

    // public void setBidState(BidState bidState) {
    //     this.bidState = bidState;
    // }

    // public BidState getBidState() {
    //     return bidState;
    // }

    public void setNumberOfBids(Integer numberOfBids) {
        this.numberOfBids = numberOfBids;
    }

    public Integer getNumberOfBids() {
        return numberOfBids;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setBudget(Float budget) {
        this.budget = budget;
    }

    public Float getBudget() {
        return budget;
    }

    public void setDateBidWon(LocalDateTime dateBidWon) {
        this.dateBidWon = dateBidWon;
    }

    public LocalDateTime getDateBidWon() {
        return dateBidWon;
    }

    public void setContractorId(Integer contractorId) {
        this.contractorId = contractorId;
    }
    
    public Integer getContractorId() {
        return contractorId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    // public void setEmployee(Employee employee) {
    //     this.employee = employee;
    // }

    // public Employee getEmployee() {
    //     return employee;
    // }


    // public void setBids(List<Bids> bids) {
    //     this.bids = bids;
    // }

    // public List<Bids> getBids() {
    //     return bids;
    // }

}
