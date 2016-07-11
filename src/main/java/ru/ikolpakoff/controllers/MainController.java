package ru.ikolpakoff.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML private Label name;
    @FXML private TextField field;
    @FXML private Button button;

    public void setupText(ActionEvent actionEvent) {
        name.setText(field.getText());
    }
}
