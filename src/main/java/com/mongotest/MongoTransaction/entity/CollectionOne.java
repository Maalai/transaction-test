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
@Document("CollectionOne")
public class CollectionOne {
    @Id
    private int collectionOneId;
    private String firstName;
    private String lastName;
}
