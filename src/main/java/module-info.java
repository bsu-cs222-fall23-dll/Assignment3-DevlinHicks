module com.example.sillymethods {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sillymethods to javafx.fxml;
    exports com.example.sillymethods;
}