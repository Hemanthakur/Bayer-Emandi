package com.example.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SellerRequest {

	private Long sellerId;	
	private String name;
	private String phoneNumber;
	private String password;
}
