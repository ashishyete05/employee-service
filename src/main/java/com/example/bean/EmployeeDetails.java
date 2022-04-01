package com.example.bean;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDetails {
    private int empId;
    private String empName;
    private String empLocation;
}
