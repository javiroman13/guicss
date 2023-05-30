module com.example.guicss {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.guicss to javafx.fxml;
    exports com.example.guicss;
}