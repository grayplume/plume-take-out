package com.plume.service;

import com.plume.dto.EmployeeDTO;
import com.plume.dto.EmployeeLoginDTO;
import com.plume.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 员工保存
     * @param employeeDTO
     */
    void save(EmployeeDTO employeeDTO);
}
