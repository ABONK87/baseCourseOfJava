package com.company.lection5strings;

public class HomeWork2 {
    public static void main(String[] args) {//Имеется строка с текстом. Подсчитать количество слов в тексте
        String str = "  Зима без, cнега! И мороза and!";
        String str1 = str.trim();
        int num = 0;
        for (int i = 1; i < str1.length(); i++) {
            if (i == str1.length() - 1 && str1.charAt(i) >=65) {
                num++;
            }
            else {
                if (str1.charAt(i) >= 65 && str1.charAt(i + 1) < 65){
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}
