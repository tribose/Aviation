package com.honeywell.Aviation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.honeywell.Aviation.model.FlightDetails;

@Repository
public interface AviationReporistory extends MongoRepository<FlightDetails, String> {
}
