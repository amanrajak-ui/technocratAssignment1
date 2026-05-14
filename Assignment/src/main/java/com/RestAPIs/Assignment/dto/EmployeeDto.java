package com.RestAPIs.Assignment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
   private int id;
   private String name;
   private String email;
   private String department;
   private int salary;
}
