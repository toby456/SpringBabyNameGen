package com.qa.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qa.domain.BabyName;

@Repository
public class BabyNameRepo {

	@Autowired
	EntityManager em;

	private BabyName bbyName;

	@Transactional(REQUIRED)
	public String createBabyName(String babyName) {
		bbyName = new BabyName();
		bbyName.setBabyName(babyName);

		em.persist(bbyName);
		return bbyName.getBabyName();

	}
}
