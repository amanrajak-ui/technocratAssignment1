package com.RestAPIs.Assignment.dto;

import lombok.Data;

@Data
public class AddEmployeeRequestDto {
    private String name;
    private String email;
    private String department;
    private String salary;


}
