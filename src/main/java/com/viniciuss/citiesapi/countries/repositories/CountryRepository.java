package com.viniciuss.citiesapi.countries.repositories;

import com.viniciuss.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
