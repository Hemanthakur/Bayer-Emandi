package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table( name = "seller",uniqueConstraints=@UniqueConstraint(
		columnNames="phoneNumber"
		) )
public class Seller {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long customerId;
	
	@Column(nullable=false)
	private String firstName;
	
	@Column(nullable=false)
	private String lastName;
	
	@Column(nullable=false)
	private String phoneNumber;
	
	@Column(nullable=false)
	private String password;

	@Column(nullable=false)
	private String address;
	
	@Column(nullable=false)
	private String identity_proof;
	
	
	
}
