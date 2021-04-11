package com.returnorder.packaginganddelivery.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.returnorder.packaginganddelivery.service.PackagingAndDeliveryService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/getPackagingAndDeliveryCharge")
public class PackagingAndDeliveryController {

	private Logger log = LoggerFactory.getLogger(PackagingAndDeliveryController.class);

	@Autowired
	private PackagingAndDeliveryService packagingAndDeliveryService;

	public PackagingAndDeliveryController(final PackagingAndDeliveryService packagingAndDeliveryService) {
		this.packagingAndDeliveryService = packagingAndDeliveryService;
	}

	@GetMapping("/{componentType}/{count}")
	@ApiOperation(value = "Calculate delivery charges", notes = "Calculate and return delivery charge based on component type and the quantity")
	public Long getPackagingAndDeliveryCharge(
			@ApiParam(value = "Type can be Integral or Accessory", required = true) @PathVariable("componentType") String componentType,
			@ApiParam(value = "No of goods", required = true) @PathVariable("count") long count) {
		log.info("PackagingAndDeliveryController :: getPackagingAndDeliveryCharge");
		long charge = packagingAndDeliveryService.getPackagingDeliveryCharge(componentType, count);

		log.debug("Charge : {}", charge);

		return charge;
	}

}
