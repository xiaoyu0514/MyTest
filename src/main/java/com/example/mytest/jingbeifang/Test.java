package com.example.mytest.jingbeifang;

public class Test {

    public static void main(String[] args) {
        // 顾客A
        double totalA = Supermarket.calculateTotalA(2, 3);
        System.out.println("顾客A的总价：" + totalA);
        // 顾客B
        double totalB = Supermarket.calculateTotalB(4, 5, 5);
        System.out.println("顾客B的总价：" + totalB);
        // 顾客C
        double totalC = Supermarket.calculateTotalC(4, 3, 2);
        System.out.println("顾客B的总价：" + totalC);
        // 顾客D
        double totalD = Supermarket.calculateTotalD(7, 3, 7);
        System.out.println("顾客B的总价：" + totalD);
    }
}
