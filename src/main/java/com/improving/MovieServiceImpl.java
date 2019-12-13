package com.improving;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("movieService")
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MoviesRepository moviesRepository;

    @Override
    public Movie update(Movie movie){
        return moviesRepository.save(movie);
    }

}
