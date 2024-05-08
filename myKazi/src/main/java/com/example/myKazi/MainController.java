package com.example.myKazi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;


@Controller
@RequestMapping(path="/api/v1.0")
public class MainController {
    
    @Autowired

    private EmployeeRepository employeeRepository;

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


}
