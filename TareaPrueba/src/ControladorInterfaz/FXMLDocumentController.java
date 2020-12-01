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
    
    
    String  auxString;
    String auxPassString;
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
    @FXML
    private Pane paneEspecialista;
    @FXML
    private TextField nombrePaciente;
    @FXML
    private TextField infoAdicional;
    @FXML
    private TextField rutPaciente;
    @FXML
    private Pane InscripcionesP;
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void iniciarSesion(ActionEvent event) {
        int medico = 1;
        int dentista= 2;
        int obstetra= 3;
        int psicologo= 4;
        int secretaria= 5;
        int contraseñaM= 1;
        int contraseñaD= 2;
        int contraseñaO= 3;
        int contraseñaP= 4;
        int contraseñaS= 5;
        

        auxString = nombreUsuario.getText();
        auxPassString = contrasenia.getText();
        
        int aux = Integer.parseInt(auxString);
        int auxPass = Integer.parseInt(auxPassString);
        
        System.out.println(medico+","+contraseñaM);
        System.out.println(aux+","+auxPass);
        if (medico==aux && contraseñaM==auxPass){
            temp = 1;
        }
        else if (dentista==aux && contraseñaD==auxPass){
            temp = 2;
        }
        else if (obstetra==aux && contraseñaO==auxPass){
            temp = 3;
        }
        else if (psicologo==aux && contraseñaP==auxPass){
            temp = 4;
        }
        else if (secretaria==aux && contraseñaS==auxPass){
            System.out.println("iii");
            temp = 5;
        }
        

        
        switch (temp){
            case 1:
                paneInicio.setVisible(false);
                paneMedico.setVisible(true);
                break;
            case 2:
                
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("ppp");
                paneInicio.setVisible(false);
                paneSecretaria.setVisible(true);
                break;
            case 6:
                break;
        }
    }

    @FXML
    private void inscribirPaciente(ActionEvent event) {
        paneInicio.setVisible(false);
        InscripcionesP.setVisible(true);
    }

    @FXML
    private void Inscripcion(ActionEvent event) {
        
        String nom =nombrePaciente.getText();
        String inf = infoAdicional.getText();
        String rutP = rutPaciente.getText(); 
        
        System.out.println("paciente inscrito: "+ nom+" "+inf+" "+rutP);
        
        
    }
    
}
