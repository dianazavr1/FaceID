package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MyFirstFXProject extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXHelloCV.fxml"));
        BorderPane root = (BorderPane) loader.load();
        FXController controller = loader.getController();

    }
}
