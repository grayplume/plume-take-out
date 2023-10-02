package com.plume.service;

import com.plume.dto.EmployeeLoginDTO;
import com.plume.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

}
