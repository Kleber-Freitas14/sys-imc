package org.sysimc.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    public TextField txtNome;
    @FXML
    public TextField txtAltura;
    @FXML
    public TextField txtPeso;

    @FXML
    protected void onCalcularIMCClick() {
        System.out.println(this.txtNome.getText());
        System.out.println(this.txtAltura.getText());
        System.out.println(this.txtPeso.getText());


    }
}