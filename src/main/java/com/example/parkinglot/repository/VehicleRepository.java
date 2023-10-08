package com.example.parkinglot.repository;

import com.example.parkinglot.entity.Vechile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VechileRepository extends MongoRepository<Vechile, String> {
  public Vechile findByVe

}
