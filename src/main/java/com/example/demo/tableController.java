package com.example.demo;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class tableController implements Initializable {

    @FXML
    private TableView<Car> carTable;

    @FXML
    private TableColumn<Car, String> brandColumn;

    @FXML
    private TableColumn<Car, String> modelColumn;

    @FXML
    private TableColumn<Car, String> yearColumn;

    @FXML
    private TableColumn<Car, String> colorColumn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialize table columns
        brandColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getBrand()));
        modelColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModel()));
        yearColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getYear()));
        colorColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getColor()));


        // Populate the table with data
        carTable.setItems(getCarData());
    }

    // Method to retrieve car data
    private ObservableList<Car> getCarData() {
        ObservableList<Car> carData = FXCollections.observableArrayList();
        carData.add(new Car("Toyota", "Camry", "2021", "Silver"));
        carData.add(new Car("Honda", "Civic", "2020", "Black"));
        carData.add(new Car("Ford", "Mustang", "2019", "Red"));
        carData.add(new Car("Chevrolet", "Malibu", "2018", "Blue"));
        carData.add(new Car("BMW", "X5", "2021", "White"));
        carData.add(new Car("Audi", "A4", "2022", "Gray"));
        carData.add(new Car("Mercedes-Benz", "C-Class", "2019", "Black"));
        carData.add(new Car("Lexus", "RX", "2020", "Silver"));
        carData.add(new Car("Nissan", "Altima", "2021", "Red"));
        carData.add(new Car("Hyundai", "Sonata", "2018", "Blue"));

        return carData;
    }

    public void handleBackClick(ActionEvent actionEvent) throws IOException {
        new App().changeScene("hello-view.fxml");
    }

    private class Car {

        public String brand;
        public String model;
        public String year;
        public String color;

        public Car(String brand, String model, String year, String color) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.color = color;
        }

        public String getBrand() {
            return this.brand;
        }


        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return this.model;
        }


        public void setModel(String model) {
            this.model = model;
        }

        public String getYear() {
            return this.year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getColor() {
            return this.color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}
