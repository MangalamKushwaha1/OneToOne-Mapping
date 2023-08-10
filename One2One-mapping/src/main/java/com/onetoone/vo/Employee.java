package com.onetoone.vo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "epmloyee_id")
	private long empId;

	@Column(name = "employee_name")
	private String empName;
	@Column(name = "employee_age")
	private int age;

	// owning side
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")   //  foreign key (address_id) generates in employee table
	private Address address;
}
