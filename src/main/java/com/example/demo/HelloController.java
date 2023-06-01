package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    private Button UIButton;

    public void onUIButtonClick(ActionEvent actionEvent) throws IOException {
        new App().changeScene("ui-view.fxml");
    }

    public void onTableButtonClick(ActionEvent actionEvent) throws IOException {
        new App().changeScene("table.fxml");
    }

    public void onGimmicksButtonClick(ActionEvent actionEvent) throws IOException {
        new App().changeScene("gimmicks.fxml");
    }
}