package com.mongotest.MongoTransaction.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("CollectionTwo")
public class CollectionTwo {
    @Id
    private int collectionTwoId;
    private String firstName;
    private String lastName;
}
