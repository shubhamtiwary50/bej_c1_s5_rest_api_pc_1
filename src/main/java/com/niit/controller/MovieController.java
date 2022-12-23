package com.niit.controller;

import com.niit.domain.Movie;
import com.niit.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping ("/api/v1")
public class MovieController {

    MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService=movieService;
    }

    @PostMapping("/movie")
    public ResponseEntity<?> saveUser(@RequestBody Movie movie){
        Movie movie1=movieService.addMovie(movie);
        return new ResponseEntity<>(movie1, HttpStatus.CREATED);
    }

    @GetMapping ("/movies")
    public ResponseEntity<?> getAllUser(){
        List<Movie> list = movieService.getAllMovies();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
