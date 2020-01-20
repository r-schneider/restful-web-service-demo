package com.springrest.api.movies.application.controller;

import com.springrest.api.movies.domain.Movie;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(path = "/movies", produces = MediaType.APPLICATION_JSON_VALUE)
public interface MovieController {

    @GetMapping(value = "/search")
    @ResponseBody
    Movie searchMovieByTitle(@RequestParam String title);
}