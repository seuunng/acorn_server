package com.acorn.erp.custormer;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.acorn.erp.domain.Customer.Entity.CustomerPreferenceData;
import com.acorn.erp.domain.Customer.Repository.PreferenceRepository;
import com.acorn.erp.domain.Customer.Service.GenderGroupService;
import com.acorn.erp.domain.Customer.Service.PreferenceService;

@SpringBootTest
public class PreferenceTest implements CommandLineRunner {

	@Autowired
	private PreferenceService service;
	@Autowired
	private PreferenceRepository repository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Running AgeGroupTests...");
		test();

	};

	@Test
	public void test() {
		service.calculateOrderData();
	}
	@Test
	public void postTest() {
		List<CustomerPreferenceData> preferenceData = repository.findAll();
		System.out.println("데이터: "+ preferenceData);
	}
	
}