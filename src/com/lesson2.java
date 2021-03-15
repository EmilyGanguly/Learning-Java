package com;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args){

        //Operators cont
          //Operators 1
        int a =24;
        int b =35;
      System.out.print("The value of a + b is ") ;
      System.out.println(a+b);//prinln is applied to this line instead of the previous

      System.out.print("The value of a-b is ");
      System.out.println(a-b);

      System.out.print("The value of axb is ");
      System.out.println(a*b);

      System.out.print("The value of a/b is ");
      float c=a/b;
      System.out.println(c);

      System.out.print("The value of a%b is ");
      System.out.println(a%b);

      // Operators 2

        System.out.println("Operators 2");

      System.out.println(a++);
      System.out.println(a--);
      System.out.println(++a);
      System.out.println(--a);

      // Operators 3

        System.out.println("Operators 3");

        a+=3;
        System.out.println(a);
        a-=3;
        System.out.println(a);
        a*=3;
        System.out.println(a);
        a/=3;
        System.out.println(a);
        a%=3;
        System.out.println(a);

        //Taking input from user

        //nextLine
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Please enter a sentence");
        String word = scan.nextLine();
        System.out.println(word);*/

        //next
        /*System.out.println("Please enter a sentence");
        String sent = scan.next();
        System.out.println(sent);*/

        //nextInt
        /*System.out.println("Please enter an integer");
        int integer = scan.nextInt();
        System.out.println(integer);*/

        //Strings
        String name = "Emily";
        String mood = "is in a good mood";
        System.out.println(name+" "+mood);

        System.out.println(name.length());

        System.out.println(name.toUpperCase());

        System.out.println(name.toLowerCase());

        System.out.println(name+" "+"\""+mood+"\"");

        System.out.println(mood.contains("mood"));

        System.out.println(mood.endsWith("mood"));

        System.out.println(mood.charAt(8));

        System.out.println(mood.indexOf("mod"));

        System.out.println(mood.indexOf("mood"));

        //Math functions in java

        int x = 56, y = 89;
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));
        System.out.println(Math.sqrt(36));
        System.out.println(Math.abs(-9));
        System.out.println(Math.random());

        //If-Else statements

        /*System.out.println("Please enter your age");
        int age = scan.nextInt();
        if(age<18) {
            System.out.println("You are a kid");
        }else if(age<60){
            System.out.println("You are a not kid");
        }else{
            System.out.println("You are old");
        }*/

        //Switch statements
       /*switch(age){   //id we do not add break; then all the cases after the matched case gets executed
            case 10: System.out.println("You are 10 years old");
            break;
            case 20: System.out.println("You are 20 years old");
            break;
            case 30: System.out.println("You are 30 years old");
            break;
            default: System.out.println("You didnot match any of the cases");
        }*/

        //Loops

        int i = 1;
        while(i<=100){
            System.out.print(i+" ");
            i++;
        }

        int j = 0;
        do{
            j+=1;
            System.out.print(j+" ");
        }while(j<=100);

        //for loops

        for(i=0;i<=10;i+=1){
            System.out.print(i+" ");
        }
    }
}
