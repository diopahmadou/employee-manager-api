package io.ahmadou.employeemanager.mappers;

import io.ahmadou.employeemanager.dto.EmployeeDto;
import io.ahmadou.employeemanager.entities.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    Employee DtoToEntity(EmployeeDto dto);
    EmployeeDto EntityToDto(Employee entity);
    List<EmployeeDto> map(List<Employee> employees);
}
