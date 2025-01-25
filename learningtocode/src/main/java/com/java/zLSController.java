package com.java;

import java.io.IOException;
import javafx.fxml.FXML;

public class zLSController {

//-----------------------------------------------------------Swap Methods----------------------------------------------------------

    /**
     * This will swap to lesson 2
     * @throws IOException
     */
    @FXML
    private void actionLesson2() throws IOException {
        zLSMethods.lesson2(); //calls upon the swap method in zLSMethods
    }

//-------------------------------------------------------------Menu Section-------------------------------------------------------

    /**
     * This closes the application
     * @throws IOException
     */
    @FXML
    private void actionClose() throws IOException{
        zLSMethods.closeApplication(); //calls upon the close method in zLSMethods
    }

    /**
     * this restarts the application to update the code
     * @throws IOException
     */
    /* @FXML
    private void actionRestartApplication() throws IOException{
        zLSMethods.restartApplication(); //calls upon the restart method in zLSMethods
    } */
}
