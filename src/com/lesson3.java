package com;

public class lesson3 {
    public static void main(String[] args){

        //Break

        for (int i=0;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.print("\n");

        for (int j=0;j<=10;j++){
            System.out.print(j+" ");
            break;
        }

        //Continue

        for (int a=0;a<=10;a+=1){
            if(a==2){
                continue;
            }else{
                System.out.println("You are promoted to the next level");
            }
            System.out.println("You lost");
        }
    }
}
