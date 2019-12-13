package com.improving.controllers;

import com.improving.Movie;
import com.improving.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("product")
public class MovieController {

    @Autowired
    private MovieService productService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        modelMap.put("movie", new Movie());
        return "movie/index";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(@ModelAttribute("movie") Movie movie) {
        productService.update(movie);
        return "movie/success";
    }

}