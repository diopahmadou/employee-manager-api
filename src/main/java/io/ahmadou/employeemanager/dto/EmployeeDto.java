package io.ahmadou.employeemanager.dto;

import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;


@Data
@Builder
public class EmployeeDto {
    private Integer id;
    private String name;
    private String department;
    private String position;
    private double salary;
    private ZonedDateTime hiring;
}
