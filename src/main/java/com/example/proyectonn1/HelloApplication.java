package com.example.proyectonn1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static Stage currentstage;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 250);
        stage.setTitle("---Bienvenido-----");
        stage.setScene(scene);
        stage.show();
    }

    public void cerrarventana(Stage stage){
        stage.close();
    }

    public static void main(String[] args) {
        launch();
    }
}