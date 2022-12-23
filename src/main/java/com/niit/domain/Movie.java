package com.niit.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

    private String movieName;
    @Id
    private int movieID;
    private String actorName;
    private String directorName;

    public Movie() {
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieID=" + movieID +
                ", actorName='" + actorName + '\'' +
                ", directorName='" + directorName + '\'' +
                '}';
    }
}
