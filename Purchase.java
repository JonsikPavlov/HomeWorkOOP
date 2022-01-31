package com.company.homeWorkOOP;

public class Purchase {
 /*   Создать класс покупка Purchase с полями name, price, amount.
 *   Создать класс Cheque, который хранит массив покупок и скидку по карте.
 *   Создать метод, который рассчитывает итоговую сумму с учетом скидки, если карта была преъявлена.*/
    private String name;
    private double price;
    private int amount;

    public Purchase(String name, double price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public static boolean showCard(boolean showDiscountCard){
        return showDiscountCard = true;
    }

    public static boolean noCard(boolean showDiscountCard){
        return showDiscountCard = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
