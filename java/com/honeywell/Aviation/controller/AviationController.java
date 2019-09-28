package com.honeywell.Aviation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.Aviation.model.FlightDetails;
import com.honeywell.Aviation.repository.AviationReporistory;

@RestController
@RequestMapping("/v1/api/flight")
public class AviationController {

	@Autowired
	private AviationReporistory aviationRepository;
	
	@GetMapping("/{id}")
	public Optional<FlightDetails> getFlightDetails(@PathVariable("id") String id) {
		System.out.println("Id : "+id);
		return aviationRepository.findById(id);
	}
}
