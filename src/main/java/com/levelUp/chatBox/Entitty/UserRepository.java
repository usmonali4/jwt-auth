package com.levelUp.chatBox.Entitty;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId>{
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}
