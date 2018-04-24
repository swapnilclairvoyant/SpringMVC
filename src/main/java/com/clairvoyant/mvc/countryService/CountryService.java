package com.clairvoyant.mvc.countryService;

import java.util.List;

import com.clairvoyant.mvc.model.Country;

public interface CountryService {
	public List<Country> getAllCountries();
	public Country getSelectedCountry(int id);
}
