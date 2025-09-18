package es.marco;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App extends Application {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        logger.info("Lanzando la aplicacion");
        logger.debug("Depuracion mostrada");
        Parent root = FXMLLoader.load(getClass().getResource("estilo.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("FlowPane Alignment with FXML");
        stage.show();
    }
}
