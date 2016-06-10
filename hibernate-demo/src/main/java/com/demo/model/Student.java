package com.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "STUDENT_ID", unique = true, nullable = false)
	private Long studentId;

	@Column(name = "STUDENT_NAME", length = 50)
	private String studentName;

	@Column(name = "STUDENT_AGE", length = 1)
	private String studentAge;

}
