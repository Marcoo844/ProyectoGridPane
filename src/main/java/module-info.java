module es.marco {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.marco to javafx.fxml;
    exports es.marco;
}