package com.example.parkinglot.repository;

import com.example.parkinglot.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
  public User findByUserName (String userName);
}
