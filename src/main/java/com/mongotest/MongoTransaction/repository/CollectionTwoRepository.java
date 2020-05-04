package com.mongotest.MongoTransaction.repository;

import com.mongotest.MongoTransaction.entity.CollectionTwo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionTwoRepository extends MongoRepository<CollectionTwo, Integer> {
}
