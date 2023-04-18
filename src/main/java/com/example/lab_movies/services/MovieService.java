package com.example.lab_movies.services;

import com.example.lab_movies.models.Movie;
import com.example.lab_movies.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
        @Autowired
        MovieRepository movieRepository;
        private String currentMovie;
        private ArrayList<String> chosenMovies;

        public MovieService(){

        }

    public Movie addNewMovie(){
        Movie movie = new Movie();
        this.currentMovie = getCurrentMovie();
        this.chosenMovies = new ArrayList<>();
        return movieRepository.save(movie);
    }
    public Movie processMovie(Movie movie, int id){
            Movie movies = movieRepository.findById(1).get();
            if(this.chosenMovies.contains("")){
                return movies;
            }


        this.chosenMovies.contains("");
        movieRepository.save(movie);


        return movies;
    }
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movie> getMovieById(int id){
        return movieRepository.findById(id);

    }
    public MovieRepository getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public String getCurrentMovie() {
        return currentMovie;
    }

    public void setCurrentMovie(String currentMovie) {
        this.currentMovie = currentMovie;
    }

    public ArrayList<String> getChosenMovies() {
        return chosenMovies;
    }

    public void setChosenMovies(ArrayList<String> chosenMovies) {
        this.chosenMovies = chosenMovies;
    }
}
