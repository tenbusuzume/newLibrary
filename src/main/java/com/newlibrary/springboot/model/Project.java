package com.newlibrary.springboot.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Project implements Serializable {

	/**
     * ID です。
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    /**
     * 名前です。
     */
    @Column
    private String name;

    /**
     * 社員リストです。
     */
    @ManyToMany
    @JoinTable(
            name="project_employee",
            joinColumns=
                @JoinColumn(name="project_id", referencedColumnName="id"),
            inverseJoinColumns=
                @JoinColumn(name="employee_id", referencedColumnName="id")
            )
    private List<Employee> employeeList;

    /**
     * 作成日時です。
     */

    @Column(nullable=false, updatable=false)
    private Date createTime;

    /**
     * 更新日時です。
     */
    @Column(nullable=false)
    private Date updateTime;
}