package com.clairvoyant.mvc.utility;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.clairvoyant.mvc.model.Country;
@Service
public class Utilities {
	public List<Country> createCountryList() {
		  Country indiaCountry=new Country(1, "India");
		  Country chinaCountry=new Country(4, "China");
		  Country nepalCountry=new Country(3, "Nepal");
		  Country bhutanCountry=new Country(2, "Bhutan");
		 
		  List<Country> listOfCountries = new ArrayList<Country>();
		  listOfCountries.add(indiaCountry);
		  listOfCountries.add(chinaCountry);
		  listOfCountries.add(nepalCountry);
		  listOfCountries.add(bhutanCountry);
		  return listOfCountries;
	}
}
