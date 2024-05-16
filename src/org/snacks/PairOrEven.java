package org.snacks;
import java.util.Scanner;

public class PairOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("set a number: ");
        int number =  Integer.parseInt(scanner.nextLine());

        if (number%2== 0 && number!=0) {
            System.out.println("pair");
        }else if(number%2!= 0 ) {
            System.out.println("even");
        }else{
            System.out.println("boh è 0");
        }
        scanner.close();
    }
}
