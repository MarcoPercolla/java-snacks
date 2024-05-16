package org.snacks;

public class EvenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int result= 0;

        for (int i = 1; i <= arr.length; i++) {
            if (i%2==0){
                result += arr[i-1] ;

            }


        }

        System.out.println(result );
    }
}
