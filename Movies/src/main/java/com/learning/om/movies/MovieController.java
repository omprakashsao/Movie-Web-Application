package com.learning.om.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MovieController {

    @Autowired
    private MovieService movieService;

//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable ObjectId id){
//        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(id),HttpStatus.OK);
//    }
    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Movie>> allMovies(){
        return new ResponseEntity<List<Movie>>(movieService.getAllMovies(), HttpStatus.OK);
    }


}
