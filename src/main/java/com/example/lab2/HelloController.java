package com.example.lab2;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class HelloController {
    public Button btnMain;
    int clickCounter = 0;
    public void onBtnAction(ActionEvent actionEvent) {

        System.out.println("Kliknięcie nr " + ++clickCounter);

        if(clickCounter==1)
            btnMain.setText("i jeszcze raz");

    }
}