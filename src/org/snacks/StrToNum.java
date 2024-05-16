package org.snacks;

public class StrToNum {
    public static void main(String[] args) {

        String input = "28889";
        int output = 0 ;

        for (int i = 0; i < input.length(); i++) {
            char digit = input.charAt(i);
            output = output * 10 + (digit - '0');
        }

        System.out.println("Il numero intero è: " + output);


    }

}
