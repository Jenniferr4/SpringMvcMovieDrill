package com.improving;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.awt.print.Book;
import java.net.URI;
import java.security.Principal;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping
public class SimpleController {

    @Autowired
    private MoviesRepository moviesRepository;


    @GetMapping(path = "/movies")
    public @ResponseBody Iterable<Movie> getAllMovies() {
        return moviesRepository.findAll();
    }

    @GetMapping("/movies/{id}")
    public Movie findById(@PathVariable Integer id) {
        return moviesRepository.findById(id).get();
    }

    @PostMapping("/movies")
    public ResponseEntity<Movie> newMovie(@RequestBody Movie movie){
        Movie savedMovie = moviesRepository.save(movie);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedMovie.getId()).toUri();
        return ResponseEntity.created(location).build();
    }


    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie, @PathVariable Integer id){
        Movie savedMovie = moviesRepository.save(movie);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedMovie.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/movies/{id}")
    public void deleteMovie(@PathVariable Integer id) {

        moviesRepository.deleteById(id);
    }

}




