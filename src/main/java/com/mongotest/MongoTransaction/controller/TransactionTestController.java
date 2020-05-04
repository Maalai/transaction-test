package com.mongotest.MongoTransaction.controller;

import com.mongotest.MongoTransaction.service.TransactionTestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionTestController {

    private final TransactionTestService transactionTestService;

    TransactionTestController(TransactionTestService transactionTestService) {
        this.transactionTestService = transactionTestService;
    }

    @GetMapping("/test")
    public ResponseEntity<String> transactionTest() throws Exception{
        transactionTestService.insetDocuments();
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
