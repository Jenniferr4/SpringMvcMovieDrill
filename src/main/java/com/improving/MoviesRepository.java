package com.improving;

import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class MoviesRepository {
    public List<Movie> movies = new ArrayList<>();


    public MoviesRepository(List<Movie> movies) {
        this.movies = movies;
        movies.add(new Movie(1,"JenniferDocumentary", "Jennifer", "Jenni", "1998", "Best Movie EVER!" ));
        movies.add(new Movie(2,"Finding Dory", "Dr.Fish", "BlueFish", "2015", "It was OK." ));
        movies.add(new Movie(3,"Finding Nemo", "Dr.Fish", "ClownFish", "2001", "Better than future Dory." ));
        movies.add(new Movie(4, "Angular without Boundaries", "Jennifer", "Skyler", "2019", "I Plead the 5th." ));
        movies.add(new Movie(5, "React The Good and the Bad", "Prof. John", "Boot Campers", "2019", "Why why why..." ));
        movies.add(new Movie(6, "Java the Secrets", "Tim", "Boot Campers", "2017", "It was confusing at first..." ));
        movies.add(new Movie(7,"Java part 2", "Dr. Tim", "Boot Campers-Evolved", "1998", "..but now its understandable, maybe..." ));
        movies.add(new Movie(8, "Trust Huddle", "Kelli", "Trust-Buddies", "2016", "Where there's trust, there's hope." ));
        movies.add(new Movie(9,"Second Act", "Jennifer", "Jennifer Lopez", "2014", "WOW just WOW" ));
        movies.add(new Movie(10,"Lamest", "Tissue", "Boxx", "2004", "This was the weirdest movie I've ever seen." ));
    }

    public List<Movie> getMovies() {
        return Collections.unmodifiableList(movies);
    }
//    public Movie getMovie(int id) {
//        return movies.get(id);
//    }


}
