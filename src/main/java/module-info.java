module com.example.testexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testexample to javafx.fxml;
    exports com.example.testexample;
}