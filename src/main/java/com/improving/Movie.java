package com.improving;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Collections;
import java.util.List;

public class Movie {
    private final int id;
    private final String name;
    private final String director;
    private final String protagonist;
    private final String year;
    private final String review;


    @JsonCreator
    public Movie(int id, String name, String author, String protagonist, String year, String review) {
        this.id = id;
        this.name = name;
        this.director = author;
        this.protagonist = protagonist;
        this.year = year;
        this.review = review;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public String getProtagonist() {
        return protagonist;
    }

    public String getYear() {
        return year;
    }

    public String getReview() {
        return review;
    }
}
