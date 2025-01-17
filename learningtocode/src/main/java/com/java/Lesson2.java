package com.java;

public class Lesson2 {
    //variables DO NOT TOUCH
    public static String textLine;
    public static String stringVar,s;
    public static int integerVar,i;


    /**
     * Lesson 2.1: Using Print or Println
     * you are going to make a print command that will print out anything you write
     * if you are going to use letters make sure to enclose them in ""
     */
    public static void makePrintStatement(){
        //add text here to print out in the system
        System.out.println();
    }

    /**
     * Lesson 2.2: Using Variable in Print Commands
     * You are going to make a print command that prints out a variable that was provided to you
     * make sure not to include any ""
     */
    public static void usingVariables(){
        //Variable that you are going to use
        textLine = "This is a Sentence."; //you can change what is in the "" to change what the print command will say
        
        //Add the variable to the following print command
        System.out.println();
    }

    /**
     * Lesson 2.3: Using printf
     * You are going to make a print command that prints out the variables that was provided to you
     * you must use %s for the string and %d for the integer
     */
    public static void usingPrintf(){
        //Variables that you are going to use
        stringVar = "This is task "; //you can change what it is the "" and it should still work
        integerVar = 3; //you can change what number is here and it will still work

        //Add the variables using the place holders provided so it prints out the proper statement
        System.out.printf("%s%d",s,i); 
    }
}
