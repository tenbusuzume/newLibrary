package com.newlibrary.springboot.dao;

import org.springframework.data.repository.RepositoryDefinition;

import com.newlibrary.springboot.model.Team;

@RepositoryDefinition(domainClass = Team.class, idClass = Long.class)
public interface TeamDao {
	/**
	 * 指定したチーム情報を返す。
	 *
	 * @param id
	 *            チームID
	 * @return チーム情報
	 */

	Team getTeamById(Long id);

	/**
	 * チーム情報を保存する
	 *
	 * @param team
	 *            チーム
	 * @return チーム
	 */

	Team save(Team team);

	/**
	 * 全件数を返す。
	 *
	 * @return 全件数
	 */
	Long count();

}
