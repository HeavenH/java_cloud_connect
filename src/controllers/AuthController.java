package controllers;

import cloud.Actions;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 *
 * @author Aluno
 */
public class AuthController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Pane content_area;
    
    @FXML
    private TextField input_username;

    @FXML
    private TextField input_password;

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Actions user = new Actions();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleSingUp(javafx.scene.input.MouseEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("/view/SingUp.fxml"));
        content_area.getChildren().removeAll();
        content_area.getChildren().setAll(fxml);
    }
}
