package com.viniciuss.citiesapi.countries.repository;

import com.viniciuss.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
