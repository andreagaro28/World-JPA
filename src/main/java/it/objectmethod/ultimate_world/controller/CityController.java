package it.objectmethod.ultimate_world.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.ultimate_world.entity.City;
import it.objectmethod.ultimate_world.service.CityService;

@RestController
@RequestMapping("/api/city")
public class CityController {

	@Autowired
	private CityService cityService;

	@GetMapping("/name")
	public ResponseEntity<City> findByName(@RequestParam("name") String name) {
		ResponseEntity<City> city = cityService.findByName(name);
		return city;
	}

	@GetMapping("/country-code/{countryCode}")
	public ResponseEntity<List<City>> findByCountryCode(@PathVariable("countryCode") String countryCode) {
		ResponseEntity<List<City>> cityList = cityService.findByCountryCode(countryCode);
		return cityList;
	}
}
