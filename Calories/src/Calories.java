//Course: COMP 170, Fall 1 2022
//System: Visual Studio Code, Windows 10
//Author: Jazz Suazo

import java.util.Scanner; //Scanner Class imported

public class Calories {
/**
 * @param args
 * @throws Exception
 */
public static void main(String[] args) throws Exception {

    //DECLARATIONS (Declare your variables below including your Scanner Object)
    Scanner scnr = new Scanner(System.in); //create Scanner
    String name_entered; // Scanner object for Name entered
    int cups_consumed; // Scanner object for Cups consumed
    final int calories_in_a_cup = 150; //150 calories per cup of popcorn
    final int number_of_grams = 30; //30 grams of popcorn per cup
    final int calories_from_fat = 54; //54 calories of fat per cup of popcorn
    int total_calories; //total calories
    int total_grams; //total grams
    int total_fat; //total fat

    //INTRODUCTION
    System.out.println("Welcome to the Garrett's Popcorn Calorie Tracker!  This program will allow you to enter the total number of cups of Garrett's popcorn and provide you with the total number of calories consumed, the breakdown of calories from fat and the total number of grams per cup consumed.");
    System.out.println(" ");

    //INPUT AND OUTPUT (Use wording found in .gif video on README.md )
    System.out.print("To get started, please enter the total cups of popcorn consumed: ");//prompt user to enter cups of popcorn consumed
    cups_consumed = scnr.nextInt();//number of cups of popcorn consumed 
   
    System.out.print("Please enter your name: "); //prompt user to enter name 
    name_entered = scnr.next();//name entered by user

    //MAKE CALCULATIONS
    total_calories = (calories_in_a_cup * cups_consumed);//calculate total calories
    total_grams = (number_of_grams * cups_consumed);//calculate total grams
    total_fat = (calories_from_fat * cups_consumed);//calculate total calories from fat

    //OUTPUT DATA TO CONSOLE 
    System.out.println(" ");//output space
    System.out.println(name_entered + " your caloric intake of Garret's Popcorn is listed below:");//output strings 
    System.out.println("***************************************************************");//output string
    System.out.println(cups_consumed + " cup(s) equates to " + total_calories + " calories");//output cups consumed and calories
    System.out.println(cups_consumed + " cup(s) equates to " + total_grams + " grams consumed");//output cups consumed and grams
    System.out.println("Out of " + total_calories + " total calories - " + total_fat + " is calories from fat");//output total calories and calories from fat
    scnr.close();//close scanner
}
}

