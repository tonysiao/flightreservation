package com.bharath.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.flightreservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
