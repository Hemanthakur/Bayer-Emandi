package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Seller;
import com.example.service.RegistrationService;

@RestController
@CrossOrigin(origins="*")
public class SellerController {

	@Autowired
	private RegistrationService registrationService;
	
//	@PostMapping("/registerseller")
//	public Seller registerUser(@RequestBody Seller seller) throws Exception {
//		return registrationService.createUser(seller);
//	}
//	
	@PostMapping("/registerseller")
	public ResponseEntity<?> registerUser(@RequestBody Seller seller){
		Seller user=null;
		try{
			user=registrationService.createUser(seller);
			return ResponseEntity.of(Optional.of(user)); 
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("User Already Exist",HttpStatus.FORBIDDEN);
		}
	}
	
	
	
	
}
