package com.nrcr.nrcrbackend;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;


public interface RaceRepository extends MongoRepository<Races, String>{
    Races findBy_id(ObjectId _id);
}