package net.example.microservice.departmentservice.service;

import net.example.microservice.departmentservice.model.Department;

public interface DepartmentService {

    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}
