package me.vinzo.com.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {
    // Variables
    int TotalInt = 0;
    String TotalString = "";
    String tempString = "";

    @FXML
    Label calculateDisplay;
    @FXML
    public void onNumberClick(MouseEvent event)
    {
        Button clickedButton = (Button) event.getSource();
        calculateDisplay.setText(calculateDisplay.getText() + clickedButton.getText());
        tempString = tempString + clickedButton.getText();
        TotalString = TotalString + clickedButton.getText();
    }

    @FXML
    public void onOperatorClick(MouseEvent event)
    {
        Button clickedOperator = (Button) event.getSource();
        switch (clickedOperator.getText())
        {
            case "+" -> {
                System.out.println("+");
                int tempInt = (int) Integer.parseInt(tempString);
                tempString = "";
                TotalString += "+";
                TotalInt += tempInt;
                calculateDisplay.setText(TotalString);
                break;
            }
            case "-" -> {
                System.out.println("Subtraction");
                break;
            }
            case "*" -> {
                break;
            }
            case "/" -> {
                break;
            }
        }
    }


    @FXML
    public void onEqualsClick()
    {
        int tempInt = (int) Integer.parseInt(tempString);

        System.out.println(TotalString);
        for (char character : TotalString.toCharArray())
        {
            System.out.println(character);
            if (character == '+'){
                tempInt = (int) Integer.parseInt()
            }
        }

        calculateDisplay.setText(String.valueOf(TotalInt));
    }

    @FXML
    public void onClearClick()
    {

    }
}