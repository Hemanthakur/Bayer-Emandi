package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Seller;

public interface SellerRepository extends JpaRepository<Seller,Long> {

	public Seller findByPhoneNumber(String phoneNumber);

	public Seller findOneByPhoneNumberAndPassword(String phoneNumber, String password);
	

}
