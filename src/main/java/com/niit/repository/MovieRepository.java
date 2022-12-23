package com.niit.repository;

import com.niit.domain.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie,Integer>  {
}
