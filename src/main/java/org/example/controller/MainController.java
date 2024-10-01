package org.example.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.application.Platform;
import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainController {
    @FXML
    private Button startButton;
    @FXML
    private ImageView currentFrame;
    private VideoCapture capture;
    private ScheduledExecutorService timer;

    @FXML
    protected void startCamera() {
        capture = new VideoCapture(0); // Открытие камеры
        if (capture.isOpened()) {
            // Запуск видеопотока с задержкой в 33 мс
            timer = Executors.newSingleThreadScheduledExecutor();
            timer.scheduleAtFixedRate(this::grabFrame, 0, 33, TimeUnit.MILLISECONDS);
            startButton.setDisable(true); // Отключение кнопки после старта
        }
    }

    // Метод для захвата кадра
    private void grabFrame() {
        Mat frame = new Mat();
        if (capture.read(frame)) {
            // Преобразование и отображение кадра
        }
    }
}

