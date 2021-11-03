package io.ahmadou.employeemanager.resources;


import io.ahmadou.employeemanager.dto.EmployeeDto;
import io.ahmadou.employeemanager.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<EmployeeDto> getEmployee(){
        return service.getEmployee();
    }

    @GetMapping("/id/{id}")
    @ResponseBody
    public EmployeeDto getEmployeeById(@PathVariable Integer id){
        return service.findByID(id);
    }

    @GetMapping("/name/{name}")
    @ResponseBody
    public EmployeeDto getEmployeeByName(@PathVariable String name){
        return service.getEmployeeByName(name);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createEmployee(@RequestBody EmployeeDto dto){
        service.saveEmployee(EmployeeDto.builder()
                .name(dto.getName())
                .department(dto.getDepartment())
                .position(dto.getPosition())
                .salary(dto.getSalary())
                .build());
    }
}
