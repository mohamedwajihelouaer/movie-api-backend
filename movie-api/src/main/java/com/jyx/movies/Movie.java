package com.jyx.movies;

import java.time.LocalDate;

public class Movie {

    private Long id;
    private String title;
    private LocalDate releasedOn;

    public Movie() {
    }

    public Movie(Long id, String title, LocalDate releasedOn) {
        this.id = id;
        this.title = title;
        this.releasedOn = releasedOn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(LocalDate releasedOn) {
        this.releasedOn = releasedOn;
    }
}
