package com.example.testexample;

public class VideoGame {
    private String title;
    private double price;
    private double rating;
    private String genre;

    public VideoGame(String title, double price, double rating, String genre) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }
}