package com.niit.service;

import com.niit.domain.Movie;

import java.util.List;

public interface MovieService {

    public Movie addMovie(Movie movie);

    public List<Movie> getAllMovies();

}
