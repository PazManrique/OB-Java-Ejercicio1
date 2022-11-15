package com.openbootcamp;

public class Functions {

    public static void main(String[] args) {

        double price1 = getPrice(10);
        System.out.println("El resultado final es " + price1);
    }

    static double getPrice (double price) {

        double result = price + price*0.21;
        return result;

    }


}
