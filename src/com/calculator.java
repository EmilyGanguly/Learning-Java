package com;

import java.util.Scanner;

public class calculator {

    static float sum(float a, float b){
        return a+b;
    }
    static float subtract(float a, float b){
        return a-b;
    }
    static float multiply(float a, float b){
        return a*b;
    }
    static float divide(float a, float b){
        return a/b;
    }

    public static void main(String[] args){
        float num1, num2;
        System.out.println("Please enter the first number");
        Scanner scan1 =new Scanner(System.in);
        num1=scan1.nextFloat();
        System.out.println("Please enter the next number");
        Scanner scan2 = new Scanner(System.in);
        num2=scan2.nextFloat();
        System.out.print("You have entered ");
        System.out.print(num1);
        System.out.print(" and ");
        System.out.println(num2);

        System.out.println("Type 0 for addition, 1 for subtraction, 2 fo multiplication and 3 for division");
        Scanner scan3 = new Scanner(System.in);
        int operation;
        operation = (int) scan3.nextFloat();

        switch(operation){
            case 0:System.out.println("The sum is "+sum(num1,num2));
            break;
            case 1:System.out.println("The subtraction is "+subtract(num1,num2));
            break;
            case 2:System.out.println("The product is "+multiply(num1,num2));
            break;
            case 3:System.out.println("The division is "+divide(num1,num2));
            break;
            default:System.out.println("You have typed an invalid number");
            }
        }

}


