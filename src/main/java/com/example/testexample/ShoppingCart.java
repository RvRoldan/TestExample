package com.example.testexample;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<VideoGame> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addGame(VideoGame game) {
        cart.add(game);
    }

    public double getTotal() {
        double total = 0;
        for (VideoGame game : cart) {
            total += game.getPrice();
        }
        return total;
    }

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (VideoGame game : cart) {
            titles.add(game.getTitle());
        }
        return titles;
    }

    public List<Double> getRatings() {
        List<Double> ratings = new ArrayList<>();
        for (VideoGame game : cart) {
            ratings.add(game.getRating());
        }
        return ratings;
    }

    public List<String> getGenres() {
        List<String> genres = new ArrayList<>();
        for (VideoGame game : cart) {
            genres.add(game.getGenre());
        }
        return genres;
    }
}