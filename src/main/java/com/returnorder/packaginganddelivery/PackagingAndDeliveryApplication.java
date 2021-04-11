package com.returnorder.packaginganddelivery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableFeignClients
@EnableSwagger2
public class PackagingAndDeliveryApplication {

	private static Logger log = LoggerFactory.getLogger(PackagingAndDeliveryApplication.class);
	
	public static void main(String[] args) {
		log.info("PackagingAndDeliveryApplication :: main");
		SpringApplication.run(PackagingAndDeliveryApplication.class, args);
	}
	
	@Bean
    public Docket swaggerConfiguration() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                //.paths(PathSelectors.ant("/"))
                .apis(RequestHandlerSelectors.basePackage("com.cognizant"))
                .build()
                .apiInfo(apiDetails());
    }
    
    @SuppressWarnings("deprecation")
    private ApiInfo apiDetails() {
        return new ApiInfo(
                "Packaging and Delivery", "Microservice used to calculate packaging and delivery charges", "1.0", "", " ", "", ""
                );
    }
	

}
