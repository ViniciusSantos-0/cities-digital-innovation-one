package com.viniciuss.citiesapi.states.repositories;

import com.viniciuss.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
