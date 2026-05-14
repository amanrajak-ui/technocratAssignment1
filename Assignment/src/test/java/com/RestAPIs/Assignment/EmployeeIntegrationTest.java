package com.RestAPIs.Assignment;

import com.RestAPIs.Assignment.entity.Employee;
import com.RestAPIs.Assignment.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class EmployeeIntegrationTest {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Test
    void testSaveEmployee() {

        // Create Employee Object
        Employee employee = new Employee();
        employee.setName("Aman");
        employee.setEmail("aman@gmail.com");
        employee.setSalary(50000);

        // Save Employee in Database
        Employee savedEmployee = employeeRepository.save(employee);

        // Check employee saved or not
        assertNotNull(savedEmployee.getId());

        System.out.println("Employee Saved Successfully");
    }
}