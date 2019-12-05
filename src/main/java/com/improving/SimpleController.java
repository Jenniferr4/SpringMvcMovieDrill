package com.improving;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.print.Book;
import java.security.Principal;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping
public class SimpleController {

    private MoviesRepository moviesRepository ;

    public SimpleController(MoviesRepository moviesRepository){
        this.moviesRepository = moviesRepository;
    }

    @GetMapping("/movies")
    public List<Movie> movies() {
        return moviesRepository.getMovies();
    }
}


//    @RequestMapping(value = "/home", method= RequestMethod.GET)
//    public String home(ModelMap model, Principal principal){
//        model.put("movie", new Movie(0,"", "", "", "", ""));
//        setCommonModelAttribute(model);
//        return "home";
//    }
//
//    private void setCommonModelAttribute(ModelMap model) {
//        model.put("books", moviesRepository.getMovies());
//    }


