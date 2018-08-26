package com.employeeapi.employeeapi.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name="employee")
public class Employee {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
private Long id;
@Column(name = "first_name")
private String firstName;
@Column(name = "last_name")
private String lastName;

}
