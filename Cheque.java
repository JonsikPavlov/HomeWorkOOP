package com.company.homeWorkOOP;

import com.company.homeWorkOOP.Purchase;

public class Cheque {
    /*   Создать класс покупка Purchase с полями name, price, amount.
     *   Создать класс Cheque, который хранит массив покупок и скидку по карте.
     *   Создать метод, который рассчитывает итоговую сумму с учетом скидки, если карта была преъявлена.*/

    private Purchase[] cheque;
    private final double DISCOUNT_CARD = 0.10;
    private boolean cardIsShown = true;

    public void totalPriceWithDiscount(Purchase... purchase){ //передаю массив товаров(объектов)
            Purchase.showCard(cardIsShown); // проверяю предъявление карты
            double countAmountForOnePurchase = 0;
            double countTotalCost = 0;
            System.arraycopy(purchase, 0, cheque, 0, purchase.length); // передаю массив товаров в массив Чек.
            for (int i = 0; i < cheque.length; i++) {
                 countAmountForOnePurchase = cheque[i].getPrice()*cheque[i].getAmount()*DISCOUNT_CARD;
                 countTotalCost += countAmountForOnePurchase;
                 countAmountForOnePurchase = 0;
            }
        }
    public void totalPriceIfCardHaveNotShown(Purchase... purchase){
            Purchase.noCard(cardIsShown);
        double countAmountForOnePurchase = 0;
        double countTotalCost = 0;
        System.arraycopy(purchase, 0, cheque, 0, purchase.length);
        for (int i = 0; i < cheque.length; i++) {
            countAmountForOnePurchase = cheque[i].getPrice()*cheque[i].getAmount();
            countTotalCost += countAmountForOnePurchase;
            countAmountForOnePurchase = 0;
        }
    }

}
