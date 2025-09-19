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
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        logger.info("Lanzando la aplicación");
        logger.debug("Depuración mostrada");

        Parent root = FXMLLoader.load(getClass().getResource("/es/marco/estilo.fxml"));
        Scene scene = new Scene(root, 640, 480);
        scene.getStylesheets().add(getClass().getResource("/es/marco/styles.css").toExternalForm());

        stage.setScene(scene);
        stage.setTitle("Formulario");
        stage.show();

    }
}
