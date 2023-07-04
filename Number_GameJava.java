/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;
public class Number_GameJava{
    public static void main(String args[]) {
        int rand=(int) (Math.random() *100) +1;
        int trials=3;
        Scanner sc=new Scanner(System.in);
        boolean incorrect=false;
        System.out.println("Welcome to the Number Game. \n You have 3 attempts to guess the correct number");
        while(trials>0) {
            System.out.println("Enter any number between 1 to 100 \n");
            int guess= sc.nextInt();
            if(guess<0 || guess>100){
                System.out.println("ERROR!! Enter number between 1-100");
                break;
            }
            if(guess==rand) {
                System.out.println("Congratulations!! \n \n You have guessed the right answer");
                break;
            } else if(guess>rand) {
                System.out.println("Oops!! Your guessed number is bigger. Try again");
                trials--;
            } else {
                System.out.println("Oops!! Your guessed number is smaller. Try again");
                trials--;
            }

        }
        trials--;
        if(incorrect==false) {
            System.out.println("YOU LOST. PLAY AGAIN");
        }
    }
}
