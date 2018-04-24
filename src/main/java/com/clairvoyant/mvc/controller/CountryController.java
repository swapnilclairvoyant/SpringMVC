package com.clairvoyant.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clairvoyant.mvc.countryService.CountryService;
import com.clairvoyant.mvc.model.Country;

@RestController
public class CountryController {
	@Autowired
	CountryService cservice;
	
	@RequestMapping(value="/countries")
	public List<Country> showAllCountrues() {
		return cservice.getAllCountries();
	}
	
	@RequestMapping("/country/{id}")
	public Country showCountry(@PathVariable("id") int id) {
		return cservice.getSelectedCountry(id);
	}
}
