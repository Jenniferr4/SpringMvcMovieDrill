package com.improving;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.*;

@Entity(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "Id", unique=true)
    private Integer id;

    private String title;

    private String director;

    private String protagonist;

    private String year;

    private String review;


//    @JsonCreator
//    public Movie(int id, String title, String author, String protagonist, String year, String review) {
//        this.id = id;
//        this.title = title;
//        this.director = author;
//        this.protagonist = protagonist;
//        this.year = year;
//        this.review = review;
//    }


    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setProtagonist(String protagonist) {
        this.protagonist = protagonist;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
