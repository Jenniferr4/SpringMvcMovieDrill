package com.improving;

//import com.improving.database.JPAUtility;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.swing.text.html.parser.Entity;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public interface MoviesRepository extends CrudRepository<Movie, Integer> {





}
