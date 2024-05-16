package org.snacks;

public class palindrome {
    public static void main(String[] args) {
        String string= "appappal";
        boolean check = true;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(string.length()-1-i)){
                check=false;
            }



        }

        System.out.println("palindroma:" + check);

    }
}
