package com.levelUp.chatBox.Entitty;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;


public interface UserRepository extends MongoRepository<User, ObjectId>{
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}
