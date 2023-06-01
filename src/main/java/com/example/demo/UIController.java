package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class UIController {
    @FXML
    private Button clickMeButton;

    @FXML
    private TextField nameTextField;

    @FXML
    private CheckBox featureCheckBox;

    @FXML
    private TableView<?> tableView;

    @FXML
    private Label clickLabel;

    @FXML
    private void handleButtonClick() {
        String name = nameTextField.getText();
        if (name.length() < 1){
            name="nieznajomego";
        }
        boolean isFeatureEnabled = featureCheckBox.isSelected();

        System.out.println("Button clicked!");
        System.out.println("Name: " + name);
        System.out.println("Feature enabled: " + isFeatureEnabled);
        String state;
        if(isFeatureEnabled){
            state = "włączoną";
        }
        else{
            state="wyłączoną";
        }

        clickLabel.setText("Kliknieto przez " + name + " z " + state + " funkcją" );
    }

    public void handleBackClick(ActionEvent actionEvent) throws IOException {
        new App().changeScene("hello-view.fxml");
    }
}
