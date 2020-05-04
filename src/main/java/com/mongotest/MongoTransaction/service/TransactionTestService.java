package com.mongotest.MongoTransaction.service;


import com.mongotest.MongoTransaction.entity.CollectionOne;
import com.mongotest.MongoTransaction.entity.CollectionTwo;
import com.mongotest.MongoTransaction.repository.CollectionOneRepository;
import com.mongotest.MongoTransaction.repository.CollectionTwoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

@Service
public class TransactionTestService {

    private final CollectionOneRepository collectionOneRepository;
    private final CollectionTwoRepository collectionTwoRepository;

    TransactionTestService(CollectionOneRepository coRepo, CollectionTwoRepository ctRepo) {
        this.collectionOneRepository = coRepo;
        this.collectionTwoRepository = ctRepo;
    }

    @Transactional
    public void insetDocuments() throws Exception{
        int id = new Random().nextInt();
        CollectionOne co = CollectionOne.builder().collectionOneId(id).firstName("Maalai").lastName("s").build();
        CollectionTwo to = CollectionTwo.builder().collectionTwoId(id).firstName("Maalai").lastName("s").build();
        collectionOneRepository.save(co);
        saveCollectionTwo(to);
    }

    private void saveCollectionTwo(CollectionTwo ct) {
        collectionTwoRepository.save(ct);
        throw new RuntimeException("Error");
    }
}
