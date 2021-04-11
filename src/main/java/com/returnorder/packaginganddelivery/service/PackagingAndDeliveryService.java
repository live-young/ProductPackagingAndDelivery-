package com.returnorder.packaginganddelivery.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PackagingAndDeliveryService {

	private Logger log = LoggerFactory.getLogger(PackagingAndDeliveryService.class);
	
	private static final long INTEGRALPACKAGING = 100;
	private static final long INTEGRALDELIVERY = 200;
	private static final long PROTECTIVESHEATH = 50;
	private static final long ACCESSORYPACKAGING = 50;
	private static final long ACCESSORYDELIVERY = 100;
	
	public long getPackagingDeliveryCharge(String componentType, long count) {
		log.info("PackagingAndDeliveryService :: getPackagingDeliveryCharge");
		long packagingAndDeliveryCharge = 0;
		if(componentType.equalsIgnoreCase("Integral")) {
			packagingAndDeliveryCharge = count * (INTEGRALPACKAGING + INTEGRALDELIVERY + PROTECTIVESHEATH);
		}else if(componentType.equalsIgnoreCase("Accessory")) {
			packagingAndDeliveryCharge = count * (ACCESSORYPACKAGING + ACCESSORYDELIVERY + PROTECTIVESHEATH);
		}
		
		return packagingAndDeliveryCharge;
	}
	
	
}
