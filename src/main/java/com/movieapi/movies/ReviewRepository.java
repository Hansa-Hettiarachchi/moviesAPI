package com.movieapi.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
// This interface is used to create a repository for the Review class
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
