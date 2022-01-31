package com.company.homeWorkOOP;

import com.company.homeWorkOOP.Purchase;

public class Cheque {
    /*   Создать класс покупка Purchase с полями name, price, amount.
     *   Создать класс Cheque, который хранит массив покупок и скидку по карте.
     *   Создать метод, который рассчитывает итоговую сумму с учетом скидки, если карта была преъявлена.*/

    private Purchase[] cheque;
    private static final double DISCOUNT_CARD = 0.10;
    private static final double NO_CARD = 1;
    private boolean cardIsShown = true;


    private double calculatorForCheque(Purchase... purchase) {
        double countAmountForOnePurchaseWithoutDiscount = 0;
        double countTotalCostWithoutDiscount = 0;
        System.arraycopy(purchase, 0, cheque, 0, purchase.length); // передаю массив товаров в массив Чек.
        for (int i = 0; i < cheque.length; i++) {
            countAmountForOnePurchaseWithoutDiscount = cheque[i].getPrice() * cheque[i].getAmount();
            countTotalCostWithoutDiscount += countAmountForOnePurchaseWithoutDiscount;
        }
        return countTotalCostWithoutDiscount;
    }

    public void totalPriceWithDiscount(Purchase... purchase) {
        double total = calculatorForCheque() * Purchase.showCard(DISCOUNT_CARD);
        System.out.println("total cost with discount\t" + total);
    }

    public void totalPriceIfCardHaveNotShown(Purchase... purchase) {
        System.out.println("total cost without discount\t" + calculatorForCheque() * Purchase.noCard(NO_CARD));
        }
    }

