package com.learning.om.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> getAllMovies(){
      return   movieRepository.findAll();
    }

//    public Optional<Movie> singleMovie(ObjectId id){
//        return movieRepository.findById(id);
//    }

      public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMoiveByImdbId(imdbId);
      }
}
