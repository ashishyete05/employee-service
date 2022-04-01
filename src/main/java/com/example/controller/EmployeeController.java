package com.example.controller;

import com.example.bean.EmployeeDetails;
import com.example.config.EmployeeConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    @Autowired
    EmployeeConfig empConf;

    @GetMapping("/employee")
    public EmployeeDetails getEmployeeDetails(){
        return new EmployeeDetails(empConf.getId(),empConf.getName(),empConf.getLocation());
    }
}
