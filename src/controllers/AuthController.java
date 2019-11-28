package controllers;

import cloud.Actions;
import static cloud.Main.stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import models.User;

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
    private VBox main_container;
    
    @FXML
    private TextField input_email;

    @FXML
    private TextField input_password;

    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Actions action = new Actions();
        if(input_email.getText().equals("email") && input_password.getText().equals("password")) {
            Parent dashboard = FXMLLoader.load(getClass().getResource("/view/Dashboard.fxml"));
            Scene scene = new Scene(dashboard);
            stage.setScene(scene);   
        } else {
            label.setText("Login failed!");
        }
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
