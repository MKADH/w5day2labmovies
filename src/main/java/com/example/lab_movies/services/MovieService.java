//package com.example.lab_movies.services;
//
//import com.example.lab_movies.models.Movie;
//import com.example.lab_movies.repositories.MovieRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class MovieService {
//    private MovieRepository movieRepository;
//
//    @Autowired
//    public MovieService(MovieRepository movieRepository){
//        this.movieRepository = movieRepository;
//    }
//
//
//    public MovieService() {
//
//    }
//
//    public Movie addNewMovie() {
//        Movie movie = new Movie();
//        return movieRepository.save(movie);
//    }
//
//    public ArrayList<Movie> getAllMovies() {
//        List<Movie> movieList = movieRepository.findAll();
//        return new ArrayList<>(movieList);
//    }
//
//    public Optional<Movie> getMovieById(Integer id) {
//        return movieRepository.findById(id);
//    }
//}






package com.example.lab_movies.services;

import com.example.lab_movies.models.Movie;
import com.example.lab_movies.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service


public class MovieService {

    @Autowired
        MovieRepository movieRepository;

    public MovieService(){

    }

    public ArrayList<Movie> getAllMovies() {
        List<Movie> movieList = movieRepository.findAll();
        return new ArrayList<>(movieList);
    }


    //    method to retrieve a movie from the database by its id
    public Movie getMovieById(Integer id) {
        return movieRepository.findById(id).orElse(null);
    }


    //    method for adding a new movie object to the database
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}

