package com.example.listorpaz;

public class Movie {
    private String movieName;
    private String movieYear;


    public Movie(String movieName, String movieYear) {
        this.movieName = movieName;
        this.movieYear = movieYear;
    }


    public int getMovieName() {
        return movieName;
    }


    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }


    public int getMovieYear() {
        return movieYear;
    }


    public void setMovieYear(String movieYear) {
        this.movieYear = movieYear;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieYear='" + movieYear + '\'' +
                '}';
    }
}

