package com.gili.module6labb;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button calculateButton;
    @FXML
    private TextField number1TextField;
    @FXML
    private TextField number2Textfield;
    @FXML
    private Label sumLabel;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void CalculateNow(ActionEvent event) {
        int sum;
        sum = Integer.parseInt(number1TextField.getText()) + Integer.parseInt(number2Textfield.getText());
        
        sumLabel.setText("" + sum);
    }
}
