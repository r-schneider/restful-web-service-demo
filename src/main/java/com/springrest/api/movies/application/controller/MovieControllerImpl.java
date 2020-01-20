package com.springrest.api.movies.application.controller;

import com.springrest.api.movies.application.service.MovieService;
import com.springrest.api.movies.domain.Movie;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieControllerImpl implements MovieController {

    private final MovieService service;

    public MovieControllerImpl(MovieService service) {
        this.service = service;
    }
    
    @Override
    public Movie searchMovieByTitle(String title) {
        return service.getMovieByTitle(title);
    }
}