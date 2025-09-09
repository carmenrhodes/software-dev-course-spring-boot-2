package com.example.mycollections.models;

public class Movie {
    private String title;
    private String director;
    private int year;
    private int runtimeMinutes;

    public Movie(String title, String director, int year, int runtimeMinutes) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.runtimeMinutes = runtimeMinutes;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }

    @Override
    public String toString() {
        return title + " — directed by " + director + " (" + year + "), " + runtimeMinutes + " min";
    }
}