package com.improving;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;


@Entity(name = "movie")
@SQLDelete(sql="UPDATE movie SET deleted = 1 WHERE id=?")
@Where(clause="deleted = false")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "Id", unique=true)
    private Integer id;

    private String title;

    private String director;

    private String protagonist;

    private int year;

    private String review;

    private boolean deleted = false;

    public boolean isDeleted() {
        return deleted;
    }

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

    public int getYear() {
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

    public void setYear(int year) {
        this.year = year;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
