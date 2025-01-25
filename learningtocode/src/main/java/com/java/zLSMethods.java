package com.java;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;

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

    /* public static void restartApplication(String holder){
        //work on later
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource(holder));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
        }catch (IOException e){
            e.printStackTrace();
        }
    } */

    /**
     * This will safely exit the application
     */
    public static void closeApplication(){
        Platform.exit();
        System.exit(0);
    }
}
