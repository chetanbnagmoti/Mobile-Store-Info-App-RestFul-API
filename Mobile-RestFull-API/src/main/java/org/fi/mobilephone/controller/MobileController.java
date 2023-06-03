package org.fi.mobilephone.controller;

import java.util.List;

import org.fi.mobilephone.dto.MobileDTO;
import org.fi.mobilephone.services.MobileServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mobile_0013")
public class MobileController {

	@Autowired
	MobileServices mobileServices;
	
	@PostMapping("/create_0013")
	public boolean addNewMobileId(@RequestBody MobileDTO objProduct) {
		return mobileServices.addNewMobileId(objProduct);
	}
	
	
	@GetMapping("/getAllMobiles_0013")
	public List<MobileDTO> getAllProducts(){
		return mobileServices.getAllProducts();
	}
	
	@GetMapping("/getMobileDetail_0013/{phoneId} ")
	public MobileDTO mobileDetailWithJPA(@PathVariable("phoneId")int phoneId) {
		return mobileServices.mobileDetailWithJPA(phoneId);
	}
	
	@PostMapping("/updateMobileDetail_0013/{phoneId}")
	public MobileDTO updateMobileDetails(int phoneId) {
		return mobileServices.updateMobileDetails(phoneId);
	}
}
