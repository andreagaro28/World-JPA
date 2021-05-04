package it.objectmethod.ultimate_world.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.ultimate_world.entity.Country;
import it.objectmethod.ultimate_world.service.CountryService;

@RestController
@RequestMapping("/api/country")
public class CountryController {

	@Autowired
	private CountryService countryService;

	@GetMapping("/find-by")
	public ResponseEntity<List<Country>> getElementByNameOrContinentOrBoth(@RequestParam("city") String city,
			@RequestParam("continent") String continent) {

		ResponseEntity<List<Country>> countryList = countryService.getElementByNameOrContinentOrBoth(city, continent);
		return countryList;
	}

	@GetMapping("/find-by-continent")
	public ResponseEntity<List<Country>> findByContinent(@RequestParam("continent") String continent) {
		ResponseEntity<List<Country>> countryList = countryService.findByContinent(continent);
		return countryList;
	}

	@GetMapping("/continents")
	public List<String> getContinents() {
		List<String> continentList = countryService.getContinents();
		return continentList;
	}
}
