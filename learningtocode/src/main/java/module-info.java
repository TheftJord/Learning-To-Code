module com.java {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.java to javafx.fxml;
    exports com.java;
}
