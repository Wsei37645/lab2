package com.example.lab2;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;

public class HelloController{
    public Button btnMain;

    public TextField wysokosc;
    public TextField promien ;
    public TextField grubosc;
    public TextField wynik;
    public void onBtnAction(ActionEvent actionEvent) {
        wynik.setText(wysokosc.getText());
    }
}