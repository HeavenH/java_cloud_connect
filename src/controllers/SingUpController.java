package controllers;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import cloud.Actions;
import cloud.Main;
import cloud.MetaData;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import models.User;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class SingUpController implements Initializable {
    @FXML
    private TextField input_username;

    @FXML
    private TextField input_email;

    @FXML
    private PasswordField input_password;

    @FXML
    void handleSingUp(ActionEvent event) {
        Actions action = new Actions();
        User user = new User(input_username.getText(), input_email.getText(), input_password.getText());
        action.createUser(user);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void back_to_menu(javafx.scene.input.MouseEvent event) {
        Main.stage.getScene().setRoot(MetaData.parent);
    }
    
}
