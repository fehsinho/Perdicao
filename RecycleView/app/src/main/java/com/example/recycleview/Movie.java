package com.example.recycleview;

public class Movie {
    private String tittle, genre, year;

    public Movie(){
    }

    public Movie(String tittle, String genre, String year){
        this.tittle = tittle;
        this.genre = genre;
        this.year = year;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}


