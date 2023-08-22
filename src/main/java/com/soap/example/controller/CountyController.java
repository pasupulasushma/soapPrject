package com.soap.example.controller;

import org.oorsprong.websamples.ArrayOftCountryCodeAndName;
import org.oorsprong.websamples.TCurrency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soap.example.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountyController {

	@Autowired
	CountryService service;

	@GetMapping("/list")
	public ArrayOftCountryCodeAndName getCountry() {
		return service.getCountries();
	}

	@GetMapping("/capitalCity")
	public String getCapitalCity() {
		return service.getCapitalCity();
	}

	@GetMapping("/currency")
	public TCurrency getCountryCurency() {
		return service.getCurrency();
	}

}
