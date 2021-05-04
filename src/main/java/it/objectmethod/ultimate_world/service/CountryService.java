package it.objectmethod.ultimate_world.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import it.objectmethod.ultimate_world.entity.Country;
import it.objectmethod.ultimate_world.repository.CountryRepo;

@Service
public class CountryService {

	@Autowired
	private CountryRepo countryRepo;

	public ResponseEntity<List<Country>> getElementByNameOrContinentOrBoth(String city, String continent) {
		List<Country> countryList = countryRepo.getElementByNameOrContinentOrBoth(city, continent);
		ResponseEntity<List<Country>> resp = null;

		if (countryList.isEmpty()) {
			resp = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			resp = new ResponseEntity<>(countryList, HttpStatus.OK);

		}

		return resp;
	}

	public ResponseEntity<List<Country>> findByContinent(String continent) {
		List<Country> countryList = countryRepo.findByContinent(continent);
		ResponseEntity<List<Country>> resp = null;

		if (countryList.isEmpty()) {
			resp = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			resp = new ResponseEntity<>(countryList, HttpStatus.OK);
		}

		return resp;
	}

	public List<String> getContinents() {
		List<String> continentList = countryRepo.getContinents();
		return continentList;
	}

}
