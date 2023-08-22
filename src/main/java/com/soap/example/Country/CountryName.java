package com.soap.example.Country;

public class CountryName {
	
	private int id;
	private String Country;
	private int capital;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getCapital() {
		return capital;
	}
	public void setCapital(int capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "CountryName [id=" + id + ", Country=" + Country + ", capital=" + capital + "]";
	}
	public CountryName(int id, String country, int capital) {
		super();
		this.id = id;
		Country = country;
		this.capital = capital;
	}
	public CountryName() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
