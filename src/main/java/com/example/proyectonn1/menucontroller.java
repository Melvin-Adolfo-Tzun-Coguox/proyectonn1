package com.example.proyectonn1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class menucontroller {
    //creamos nuevas ventanas "stage"
    Stage productStage =new Stage();
    Stage usuarioStage =new Stage();
    Stage ventasStage=new Stage();
    public void callusuarios(MouseEvent mouseEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("usersform.fxml"));

        try {

            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            usuarioStage.setTitle("Ingreso de usuarios");
            usuarioStage.setScene(scene);
            usuarioStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void callproductos(MouseEvent mouseEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("productform.fxml"));

        try {

            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            productStage.setTitle("Ingreso de productos");
            productStage.setScene(scene);
            productStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void callventas(MouseEvent mouseEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("aboutmiprograma.fxml"));

        try {

            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            ventasStage.setTitle("Ingreso de ventas");
            ventasStage.setScene(scene);
            ventasStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
