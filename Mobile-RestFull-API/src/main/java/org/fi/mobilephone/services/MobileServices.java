package org.fi.mobilephone.services;

import java.util.List;


import org.fi.mobilephone.dto.MobileDTO;

public interface MobileServices {

	
	public boolean addNewMobileId(MobileDTO objProduct);
	
	public List<MobileDTO> getAllProducts();
	
	public MobileDTO mobileDetailWithJPA(int phoneId);
	
	public MobileDTO updateMobileDetails(int phoneId);
	
	
}
