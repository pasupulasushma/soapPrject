package com.soap.example.service;

import org.oorsprong.websamples.ArrayOftCountryCodeAndName;
import org.oorsprong.websamples.TCurrency;
import org.oorsprong.websamples_countryinfo.CountryInfoService;

public interface CountryService {
	
	public String getCapitalCity();

	public TCurrency getCurrency();

	public ArrayOftCountryCodeAndName getCountries();

}
