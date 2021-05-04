package it.objectmethod.ultimate_world.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.objectmethod.ultimate_world.entity.City;

@Repository
public interface CityRepo extends JpaRepository<City, Long> {

	public Optional<City> findByName(String name);

	public List<City> findByCountryCode(String countryCode);

}
