package com.newlibrary.springboot.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Department implements Serializable {

	/**
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 名前
	 */
	@Column(nullable = false, length = 20)
	private String name;

	/**
	 * 概要
	 */
	@Column
	private String description;

	/**
	 * 削除フラグ
	 */
	@Column(nullable = false)
	private boolean deleted;

	/**
	 * 社員リスト
	 */
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
	private List<Employee> employeeList;

	/**
	 * 作成日時
	 */
	@Column(nullable = false, updatable = false)
	private Date createTime;

	/**
	 * 更新日時
	 */
	@Column(nullable = false)
	private Date updateTime;

}
