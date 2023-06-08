package com.movieapi.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// This interface is used to interact with the database
@Repository
// MongoRepository is a Spring Data interface for generic CRUD operations on a repository of a specific type.
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieByImdbId(String imdbId);
}
