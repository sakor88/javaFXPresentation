package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class App extends Application {
    private static Stage mainStage;

    @Override
    public void start(Stage stage) throws IOException {
        mainStage = stage;
        stage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 800);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setTitle("ZTI");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    public void changeScene(String fxml) throws IOException {
        Parent new_scene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxml)));
        new_scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        mainStage.getScene().setRoot(new_scene);
    }
    public void changeScene(Scene scene) {
        mainStage.setScene(scene);
    }
}