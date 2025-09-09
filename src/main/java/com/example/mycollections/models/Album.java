package com.example.mycollections.models;

public class Album {
    private String title;
    private String artist;
    private int year;
    private int trackCount;

    public Album(String title, String artist, int year, int trackCount) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.trackCount = trackCount;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    public int getTrackCount() {
        return trackCount;
    }

    @Override
    public String toString() {
        return title + " — " + artist + " (" + year + "), " + trackCount + " tracks";
    }
}