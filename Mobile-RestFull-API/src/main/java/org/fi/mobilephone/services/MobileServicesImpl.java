package org.fi.mobilephone.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.fi.mobilephone.dto.MobileDTO;
import org.fi.mobilephone.entity.MobileEntity;
import org.fi.mobilephone.repository.MobileRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileServicesImpl implements MobileServices {

	@Autowired
	MobileRepository repositoryMobile;
	
	@Override
	public boolean addNewMobileId(MobileDTO objProduct) {
		
		MobileEntity entity = new MobileEntity();	
		BeanUtils.copyProperties(objProduct, entity);
		repositoryMobile.save(entity);
		return true;
	}

	@Override
	public List<MobileDTO> getAllProducts() {
		List<MobileEntity> dataList= repositoryMobile.findAll();
		ArrayList<MobileDTO> list =new ArrayList<>();
		for(MobileEntity user :dataList) {
			MobileDTO dto =new MobileDTO();
			BeanUtils.copyProperties(user, dto);
			list.add(dto);
		}
		return list;
		
	}

	@Override
	public MobileDTO mobileDetailWithJPA(int phoneId) {
		
			try {
				MobileEntity entityCategory = repositoryMobile.mobileDetailWithJPA(phoneId);
				MobileDTO dto = new MobileDTO();
				BeanUtils.copyProperties(entityCategory, dto);
				return dto;
			} catch (BeansException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		
		
		
	}

	@Override
	public MobileDTO updateMobileDetails(int phoneId) {
		MobileEntity user=repositoryMobile.updateMobileDetails(phoneId);
		user.setPhoneName("Samsung");
	
		user.setPhoneOS("Os");
		MobileDTO dto =new MobileDTO();
		BeanUtils.copyProperties(user, dto);
		return dto;
		
	}

}
