package com.RestAPIs.Assignment.service.Implementation;

import com.RestAPIs.Assignment.dto.AddEmployeeRequestDto;
import com.RestAPIs.Assignment.dto.EmployeeDto;
import com.RestAPIs.Assignment.entity.Employee;
import com.RestAPIs.Assignment.repository.EmployeeRepository;
import com.RestAPIs.Assignment.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public  class EmployeeServiceImplementation implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<EmployeeDto> getAllEmployee() {
        List<Employee> employees = employeeRepository.findAll();
        List<EmployeeDto>employeeDtoList=employees.stream().map(employee -> new EmployeeDto(
                employee.getId(),
                employee.getName(),
                employee.getEmail(),
                employee.getDepartment(),
                employee.getSalary()
        )).toList();
        return employeeDtoList;
    }

    @Override
    public EmployeeDto getEmployeeById(Integer id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("employee does not found by id"));

        return modelMapper.map(employee,EmployeeDto.class);
    }

    @Override
    public EmployeeDto createNewEmployee(AddEmployeeRequestDto addEmployeeRequestDto) {
        Employee newEmployee = modelMapper.map(addEmployeeRequestDto,Employee.class);
        Employee employee = employeeRepository.save(newEmployee);
        return modelMapper.map(employee,EmployeeDto.class);
    }

    @Override
    public void deleteEmployeeById(Integer id) {
        if(!employeeRepository.existsById(id))
        {
            throw new IllegalArgumentException("Employee does not exist of this id "+id);
        }
        employeeRepository.deleteById(id);

    }



    @Override
    public EmployeeDto updateEmployee(Integer id, AddEmployeeRequestDto addEmployeeRequestDto)
    {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("employee does not found by id"+id));
        modelMapper.map(addEmployeeRequestDto,employee);

        employee = employeeRepository.save(employee);
        return modelMapper.map(employee,EmployeeDto.class);




    }

    @Override
    public EmployeeDto updateParticalEmployee(Integer id, Map<String, Object> updates) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("employee does not found by id"+id));
        updates.forEach((field,value)->{
            switch (field){
                case "name" :employee.setName((String)value);
                break;
                case "email":employee.setEmail((String)value);
                break;
                case "department":employee.setDepartment((String)value);
                break;
                case "salary":employee.setSalary((Integer) value);
                break;
                default:
                    throw new IllegalArgumentException("field is not supported");

            }
        });
        Employee savedEmployee = employeeRepository.save(employee);
        return modelMapper.map(savedEmployee,EmployeeDto.class);
    }
}
