package com.springrest.api.movies.application.repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import com.springrest.api.movies.domain.Movie;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MovieRepository {

    private Map<String, Movie> moviesMap = new HashMap<>();

    @PostConstruct
    public void initData() {
        
        var moviesList = Arrays.asList(
            new Movie("Who knows", "2016", "Romance", "After moving to a new town..."),
            new Movie("Damn Robots", "2011", "Sci-fi", "In the near future..."),
            new Movie("I am Briar", "2019", "Action", "Briar decided to challenge the drift king but..."),
            new Movie("Cat pawns", "2010", "Comedy", "After losing his job..."),
            new Movie("Pixelated", "2013", "Drama", "Suffering from a past trauma..."),
            new Movie("I am Briar 2", "2020", "Action", "Losing his bet against the drift king...")
        );
        for (Movie movie : moviesList) {
            moviesMap.put(movie.getTitle().toLowerCase(), movie);
        }
        log.info("Lista: {}", moviesMap);
    }

    public Movie findTitle(String title) {
        Assert.notNull(title, "The movie's name must not be null");
        return moviesMap.get(title.toLowerCase());
    }
}