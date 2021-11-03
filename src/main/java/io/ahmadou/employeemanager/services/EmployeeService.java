package io.ahmadou.employeemanager.services;

import io.ahmadou.employeemanager.dto.EmployeeDto;
import io.ahmadou.employeemanager.mappers.EmployeeMapper;
import io.ahmadou.employeemanager.repositories.EmployeeRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    private EmployeeMapper mapper = Mappers.getMapper(EmployeeMapper.class);

    public List<EmployeeDto> getEmployee(){
        return mapper.map(repository.findAll());
    }

    public EmployeeDto findByID(Integer id){
        return mapper.EntityToDto(repository.findById(id).orElseThrow());
    }

    public EmployeeDto getEmployeeByName(String name) throws NoSuchElementException {
        return mapper.EntityToDto(repository.findByName(name).orElseThrow());
    }

    public void saveEmployee(EmployeeDto employeeDto){
        repository.save(mapper.DtoToEntity(employeeDto));
    }

}
