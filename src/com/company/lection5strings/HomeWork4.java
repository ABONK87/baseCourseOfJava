package com.company.lection5strings;

public class HomeWork4 {
    public static void main(String[] args) {//Напишите два цикла выполняющих многократное сложение строк
        StringBuilder str = new StringBuilder("A1");
        StringBuilder str1 = new StringBuilder("A1");
        StringBuilder str2;
        int k = (int) (Math.random() * 1000);
        long t = System.currentTimeMillis();
        str.append("A1".repeat(Math.max(0, k)));
        System.out.println(str);
        long t1 = System.currentTimeMillis() - t;
        System.out.println("Время выполнения программы со String: " + t1);
        long t2 = System.currentTimeMillis();
        str1.append("A1".repeat(Math.max(0, k)));
        System.out.println(str1);
        long t3 = System.currentTimeMillis() - t2;
        System.out.println("Время выполнения программы со StringBuilder: " + t3);
    }
}
