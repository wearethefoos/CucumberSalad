package org.example;

public class Fridge {
    private int stock;

    public Fridge(int stock) {
        this.stock = stock;
    }

    public void Take(int amount) {
        stock = stock - amount;
    }

    public int getStock() {
        return stock;
    }
}