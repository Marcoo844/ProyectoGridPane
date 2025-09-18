module es.marco {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires org.slf4j;

    opens es.marco to javafx.fxml;
    exports es.marco;
}