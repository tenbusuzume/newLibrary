package com.newlibrary.springboot.dao;

import org.springframework.data.repository.RepositoryDefinition;

import com.newlibrary.springboot.model.Project;

@RepositoryDefinition(domainClass = Project.class, idClass = Long.class)
public interface ProjectDao {

	/**
	 * 指定したプロジェクト情報を返します
	 *
	 * @param id
	 *            プロジェクトID
	 * @return プロジェクト情報
	 */
	Project getProjectById(Long id);

	/**
	 * プロジェクト情報を保存します
	 *
	 * @param project
	 *            プロジェクト
	 * @return プロジェクト
	 */
	Project save(Project project);

	/**
	 * 全件数を返します
	 *
	 * @return 全件数
	 */
	Long count();
}
