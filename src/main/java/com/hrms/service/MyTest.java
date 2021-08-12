package com.hrms.service;

import com.hrms.bean.Department;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        DepartmentService departmentService = new DepartmentService();

        List<Department> list = departmentService.getDeptList(0,1);

        for(Department department:list) System.out.println(department);
    }
}
