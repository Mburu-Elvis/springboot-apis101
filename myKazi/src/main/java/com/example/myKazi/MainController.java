package com.example.myKazi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
// import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RequestMapping(path="/api/v1.0")
public class MainController {
    
    @Autowired

    private EmployeeRepository employeeRepository;

    @Autowired
    private ContractorRepository contractorRepository;

    @Autowired
    private JobsRepository jobsRepository;

    @Autowired
    private BidsRepository bidsRepository;

    @PostMapping(path="/employees")
    public  @ResponseBody ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping(path="/employees")
    public @ResponseBody Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping(path="/employees/{id}")
    public @ResponseBody ResponseEntity<Employee> getEmployeeById ( @PathVariable Integer id) {
        Employee employee = employeeRepository.findById(id).orElse(null);

        if (employee != null) {
            return new ResponseEntity<>(employee, HttpStatus.OK);
        }   else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/employees/{id}")
    public ResponseEntity<Void> deleteEmployeeById(@PathVariable Integer id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path="/contractors")
    public @ResponseBody ResponseEntity<Contractor> createContractor(@RequestBody Contractor contractor) {
        Contractor savedContractor = contractorRepository.save(contractor);
        return new ResponseEntity<>(savedContractor, HttpStatus.CREATED);
    }

    @GetMapping(path="/contractors")
    public @ResponseBody Iterable<Contractor> getAllContractors() {
        return contractorRepository.findAll();
    }

    @GetMapping(path="/contractors/{id}")
    public @ResponseBody ResponseEntity<Contractor> getContractorById ( @PathVariable Integer id) {
        Contractor contractor = contractorRepository.findById(id).orElse(null);

        if (contractor != null) {
            return new ResponseEntity<>(contractor, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/contractors/{id}")
    public @ResponseBody ResponseEntity<Void> deleteContractorById(Integer id) {
        if (contractorRepository.existsById(id)) {
            contractorRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path="/jobs")
    public @ResponseBody ResponseEntity<Jobs>  createJobs(@RequestBody Jobs job) {
        Jobs savedJobs = jobsRepository.save(job);
        return new ResponseEntity<>(savedJobs, HttpStatus.CREATED);
    }

    @GetMapping(path="/jobs")
    public @ResponseBody Iterable<Jobs> getAllJobs() {
        return jobsRepository.findAll();
    }

    @GetMapping(path="/jobs/{id}")
    public @ResponseBody ResponseEntity<Jobs> getJobById (@PathVariable Integer id) {
        Jobs job = jobsRepository.findById(id).orElse(null);

        if (job != null) {
            return new ResponseEntity<>(job, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping(path="/jobs/{id}")
    public @ResponseBody ResponseEntity<Void> deleteJobById(Integer id) {
        if(jobsRepository.existsById(id)) {
            jobsRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path="/bids")
    public @ResponseBody ResponseEntity<Bids> createBids(@RequestBody Bids bid) {
        Bids bidSaved = bidsRepository.save(bid);
        System.out.println(bidSaved);
        return new ResponseEntity<>(bidSaved, HttpStatus.CREATED);
    }

    @GetMapping(path="/bids")
    public @ResponseBody Iterable<Bids> getAllBids() {
        return bidsRepository.findAll();
    }

    @DeleteMapping(path="/bids/{id}")
    public @ResponseBody ResponseEntity<Void> deleteBidById(Integer id) {
        if(bidsRepository.existsById(id)) {
            bidsRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}
