package org.snacks;

import static java.lang.Character.getType;

public class StringAnalisis {
    public static void main(String[] args) {
        String string= "appahhhppal123123----";
        int letters = 0;
        int digits = 0;
        int others= 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                letters++;
            } else if (Character.isDigit(string.charAt(i))) {
                digits++;
            } else {
                others++;
            }
        }
        System.out.println(letters+ "  " + digits + "   "+ others);
    }

}
