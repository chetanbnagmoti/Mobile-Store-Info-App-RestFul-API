package org.fi.mobilephone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobilephone_0013")
public class MobileEntity {

	
	@Id
	@GeneratedValue(generator = "increment")
	@Column(name="phoneid")
	int phoneId;
	
	@Column(name="phonename")
	String phoneName;
	
	@Column(name="phonememory")
	String phoneMemory;
	
	@Column(name="phoneos")
	String phoneOS;
	
	@Column(name="phonesize")
	int phoneSize;

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public String getPhoneMemory() {
		return phoneMemory;
	}

	public void setPhoneMemory(String phoneMemory) {
		this.phoneMemory = phoneMemory;
	}

	public String getPhoneOS() {
		return phoneOS;
	}

	public void setPhoneOS(String phoneOS) {
		this.phoneOS = phoneOS;
	}

	public int getPhoneSize() {
		return phoneSize;
	}

	public void setPhoneSize(int phoneSize) {
		this.phoneSize = phoneSize;
	}
	
	
}
