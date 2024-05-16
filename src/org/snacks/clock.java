package org.snacks;

public class clock {
    public static void main(String[] args) {
        int input = 389665;
        int hours = input / 3600;
        int remainingSeconds = input  % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;


        String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);


        System.out.println("Tempo convertito: " + time);
    }
}
