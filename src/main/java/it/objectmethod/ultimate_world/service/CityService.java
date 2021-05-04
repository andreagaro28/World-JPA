package it.objectmethod.ultimate_world.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import it.objectmethod.ultimate_world.entity.City;
import it.objectmethod.ultimate_world.repository.CityRepo;

@Service
public class CityService {

	@Autowired
	private CityRepo cityRepo;

	public ResponseEntity<City> findByName(String name) {
		City city = null;
		ResponseEntity<City> resp = null;

		Optional<City> optCity = cityRepo.findByName(name);
		if (optCity.isPresent()) {
			city = optCity.get();
			resp = new ResponseEntity<City>(city, HttpStatus.OK);
		} else {
			resp = new ResponseEntity<City>(HttpStatus.NO_CONTENT);
		}

		return resp;
	}

	public ResponseEntity<List<City>> findByCountryCode(String countryCode) {
		List<City> cityList = cityRepo.findByCountryCode(countryCode);
		ResponseEntity<List<City>> resp = null;

		if (cityList.isEmpty()) {
			resp = new ResponseEntity<List<City>>(HttpStatus.NO_CONTENT);
		} else {
			resp = new ResponseEntity<List<City>>(cityList, HttpStatus.OK);
		}

		return resp;

	}
}
