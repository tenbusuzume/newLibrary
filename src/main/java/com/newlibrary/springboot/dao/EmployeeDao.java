package com.newlibrary.springboot.dao;

import org.springframework.data.repository.RepositoryDefinition;

import com.newlibrary.springboot.model.Employee;

@RepositoryDefinition(domainClass = Employee.class, idClass = Long.class)
public interface EmployeeDao {
	/**
     * 指定した社員情報を返します。
     * @param id 社員ID
     * @return 社員情報
     */
    Employee getEmployeeById(Long id);
    /**
     * 社員情報を保存します。
     * @param employee 社員
     * @return 社員
     */
    Employee save(Employee employee);
    /**
     * 全件数を返します。
     * @return 全件数
     */
    Long count();

}
