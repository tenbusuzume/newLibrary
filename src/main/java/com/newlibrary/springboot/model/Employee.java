package com.newlibrary.springboot.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {

	/**
	 * 社員ID
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	/**
	 * 名前
	 */
	@Column(nullable=false, length=20)
	private String name;

	/**
	 * 部署
	 */
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn
	private Department department;

	/**
	 * チーム
	 */
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn
	private Team team;

	/**
	 * 社員のプロフィール
	 */
	@OneToMany
	@JoinTable(
			name="project_employee",joinColums = @JoinColumn(name="employee", referencedColumnName="id"),
			inverseJoinColumns=@JoinColumn(name="project_id",referencedColumnName="id"))
	private List<Project> project;

	/**
	 * 作成日時
	 */
	@Column(nullable=false,updatable=false)
	private Date createTime;

	/**
	 * 更新日時
	 */
	@Column(nullable=false)
	private Date updateTime;

}
