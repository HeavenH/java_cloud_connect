/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import models.User;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class DashboardController implements Initializable {
    
    @FXML
    private TableColumn<User, String> col_id;
    
    @FXML
    private TableColumn<?, ?> col_username;
    
    
        private ObservableList<User> users = FXCollections.observableArrayList();
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */

        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        col_id.setCellFactory(new PropertyValueFactory<>("id"));
        col_username.setCellFactory(new PropertyValueFactory<>("name"));
        // TODO
    }    
    
}
