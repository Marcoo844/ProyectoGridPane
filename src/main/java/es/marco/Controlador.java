package es.marco;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controlador {

    @FXML
    private TextField campoNombre;

    @FXML
    private TextArea areaTexto;

    @FXML
    private void accionAceptar() {
        String texto = campoNombre.getText().trim();

        if (!texto.isEmpty()) {
            // Añadir el nuevo texto al área, manteniendo el historial
            if (areaTexto.getText().isEmpty()) {
                areaTexto.setText(texto);
            } else {
                areaTexto.appendText("\n" + texto);
            }
            // Limpiar el campo de texto
            campoNombre.clear();
        }
    }

    @FXML
    private void accionCancelar() {
        campoNombre.clear();
        areaTexto.clear();
    }
}
