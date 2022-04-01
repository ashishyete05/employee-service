package com.example.config;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("employee-service")
@Data
@Getter
public class EmployeeConfig {

    private int id;
    private String name;
    private String location;
}
