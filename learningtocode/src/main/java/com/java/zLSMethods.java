package com.java;

import java.io.IOException;

import javafx.application.Platform;

public class zLSMethods {

//------------------------------------------------------Shifting Between Scenes------------------------------------------------------
    
    /**
     * Section 000
     * this will shift the page back to the lesson selector page
     * @throws IOException 
     */
    public static void lessonSelector() throws IOException{
        App.setRoot("lessonSelector");
    }

    /**
     * Section 002
     * @throws IOException
     */
    public static void lesson2() throws IOException{
        App.setRoot("lesson2");
    }

//-----------------------------------------------------Settings Functions------------------------------------------------------------

    public static void restartApplication(){
        //work on later
    }

    /**
     * This will safely exit the application
     */
    public static void closeApplication(){
        Platform.exit();
        System.exit(0);
    }
}
