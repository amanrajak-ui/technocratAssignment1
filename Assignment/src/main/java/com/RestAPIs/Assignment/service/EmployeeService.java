package com.RestAPIs.Assignment.service;

import com.RestAPIs.Assignment.dto.AddEmployeeRequestDto;
import com.RestAPIs.Assignment.dto.EmployeeDto;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    List<EmployeeDto> getAllEmployee();

    EmployeeDto getEmployeeById(Integer id);

    EmployeeDto createNewEmployee(AddEmployeeRequestDto addEmployeeRequestDto);

    void deleteEmployeeById(Integer id);

    EmployeeDto updateEmployee(Integer id, AddEmployeeRequestDto addEmployeeRequestDto);

    EmployeeDto updateParticalEmployee(Integer id, Map<String, Object> updates);

}


