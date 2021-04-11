package com.returnorder.packaginganddelivery.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.returnorder.packaginganddelivery.controller.PackagingAndDeliveryController;
import com.returnorder.packaginganddelivery.service.PackagingAndDeliveryService;


@AutoConfigureMockMvc
class PackagingAndDeliveryControllerTest {

	
private PackagingAndDeliveryController packagingAndDeliveryController;

	
	private MockMvc mockMvc;
	
	@Mock
	private static PackagingAndDeliveryService packagingAndDeliveryService;

	@Test
	public void contextLoads() {
		assertNotNull(packagingAndDeliveryService);
	}
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);

		packagingAndDeliveryController = new PackagingAndDeliveryController(packagingAndDeliveryService);
		assertNotNull(packagingAndDeliveryController);
		
		mockMvc = MockMvcBuilders.standaloneSetup(packagingAndDeliveryController).build();
		

	}
	
	@Test
	void testGetPackagingAndDeliveryCharge() throws Exception {
		

		String componentType = "Integral";
		long count = 5L;
		when(packagingAndDeliveryService.getPackagingDeliveryCharge(componentType, count)).thenReturn(1750L);
		mockMvc.perform(MockMvcRequestBuilders.get("/getPackagingAndDeliveryCharge/"+componentType+"/"+count, 1750L))
		.andExpect(status().isOk());

		
		
	}

}
