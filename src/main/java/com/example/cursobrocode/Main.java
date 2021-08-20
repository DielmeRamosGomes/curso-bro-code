package com.example.cursobrocode;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Stage stage = new Stage();
        Group primaryRoot = new Group();
        Scene primaryScene = new Scene(primaryRoot, Color.BLACK);

        Image icon = new Image("lena.png");
        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("Stage Demo Program");

        primaryStage.setScene(primaryScene);
        primaryStage.show();

    }

}