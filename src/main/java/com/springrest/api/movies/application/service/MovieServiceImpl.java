package com.springrest.api.movies.application.service;

import com.springrest.api.movies.domain.repository.MovieRepository;
import com.springrest.api.movies.domain.Movie;

import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    
    private final MovieRepository repository;

    public MovieServiceImpl(MovieRepository repository) {
        this.repository = repository;
    }

    @Override
    public Movie getMovieByTitle(String title){
        return repository.findTitle(title);
    }
}