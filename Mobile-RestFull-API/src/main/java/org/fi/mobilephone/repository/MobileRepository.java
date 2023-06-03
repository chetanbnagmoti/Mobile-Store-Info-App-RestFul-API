package org.fi.mobilephone.repository;

import org.fi.mobilephone.entity.MobileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface MobileRepository extends JpaRepository<MobileEntity, Integer> {

	// JPA-QL (HQL):-
	
	
	@Query(value = "select OBJECT(objMobile) from MobileEntity objMobile where objMobile.phoneId=:phoneId")
	public MobileEntity mobileDetailWithJPA(@Param("phoneId") int phoneId);

	// Native Query:-Decided on nativeQuery=true
	@Query(value = "select phoneId from mobilephone_0013", nativeQuery = true)
	public MobileEntity updateMobileDetails(@Param("phoneId") int phoneId);
	
//	//JPA-QL(HQL):-
//		@Transactional
//		@Modifying
//		@Query(value="update ATMCardEntity  set balance=:balance where cardNO=:cardNO")
//		public void  updateATMCardEntity(@Param("balance")float balance,@Param("cardNO")int cardNO);
}
