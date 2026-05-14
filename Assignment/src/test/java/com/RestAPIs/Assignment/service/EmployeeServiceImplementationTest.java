package com.RestAPIs.Assignment.service;

import com.RestAPIs.Assignment.dto.EmployeeDto;
import com.RestAPIs.Assignment.entity.Employee;
import com.RestAPIs.Assignment.repository.EmployeeRepository;
import com.RestAPIs.Assignment.service.Implementation.EmployeeServiceImplementation;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class EmployeeServiceImplementationTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @Mock
    private ModelMapper modelMapper;

    @InjectMocks
    private EmployeeServiceImplementation employeeService;

    public EmployeeServiceImplementationTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetEmployeeById() {

        // fake employee
        Employee employee = new Employee();

        employee.setId(1);
        employee.setName("Aman");
        employee.setEmail("aman@gmail.com");
        employee.setDepartment("IT");
        employee.setSalary(50000);

        // fake dto
        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setId(1);
        employeeDto.setName("Aman");
        employeeDto.setEmail("aman@gmail.com");
        employeeDto.setDepartment("IT");
        employeeDto.setSalary(50000);

        // repository fake response
        when(employeeRepository.findById(1))
                .thenReturn(Optional.of(employee));

        // model mapper fake response
        when(modelMapper.map(employee, EmployeeDto.class))
                .thenReturn(employeeDto);

        // actual service call
        EmployeeDto result =
                employeeService.getEmployeeById(1);

        // checking
        assertNotNull(result);

        assertEquals("Aman", result.getName());

        assertEquals("IT", result.getDepartment());

        assertEquals(50000, result.getSalary());

        // verify repository called
        verify(employeeRepository, times(1))
                .findById(1);
    }
}




