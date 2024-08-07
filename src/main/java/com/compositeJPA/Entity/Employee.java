package com.compositeJPA.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//when two primary key is there
@Entity
@Table(name="employee_tbl")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@IdClass(EmployeeID.class)
public class Employee {
	@Id
	private int employeeID;
	@Id
	private int deptID;
	private String name;
	private String email;
	private String phone;
}
