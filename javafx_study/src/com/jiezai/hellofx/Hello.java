package com.jiezai.hellofx;

import javafx.application.Application;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        System.out.println("HELLO WORLD");

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX");
        primaryStage.show();
    }
}
