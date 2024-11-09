package com.example.mytest.jingbeifang;

public class Supermarket {
    private static final double APPLE_PRICE = 8.0;
    private static final double STRAWBERRY_PRICE = 13.0;
    private static final double MANGO_PRICE = 20.0;

    public static double calculateTotalA(int appleWeight, int strawberryWeight) {
        return (APPLE_PRICE * appleWeight) + (STRAWBERRY_PRICE * strawberryWeight);
    }

    public static double calculateTotalB(int appleWeight, int strawberryWeight, int mangoWeight) {
        return (APPLE_PRICE * appleWeight) + (STRAWBERRY_PRICE * strawberryWeight) + (MANGO_PRICE * mangoWeight);
    }

    public static double calculateTotalC(int appleWeight, int strawberryWeight, int mangoWeight) {
        double strawberryDiscountedPrice = STRAWBERRY_PRICE * 0.8;
        return (APPLE_PRICE * appleWeight) + (strawberryDiscountedPrice * strawberryWeight) + (MANGO_PRICE * mangoWeight);
    }

    public static double calculateTotalD(int appleWeight, int strawberryWeight, int mangoWeight) {
        double strawberryDiscountedPrice = STRAWBERRY_PRICE * 0.8;
        double total = (APPLE_PRICE * appleWeight) + (strawberryDiscountedPrice * strawberryWeight) + (MANGO_PRICE * mangoWeight);
        if (total >= 100) {
            total -= 10;
        }
        return total;
    }
}
