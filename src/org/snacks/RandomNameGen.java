package org.snacks;

import java.util.Random;
public class RandomNameGen {
    public static void main(String[] args) {
        String[] names = {"luca", "paolo", "carlo", "lorenzo", "claudia", "sofia"};
        String[] surnames = {"pane", "pizza", "carne", "dolce", "pasta", "verdure"};
        Random randomGenerator = new Random();
        int randomNum ;
        for (int i = 0; i < 10; i++) {
            randomNum = randomGenerator.nextInt(0, 6);
            System.out.println(names[ randomNum] +" "+surnames[randomNum] );
        }
    }
}
