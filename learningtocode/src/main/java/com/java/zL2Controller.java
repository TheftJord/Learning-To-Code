package com.java;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class zL2Controller {

//-------------------------------------------------VARIABLE SECTION------------------------------------------------------
    //FXML Variables
    @FXML
    private TextField printCheck1; //shows if you successfully completed Lesson 2.1
    @FXML
    private TextField printCheck2; //shows if you successfully completed Lesson 2.2
    @FXML
    private TextField printCheck3; //shows if you successfully completed Lesson 2.3
    @FXML
    private TextField printLine1; //shows what is the line that you have printed out in Lesson 2.1
    @FXML
    private TextField printLine2; //Shows what is the line that you have printed out in Lesson 2.2
    @FXML
    private TextField printLine3; //Shows what is the line that you have printed out in Lesson 2.3

    //Java Variables
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); //makes a OutputStream
    File temp = new File("temp.txt");
    PrintStream printStream; //makes a PrintStream
    private String testFail = "Failed: Try Again"; //text if you have failed
    private String testTrue = "Passed: Congrats"; //text if you have passed
    private String lineNull = "No Text Was Printed"; //Text if you have failed
    Scanner filescr;

//-------------------------------------------------BACKEND SECTION---------------------------------------------------------
    
    /**
     * Initialise statement for the program
     * this will run this code automatically upon the program starting
     * only put code into this section that needs to be run on start up
     * @throws FileNotFoundException 
     */
    @FXML
    private void initialize() throws FileNotFoundException{
        //sets the TextAreas to uneditable
        printCheck1.setEditable(false); //sets printCheck1 to uneditable
        printCheck2.setEditable(false); //sets printCheck2 to uneditable
        printCheck3.setEditable(false); //sets printCheck3 to uneditable
        printLine1.setEditable(false); //sets printLine1 to uneditable
        printLine2.setEditable(false); //sets printLine2 to uneditable
        printLine3.setEditable(false); //sets printLine3 to uneditable

        //sets the output stream to something that we can use
        printStream = new PrintStream(temp); //links printStream to outputstream
        System.setOut(printStream); //sets Outputstream to printStream
        filescr = new Scanner(temp);
    }

    /**
    * This is the code that runs when you click the check button for the first test
    * This will take the students code and check that it was preformed properly
    * then it will update if the task was done sucessfully or not and then change the TextAreas accordingly
    * @throws IOException 
    */
    @FXML
    private void actionCheck1() throws IOException{
        //gets printed line from Student Code
        Lesson2.makePrintStatement(); //calls upon Lesson 2.1 to make sure that it was done properly
        String checkNotNull=null;
        try{
            checkNotNull = filescr.nextLine(); //sets whatever was printed to a String variable
        }catch(Exception e){
            System.out.println(lineNull);
        }

        //Sets editable of corisponding TextAreas: editable
        printCheck1.setEditable(true); //sets printCheck1 to editable
        printLine1.setEditable(true); //sets printLine1 to editable

        //Checks to see if Student's code works properly
        if(checkNotNull.isEmpty()==false){ //sees if something has printed out
            printCheck1.setText(testTrue);
            printLine1.setText(checkNotNull);
        }
        else if(checkNotNull.isEmpty()==true){ //sees if something has not printed out
            printCheck1.setText(testFail);
            printLine1.setText(lineNull);
        }

        //Sets editable of corisponding TextAreas: uneditable
        printCheck1.setEditable(false); //sets printCheck1 to uneditable
        printLine1.setEditable(false); //sets printLine1 to uneditable
    }

    /**
     * this code will run when you click the second test button
     * this will take the student code and make sure that they wrote it out properly
     * then it will update if the task was done sucessfully or not and then change the TextAreas accordingly
     */
    @FXML
    private void actionCheck2(){
        //gets printed line from Student Code
        Lesson2.usingVariables(); //calls upon Lesson 2.2 to make sure that it was done properly
        String checkNotNull=null;
        try{
            checkNotNull = filescr.nextLine(); //sets whatever was printed to a String variable
        }catch(Exception e){
            System.out.println(lineNull);
        }

        //Sets editable of corisponding TextAreas: editable
        printCheck2.setEditable(true); //sets printCheck1 to editable
        printLine2.setEditable(true); //sets printLine1 to editable

        //sets up boolen to see if the print statement matches the provided variable
        boolean comparableVar=false;
        try{
            if(checkNotNull.compareTo(Lesson2.textLine)==0){
                comparableVar=true;
            }
        }finally{};

        //Checks to see if Student's code works properly
        if(checkNotNull.isEmpty()==false&&comparableVar==true){ //sees if something has printed out and if it matches the variable
            printCheck2.setText(testTrue);
            printLine2.setText(checkNotNull);
        }
        else if(checkNotNull.isEmpty()==true||comparableVar==false){ //sees if something has not printed out or if it doesn't match the variable
            printCheck2.setText(testFail);
            printLine2.setText(lineNull);
        }

        //Sets editable of corisponding TextAreas: uneditable
        printCheck2.setEditable(false); //sets printCheck1 to uneditable
        printLine2.setEditable(false); //sets printLine1 to uneditable
    }

    @FXML
    private void actionCheck3(){
        //gets printed line from Student Code
        Lesson2.usingPrintf();//calls upon Lesson 2.3 to make sure that it was done properly
        String checkNotNull=null;
        try{
            checkNotNull = filescr.nextLine(); //sets whatever was printed to a String variable
        }catch(Exception e){
            System.out.println(lineNull);
        }

        //Sets editable of corisponding TextAreas: editable
        printCheck3.setEditable(true); //sets printCheck1 to editable
        printLine3.setEditable(true); //sets printLine1 to editable

        boolean comparableVar=false;
        String comparableStringVar = Lesson2.stringVar + Lesson2.integerVar;
        try{
            if(checkNotNull.compareTo(comparableStringVar)==0){
                comparableVar=true;
            }
        }finally{};

        //Checks to see if Student's code works properly
        
        if(checkNotNull.isEmpty()==false&&comparableVar==true){ //sees if something has printed out and if it matches the variable
            printCheck3.setText(testTrue);
            printLine3.setText(checkNotNull);
        }
        else if(checkNotNull.isEmpty()==true||comparableVar==false){ //sees if something has not printed out or if it doesn't match the variable
            printCheck3.setText(testFail);
            printLine3.setText(lineNull);
        }

        //Sets editable of corisponding TextAreas: uneditable
        printCheck3.setEditable(false); //sets printCheck1 to uneditable
        printLine3.setEditable(false); //sets printLine1 to uneditable
    }

//----------------------------------------------------------------Changing Lessons----------------------------------------------------------

    @FXML
    private void actionChangeToLS() throws IOException{
        zLSMethods.lessonSelector();
    }

//---------------------------------------------------------------Settings Options----------------------------------------------------------

    @FXML
    private void actionRestartApplication() throws IOException{
        zLSMethods.restartApplication();
    }

    @FXML
    private void actionCloseApplication() throws IOException{
        zLSMethods.closeApplication();
    }
}

/* NOTES:
 * printCheck1.setEditable(false/true);
 */