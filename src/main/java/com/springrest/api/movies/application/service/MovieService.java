package com.springrest.api.movies.application.service;

import com.springrest.api.movies.domain.Movie;

public interface MovieService {

    Movie getMovieByTitle(String title);
}