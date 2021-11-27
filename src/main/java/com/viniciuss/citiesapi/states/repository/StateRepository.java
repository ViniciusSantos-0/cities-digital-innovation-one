package com.viniciuss.citiesapi.states.repository;

import com.viniciuss.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
