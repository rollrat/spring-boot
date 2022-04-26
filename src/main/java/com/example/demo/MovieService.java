package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {
    public List<Movie> query(final String query) {
        return Arrays.asList(
                Movie.builder().title("영화1").link("http://test").build(),
                Movie.builder().title("영화2").link("http://test").build()
        );
    }
}


