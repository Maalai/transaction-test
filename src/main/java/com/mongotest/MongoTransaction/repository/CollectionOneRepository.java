package com.mongotest.MongoTransaction.repository;

import com.mongotest.MongoTransaction.entity.CollectionOne;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionOneRepository extends MongoRepository<CollectionOne, Integer> {
}
