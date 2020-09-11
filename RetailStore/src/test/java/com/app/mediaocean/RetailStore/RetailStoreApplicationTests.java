package com.app.mediaocean.RetailStore;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.app.mediaocean.RetailStore.model.Product;
import com.app.mediaocean.RetailStore.service.RetailService;
@RunWith(MockitoJUnitRunner.class)
public class RetailStoreApplicationTests {

	@InjectMocks
	RetailService service;
	
	
	/**
	 * Test case to test when empty list is passed
	 */
	@Test
	public void testGenerateBillNegativeScenario() {
		assertEquals(0,service.generateBill(Collections.emptyList()).size());
		assertEquals(0,service.generateBill(null).size());
	}
	/**
	 * Test case to test postive values are passed
	 */
	@Test
	public void testGenerateBillpositivescenario() {
		List<Product> list = Arrays.asList(new Product(1, "Airconditioner", 25000.00, 1, "A"));
		assertEquals(1,service.generateBill(list).size());
		System.out.println(service.generateBill(list).get(0).getTotalCost());
		assertEquals(27500.00,service.generateBill(list).get(0).getTotalCost(),0.0);
	}


}
