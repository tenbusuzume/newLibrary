package com.newlibrary.springboot.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(indexes={@Index(name="employee_profile_id_sex_idx", columnList="employee_id_sex")})
@NoArgsConstructor
@AllArgsConstructor
public class EmployeePlofile implements Serializable{

	/**
	 * 性別
	 */
	public enum SEX{MAN,WOMAN};

	/**
	 * 社員
	 */
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="employee_id")
    private Long id;
    /**
     * 性別
     */
    @Column(nullable=false, length=5)
    @Enumerated(EnumType.STRING)
    private SEX sex;
    /**
     * 作成日時
     */
    @Column(nullable=false, updatable=false)
    private Date createTime;
    /**
     * 更新日時
     */
    @Column(nullable=false)
    private Date updateTime;
}
