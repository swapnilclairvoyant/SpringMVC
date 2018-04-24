package com.clairvoyant.mvc.countryServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clairvoyant.mvc.countryService.CountryService;
import com.clairvoyant.mvc.model.Country;
import com.clairvoyant.mvc.utility.Utilities;


@Service
public class CountryServiceImpl implements CountryService {
	@Autowired
	Utilities util;
	public List<Country> getAllCountries() {

		return util.createCountryList();
	}
	public Country getSelectedCountry(int id) {
		
		return util.createCountryList().stream().filter(s->s.getId()==id).findFirst().orElse(null);
	}
	
	
}
