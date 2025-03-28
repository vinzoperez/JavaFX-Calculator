package me.vinzo.com.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {
    // Variables
    String TotalString = "";

    @FXML
    Label calculateDisplay;
    @FXML
    public void onNumberClick(MouseEvent event)
    {
        Button clickedButton = (Button) event.getSource();
        calculateDisplay.setText(calculateDisplay.getText() + clickedButton.getText());
        TotalString = TotalString + clickedButton.getText();
    }

    @FXML
    public void onOperatorClick(MouseEvent event)
    {
        Button clickedOperator = (Button) event.getSource();
        switch (clickedOperator.getText())
        {
            case "+" -> {
                TotalString += "+";
                calculateDisplay.setText(TotalString);
                break;
            }
            case "-" -> {
                TotalString += "-";
                calculateDisplay.setText(TotalString);
                break;
            }
            case "*" -> {
                TotalString += "*";
                calculateDisplay.setText(TotalString);
                break;
            }
            case "/" -> {
                TotalString += "/";
                calculateDisplay.setText(TotalString);
                break;
            }
        }
    }


    @FXML
    public void onEqualsClick()
    {
        String[] numbers = TotalString.split("[+\\-*/]");
        String[] operators = TotalString.split("[0-9.]+");

        double TotalDouble = Double.parseDouble(numbers[0]);

        for (int i=1; i < numbers.length; i++)
        {
            String operator = operators[i];
            double currentNum = Double.parseDouble(numbers[i].trim());

            switch (operator) {
                case "+" -> {
                    TotalDouble += currentNum;
                    break;
                }

                case "-" -> {
                    TotalDouble -= currentNum;
                    break;
                }

                case "*" -> {
                    TotalDouble *= currentNum;
                    break;
                }

                case "/" -> {
                    if (currentNum != 0)
                    {
                        TotalDouble /= currentNum;
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;
                }

            }
            TotalString = String.valueOf(TotalDouble);
            calculateDisplay.setText(String.valueOf(TotalDouble));
        }
    }

    @FXML
    public void onClearClick()
    {
        TotalString = "";
        calculateDisplay.setText(TotalString);
    }
}