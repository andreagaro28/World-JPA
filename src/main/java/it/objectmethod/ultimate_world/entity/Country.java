package it.objectmethod.ultimate_world.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@Column(name = "Code")
	private String code;
	@Column(name = "Name")
	private String name;

	@Column(name = "Continent")
	private String continent;

	@Column(name = "Region")
	private String region;

	@Column(name = "Population")
	private Integer population;

	@Column(name = "SurfaceArea")
	private Float surfaceArea;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public Float getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(Float surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

}
