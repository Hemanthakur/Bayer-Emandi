package com.example.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.example.request.SellerRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table( name = "seller",uniqueConstraints=@UniqueConstraint(
		columnNames="phoneNumber"
		) )
public class Seller {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long sellerId;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private String phoneNumber;
	
	@Column(nullable=false)
	private String password;

	@OneToMany(mappedBy="seller")
	private List<Product> products;

	
	public Seller(SellerRequest sellerRequest) {
		this.sellerId = sellerRequest.getSellerId();
		this.name = sellerRequest.getName();
		this.phoneNumber = sellerRequest.getPhoneNumber();
		this.password = sellerRequest.getPassword();
	}
	
	
	

}
