package com.example.lab2;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class HelloController{
    public Button btnMain;
    public TextField wysokosc;
    public TextField promien;
    public TextField grubosc;
    public Label wynik;

    public void onBtnAction(ActionEvent actionEvent) {



            double h = Double.parseDouble(wysokosc.getText());
            double r = Double.parseDouble(promien.getText());
            double x = Double.parseDouble(grubosc.getText());
            double obwod = Math.PI*(2*r);
            double pole = obwod*h;
            double objetosc = pole*x;
            double wagaS = objetosc * 0.00785;
            double wagaSN = objetosc * 0.00790;
            double cenaS = wagaS * 0.1;
            double cenaSN = wagaSN * 0.15;


            wynik.setText("Cena walca ze zwykłej stali wyniesie: "+String.format("%.2f", cenaS)+" zł,\noraz będzie ważyć: "+String.format("%.3f", wagaS)+" gram"+
                        "\n\nCena walca ze stali nierdzewnej wyniesie: "+String.format("%.2f", cenaSN)+" zł,\noraz będzie ważyć: "+String.format("%.3f", wagaSN)+" gram");

    }
}