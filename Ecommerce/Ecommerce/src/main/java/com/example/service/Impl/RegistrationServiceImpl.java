package com.example.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Seller;
import com.example.repo.SellerRepository;
import com.example.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	private SellerRepository sellerRepo;
	
//	public Seller createUser(Seller seller) throws Exception {
//		Seller user=sellerRepo.findByPhoneNumber(seller.getPhoneNumber());
//		if(user!=null) {
//			System.out.println("Seller already Exist");
//			throw new Exception("User Already Exist");
//		}else {
//			user=sellerRepo.save(seller);
//		}
//		
//		return user; 	
//	}
	
	public Seller createUser(Seller seller){
		Seller user=sellerRepo.save(seller);		
		return user; 	
	}
	
	
	
	
	public Seller  findByPhoneNumber(String phoneNumber) {
		return sellerRepo.findByPhoneNumber(phoneNumber);
	}
}
