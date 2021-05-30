package com.dailycodebuffer.Springboot.tutorial.service;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();


    Department findDepartmentById(Long id);

    void deleteDepartmentById(Long id);

    Department updateDepartmentById(Department department, Long id);

    Department fetchDepartmentByName(String name);
}
