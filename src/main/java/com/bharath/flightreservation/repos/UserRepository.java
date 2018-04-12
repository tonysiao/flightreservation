package com.bharath.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}