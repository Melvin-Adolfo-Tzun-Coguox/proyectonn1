module com.example.proyectonn1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectonn1 to javafx.fxml;
    exports com.example.proyectonn1;
}