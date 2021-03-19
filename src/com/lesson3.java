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
                System.out.println("You lost");
            }
            System.out.println("You are promoted to the next level");
        }

        //Arrays

        int [] marks={1,4,6,9,6};
        /*System.out.println(marks[3]);
       // marks[3]=76;
        // System.out.println(marks[3]);

        for(int i=0;i<=marks.length;i++){
            System.out.println("The marks earned by student "+i+" is "+marks[i]);
        }*/

        for(int value:marks){
            System.out.println(value);
        }

        String [] cars ={"maruti","suzuki","innova","ford"};
        for(String value:cars){
            System.out.println(value);
        }

        int [][] matrix={{2,4,6,8},{1,3,5,7}};
        System.out.println(matrix[1][2]);

        //Try Catch

        for(int x=0;x<=4;x++){
            try{
                System.out.println(cars[x]);
            }catch(Exception e){
                System.out.println(e);
            }
        }

        //Methods

        //int sum(int e,int f){
          //int  s=e+f;
            //return s;
        }
       // System.out.println(sum(e:6,f:8));
    }

