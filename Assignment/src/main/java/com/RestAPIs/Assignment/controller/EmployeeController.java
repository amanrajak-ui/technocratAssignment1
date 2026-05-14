package com.RestAPIs.Assignment.controller;

import com.RestAPIs.Assignment.dto.AddEmployeeRequestDto;
import com.RestAPIs.Assignment.dto.EmployeeDto;
import com.RestAPIs.Assignment.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;


    // fetching all data
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getEmployee()
    {
       // return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAllEmployee());
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }

    // fetching data by id
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeebyId(@PathVariable Integer id)
    {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }


    @PostMapping
    public ResponseEntity<EmployeeDto> createNewEmployee(@RequestBody AddEmployeeRequestDto addEmployeeRequestDto)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createNewEmployee(addEmployeeRequestDto));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Integer id)
    {
        employeeService.deleteEmployeeById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable Integer id,
                                                      @RequestBody AddEmployeeRequestDto addEmployeeRequestDto)
    {
        return ResponseEntity.ok(employeeService.updateEmployee(id,addEmployeeRequestDto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<EmployeeDto> updateParticalEmployee(@PathVariable Integer id,
                                                              @RequestBody Map<String, Object> updates)
    {
        return ResponseEntity.ok(employeeService.updateParticalEmployee(id,updates));
    }















}

