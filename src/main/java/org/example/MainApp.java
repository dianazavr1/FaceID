package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.opencv.core.Core;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Загрузка FXML
        Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
        primaryStage.setTitle("JavaFX OpenCV Example");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Загрузка библиотеки OpenCV
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        launch(args);
    }
}
//package org.example;
//
//import org.opencv.core.Core;
//import org.opencv.core.Mat ;
//import org.opencv.core.CvType ;
//public class Main {
//    public static void main(String[] args) {
//        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
//        Mat mat = Mat.eye ( 3 , 3 , CvType.CV_8UC1 ) ;
//        System.out.println ( " mat = " + mat.dump ( ) ) ; }}
//
//
//        //  System.out.println("OpenCV успешно подключен!");
//