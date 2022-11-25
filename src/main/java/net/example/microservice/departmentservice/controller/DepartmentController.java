package net.example.microservice.departmentservice.controller;

import lombok.AllArgsConstructor;
import net.example.microservice.departmentservice.model.Department;
import net.example.microservice.departmentservice.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {

    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {

        Department saveDepartment = departmentService.saveDepartment(department);

        return new ResponseEntity<>(saveDepartment, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long departmentId) {

        Department department = departmentService.getDepartmentById(departmentId);

        return ResponseEntity.ok(department);
    }
}
