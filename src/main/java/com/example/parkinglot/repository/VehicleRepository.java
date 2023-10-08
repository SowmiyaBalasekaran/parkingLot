package com.example.parkinglot.repository;

import com.example.parkinglot.entity.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends MongoRepository<Vehicle, String> {
  public Vehicle findByVehicleNo(String vehicleNo);

}
