package com.soap.example.service;

import org.oorsprong.websamples.ArrayOftCountryCodeAndName;
import org.oorsprong.websamples.TCurrency;
import org.oorsprong.websamples_countryinfo.CountryInfoService;

public interface CountryService {
	
	public String getCapitalCity(String country);

	public TCurrency getCurrency(String country);

	public ArrayOftCountryCodeAndName getCountries();

}
