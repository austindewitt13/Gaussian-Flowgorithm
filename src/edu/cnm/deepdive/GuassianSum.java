package edu.cnm.deepdive;


import java.util.Scanner;

public class GuassianSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int upperLimit;
        
        upperLimit = -1;
        long sum;
        
        while (upperLimit < 1 || upperLimit > 10000000) {
            System.out.println("input a value between 1 and 1000000");
            upperLimit = input.nextInt();
            if (upperLimit > 1) {
            } else {
                System.out.println("Not a correct value, please try again.");
            }
        }
        sum = 0;
        int i;
        
        for (i = 1; i <= upperLimit; i++) {
            sum = (long) upperLimit * (upperLimit + 1)/2;
        }
        System.out.println(sum);
    }
}
