package com.returnorder.packaginganddelivery.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.returnorder.packaginganddelivery.service.PackagingAndDeliveryService;

class PackagingAndDeliveryServiceTest {

	private PackagingAndDeliveryService packagingAndDeliveryService = new PackagingAndDeliveryService();
	
	@Test
	void testGetPackagingDeliveryChargeIntegral() {
		long expected = 1750;
		long actual = packagingAndDeliveryService.getPackagingDeliveryCharge("Integral", 5L);
		
		assertNotNull(actual);
		assertEquals(expected,actual);
	}
	
	@Test
	void testGetPackagingDeliveryChargeAccessory() {
		long expected = 1000;
		long actual = packagingAndDeliveryService.getPackagingDeliveryCharge("Accessory", 5L);
		
		assertNotNull(actual);
		assertEquals(expected,actual);
	}
	

}
