package com.springrest.api.movies.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {

    private String title;
    private String year;
    private String genre;
    private String synopsis;

    public Movie() {

    }
}