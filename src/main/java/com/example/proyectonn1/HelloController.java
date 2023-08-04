package com.example.proyectonn1;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    //programacion ventana login

    public Button button;
    public PasswordField password;
    public TextField obtuser;
    String txtuser,txtpasword;

    public void clicEntrar(ActionEvent actionEvent) {

        txtpasword=password.getText();
        txtuser=obtuser.getText();

        if(txtuser.equals("Melvin") &&txtpasword.equals("12345")){
            Alert messageWindows = new Alert(Alert.AlertType.INFORMATION);
            messageWindows.setTitle("Bienvenido al sistema");
            messageWindows.setHeaderText("");
            messageWindows.setContentText("Bienvenido a nuestro sistema");
            messageWindows.showAndWait();

        }else{

            Alert messageWindows = new Alert(Alert.AlertType.INFORMATION);
            messageWindows.setTitle("Error de acceso");
            messageWindows.setHeaderText("");
            messageWindows.setContentText("Usuario o Contraseña incorrectos");
            messageWindows.showAndWait();


        }
    }
}