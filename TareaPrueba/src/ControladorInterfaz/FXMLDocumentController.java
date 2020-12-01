package ControladorInterfaz;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 *
 * @author sebas
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private PasswordField contrasenia;
    @FXML
    private TextField nombreUsuario;
    @FXML
    private Button botonIniciar;
    @FXML
    private Pane paneInicio;
    @FXML
    private Pane paneSecretaria;
    @FXML
    private Pane paneMedico;
    @FXML
    private Pane paneDerivarPaciente;
    @FXML
    private Pane paneAsignarHora;
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void iniciarSesion(ActionEvent event) {
        
        
    }
    
}
