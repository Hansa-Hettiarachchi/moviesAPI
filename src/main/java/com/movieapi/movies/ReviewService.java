package com.movieapi.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    // ReviewRepository is an interface that extends MongoRepository
    private ReviewRepository reviewRepository;
    @Autowired
    // MongoTemplate is a class that implements MongoOperations
    private MongoTemplate mongoTemplate;

    // createReview method takes in a reviewBody and imdbId
    public Review createReview(String reviewBody, String imdbId){
        Review review = reviewRepository.insert(new Review(reviewBody)); // insert a new review into the database

        // update the movie with the given imdbId by pushing the review into the reviewIds array
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))// find the movie with the given imdbId
                .apply(new Update().push("reviewIds").value(review)) // push the review into the reviewIds array
                .first(); // update the first movie found

        return review;
    }
}
