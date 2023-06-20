package com.developer.employeemanagement.service.impl;

import com.developer.employeemanagement.entity.EmployeeEntity;
import com.developer.employeemanagement.repository.EmployeeRepository;
import com.developer.employeemanagement.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repo;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.repo = employeeRepository;
    }

    @Override
    public List<EmployeeEntity> findAllEmployee(){
        return repo.findAll();
    }

    @Override
    public Optional<EmployeeEntity> findById(Long id){
        return repo.findById(id);
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity){
        return repo.save(employeeEntity);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity){
        return repo.save(employeeEntity);
    }

    @Override
    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }

}
