package com.example.demo;

import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class gimController implements Initializable {

    @FXML
    private BarChart<String, Number> barChart;

    @FXML
    private Pane shapesPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Create a series for the BarChart
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data<>("Category 1", 50));
        series.getData().add(new XYChart.Data<>("Category 2", 80));
        series.getData().add(new XYChart.Data<>("Category 3", 30));
        series.getData().add(new XYChart.Data<>("Category 4", 60));
        barChart.getData().add(series);

        // Set style for BarChart
        barChart.setStyle("-fx-background-color: #EFEFEF; -fx-border-color: #CCCCCC; -fx-border-width: 1px;");
        CategoryAxis xAxis = (CategoryAxis) barChart.getXAxis();
        NumberAxis yAxis = (NumberAxis) barChart.getYAxis();
        xAxis.setStyle("-fx-font-size: 12px; -fx-label-fill: #333333;");
        yAxis.setStyle("-fx-font-size: 12px; -fx-label-fill: #333333;");

        // Create and add animated shapes
        createAnimatedShapes();
    }

    private void createAnimatedShapes() {
        // Create a rectangle
        Rectangle rectangle = new Rectangle(50, 50, 100, 100);
        rectangle.setFill(Color.BLUE);
        shapesPane.getChildren().add(rectangle);

        // Create a circle
        Circle circle = new Circle(250, 100, 50);
        circle.setFill(Color.RED);
        shapesPane.getChildren().add(circle);

        // Create translate transitions for the shapes
        TranslateTransition rectangleTransition = new TranslateTransition(Duration.seconds(2), rectangle);
        rectangleTransition.setFromX(0);
        rectangleTransition.setToX(400);
        rectangleTransition.setCycleCount(Animation.INDEFINITE);
        rectangleTransition.setAutoReverse(true);
        rectangleTransition.play();

        TranslateTransition circleTransition = new TranslateTransition(Duration.seconds(3), circle);
        circleTransition.setFromX(0);
        circleTransition.setToX(400);
        circleTransition.setCycleCount(Animation.INDEFINITE);
        circleTransition.setAutoReverse(true);
        circleTransition.play();
    }

    public void handleBackClick() throws IOException {
        // Handle back button click
        new App().changeScene("hello-view.fxml");
    }
}
