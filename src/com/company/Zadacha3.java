package com.company;

import java.util.Scanner;

public class Zadacha3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number");
        int number = input.nextInt();
        number = (number < 0 ? -number : number);
        System.out.println(number);
    }
}