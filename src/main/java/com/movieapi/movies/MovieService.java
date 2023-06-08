package com.movieapi.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// This class is used to interact with the database
@Service
public class MovieService {

    // This annotation is used to inject the MovieRepository class into this class
    @Autowired
    private MovieRepository movieRepository;

    // This method returns all the movies in the database
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
