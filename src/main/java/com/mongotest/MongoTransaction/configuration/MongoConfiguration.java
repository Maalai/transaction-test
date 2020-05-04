package com.mongotest.MongoTransaction.configuration;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.mongotest.MongoTransaction.repository")
public class MongoConfiguration extends AbstractMongoClientConfiguration {

    @Bean
    MongoTransactionManager transactionManager(MongoDbFactory dbFactory) {
        return new MongoTransactionManager(dbFactory);
    }

    @Override
    public MongoClient mongoClient() {
        String connectionString = "mongodb://localhost:27017";

        return MongoClients.create(MongoClientSettings.builder()
                .applyConnectionString(new
                        ConnectionString(connectionString)).build());
    }

    @Override
    protected String getDatabaseName() {
        return "TransactionTest";
    }
}
