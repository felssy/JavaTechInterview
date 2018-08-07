package com.javaTechInterview;

public class FuzzBuzz {

    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            System.out.println(isThisFuzzBuzz(i));
        }
    }

    public static String isThisFuzzBuzz(int i){

        if (i%15==0){
            return "FuzzBuzz";
        }
        else if(i%5==0){
            return "Buzz";
        }
        else if(i%3==0){
            return "Fuzz";
        }
        else
            return String.valueOf(i);
    }
}
