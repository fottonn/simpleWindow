package ru.ikolpakoff.controllers;

import javafx.beans.property.ObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.controlsfx.control.textfield.CustomTextField;
import org.controlsfx.control.textfield.TextFields;

import java.lang.reflect.Method;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable{

    @FXML private Label name;
    @FXML private TextField field;
    @FXML private Button button;
    @FXML private CustomTextField customTextField;

    public void setupText(ActionEvent actionEvent) {
        name.setText(field.getText());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setupClearButtonField(customTextField); //setup clear button field
    }

    //method add clear button into CustomTextField
    private void setupClearButtonField(CustomTextField customTextField) {
        try {
            Method m = TextFields.class.getDeclaredMethod("setupClearButtonField", TextField.class, ObjectProperty.class);
            m.setAccessible(true);
            m.invoke(null, customTextField, customTextField.rightProperty());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
