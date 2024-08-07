package com.compositeJPA.Entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="employee_tbl_Embed")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeEmbedd {
//	@Id
//	private int employeeID;
//	@Id
//	private int deptID;
	@EmbeddedId
	private EmployeeEmbedID employeeID;
	private String name;
	private String email;
	private String phone;
}
