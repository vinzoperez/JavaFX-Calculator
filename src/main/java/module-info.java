module me.vinzo.com.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens me.vinzo.com.calculator to javafx.fxml;
    exports me.vinzo.com.calculator;
}