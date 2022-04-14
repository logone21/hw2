package com.company;

import java.util.Random;

public class Main {

    public static int generateRandomAge(){
        Random random = new Random();
        int randomInt = random.nextInt((46-20)+1)+20;
        return randomInt;
    }

    public static void main(String[] args) {
        System.out.println(text(generateRandomAge(),32));
        System.out.println(text(generateRandomAge(),-15));
        System.out.println(text(generateRandomAge(),25));
        System.out.println(text(generateRandomAge(),-16));
        System.out.println(text(generateRandomAge(),14));
    }

    public static String text(int agePerson, int temperature) {
        String text = "";

        //здесь нельзя использовать printl, он используеться в void//

        if (temperature > -20 && temperature < 30 && agePerson > 20 && agePerson < 30) {
            text += "можно идти гулять";
        } else if (temperature > 0 && temperature < 28 && agePerson < 20) {
            text += "можно идти гулять";
        } else if (agePerson < 45 && temperature > -10 && temperature < 25) {
            text += "можно идти гулять";
        } else {
            text += "оставайтесь дома";
        }
        return text;
    }
}



