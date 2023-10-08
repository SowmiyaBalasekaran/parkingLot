package com.example.parkinglot.repository;

import com.example.parkinglot.entity.ParkingLot;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParkingLotRepository extends MongoRepository<ParkingLot, String> {
}
