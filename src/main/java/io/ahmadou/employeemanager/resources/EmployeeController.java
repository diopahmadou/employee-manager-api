package io.ahmadou.employeemanager.resources;


import io.ahmadou.employeemanager.dto.EmployeeDto;
import io.ahmadou.employeemanager.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<EmployeeDto> getEmployee() {
        return service.getEmployee();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public EmployeeDto getEmployeeById(@PathVariable Integer id) {
        return service.findByID(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createEmployee(@RequestBody EmployeeDto dto) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String format = dto.getHiring().format(formatter);
        service.saveEmployee(EmployeeDto.builder()
                .name(dto.getName())
                .department(dto.getDepartment())
                .position(dto.getPosition())
                .salary(dto.getSalary())
                .hiring(ZonedDateTime.parse(format, formatter))
                .build());
    }
}
