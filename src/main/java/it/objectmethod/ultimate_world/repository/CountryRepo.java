package it.objectmethod.ultimate_world.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.objectmethod.ultimate_world.entity.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, String> {

	@Query(value = "select x from Country x where ('' = ?1 or x.name = ?1) and  ('' = ?2 or x.continent = ?2)")
	public List<Country> getElementByNameOrContinentOrBoth(String city, String continent);

	public List<Country> findByContinent(String continent);

	@Query(value = "select distinct continent from Country")
	public List<String> getContinents();

}
