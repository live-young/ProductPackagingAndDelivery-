package com.returnorder.packaginganddelivery;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.returnorder.packaginganddelivery.PackagingAndDeliveryApplication;

@SpringBootTest(classes = PackagingAndDeliveryApplication.class)
class PackagingAndDeliveryApplicationTests {

	@Test
	void contextLoads() {
		PackagingAndDeliveryApplication p = new PackagingAndDeliveryApplication();
		assertNotNull(p);
	}
	
	@Test
	public void testMain() {
		PackagingAndDeliveryApplication.main(new String[] {});
	}
}
