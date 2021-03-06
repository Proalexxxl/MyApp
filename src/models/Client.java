package models;

import base.Discount;
import base.Payment;

public class Client implements Payment, Discount {

    private String name;
    private int quantity;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double calcDiscount(double payment, double discountRate) {
        return payment * discountRate / 100;
    }

    @Override
    public double calcPayment(int quantity, double price) {
        return quantity * price;
    }
}
