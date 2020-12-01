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
    
    String medico;
    String dentista;
    String obstetra;
    String psicologo;
    String secretaria;
    String contraseñaM;
    String contraseñaD;
    String contraseñaO;
    String contraseñaP;
    String contraseñaS;
    String aux;
    String auxPass;
    int temp = 0;
    
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
        
<<<<<<< HEAD
        
=======
        aux = nombreUsuario.getText();
        auxPass = contrasenia.getText();
        
        if (medico.equals(aux) && contraseñaM.equals(auxPass)){
            temp = 1;
        }
        if (dentista.equals(aux) && contraseñaD.equals(auxPass)){
            temp = 2;
        }
        if (obstetra.equals(aux) && contraseñaO.equals(auxPass)){
            temp = 3;
        }
        if (psicologo.equals(aux) && contraseñaP.equals(auxPass)){
            temp = 4;
        }
        if (secretaria.equals(aux) && contraseñaS.equals(auxPass)){
            temp = 5;
        }
        else{
            temp = 6;
        }
        
        switch (temp){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
>>>>>>> Nestor
    }
    
}
