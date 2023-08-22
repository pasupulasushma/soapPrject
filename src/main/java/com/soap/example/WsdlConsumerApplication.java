package com.soap.example;

import org.oorsprong.websamples_countryinfo.CountryInfoService;
import org.oorsprong.websamples_countryinfo.CountryInfoServiceSoapType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WsdlConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsdlConsumerApplication.class, args);
		
		
//		 CountryInfoService countryInfoService = new CountryInfoService();
//		    CountryInfoServiceSoapType countryInfoServiceSoapType = countryInfoService.getCountryInfoServiceSoap();
//		    System.out.println(countryInfoServiceSoapType.capitalCity("RUS"));
		    //output is 'Moscow'
	}

}
