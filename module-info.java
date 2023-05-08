module com.example.taskmanager3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com to taskDisplay.fxml;
    exports com;
    opens to ;
}