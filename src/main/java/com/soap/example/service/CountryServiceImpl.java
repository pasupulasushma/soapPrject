package com.soap.example.service;

import org.oorsprong.websamples.ArrayOftCountryCodeAndName;
import org.oorsprong.websamples.TCurrency;
import org.oorsprong.websamples_countryinfo.CountryInfoService;
import org.oorsprong.websamples_countryinfo.CountryInfoServiceSoapType;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {
	
	

	@Override
	public String getCapitalCity() {
		// TODO Auto-generated method stub
		 CountryInfoService countryInfoService = new CountryInfoService();
		    CountryInfoServiceSoapType countryInfoServiceSoapType = countryInfoService.getCountryInfoServiceSoap();
		    return countryInfoServiceSoapType.capitalCity("RUS");
	}

	@Override
	public TCurrency getCurrency() {
		 CountryInfoService countryInfoService = new CountryInfoService();
	    CountryInfoServiceSoapType countryInfoServiceSoapType = countryInfoService.getCountryInfoServiceSoap();
	    return countryInfoServiceSoapType.countryCurrency("IN");
	}

	@Override
	public ArrayOftCountryCodeAndName getCountries() {
		 CountryInfoService countryInfoService = new CountryInfoService();
	    CountryInfoServiceSoapType countryInfoServiceSoapType = countryInfoService.getCountryInfoServiceSoap();
	    return countryInfoServiceSoapType.listOfCountryNamesByName();

	}

}
