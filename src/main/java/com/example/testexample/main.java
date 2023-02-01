package com.example.testexample;

public class main {
    public static void main(String[] args) {
        VideoGame game1 = new VideoGame("The Legend of Zelda: Breath of the Wild", 59.99, 9.0, "Action-adventure");
        VideoGame game2 = new VideoGame("Super Mario Odyssey", 59.99, 9.0, "Platformer");
        VideoGame game3 = new VideoGame("Red Dead Redemption 2", 59.99, 9.0, "Action-adventure");
        VideoGame game4 = new VideoGame("Minecraft", 19.99, 8.0, "Sandbox");
        VideoGame game5 = new VideoGame("Animal Crossing: New Horizons", 59.99, 9.0, "Simulation");

        ShoppingCart cart = new ShoppingCart();
        cart.addGame(game1);
        cart.addGame(game2);
        cart.addGame(game3);
        cart.addGame(game4);
        cart.addGame(game5);

        System.out.println("Total Value of Games in Cart: $" + cart.getTotal());
        System.out.println("All Genres: " + cart.getGenres());
        System.out.println("All Ratings: " + cart.getRatings());
        System.out.println("All Titles: " + cart.getTitles());
    }
}