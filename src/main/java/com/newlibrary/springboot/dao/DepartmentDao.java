package com.newlibrary.springboot.dao;

import org.springframework.data.repository.RepositoryDefinition;

import com.newlibrary.springboot.model.Department;

@RepositoryDefinition(domainClass = Department.class, idClass = Long.class)
public interface DepartmentDao {

	/**
	 * 指定した部署を返します
	 * @param id
	 * @return 部署
	 */
	Department getDepartmentById(Long id);

	/**
	 * 部署情報を保存
	 * @param department 部署
	 * @return　部署
	 */
	Department save(Department department);

	/**
	 * 全件数を返す
	 * @return 全件数
	 */
	Long count();

	/**
	 * 指定した部署を削除
	 * @param department　部署
	 */
	void delete(Department department);
}
