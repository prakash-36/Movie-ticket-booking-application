 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticket;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ELCOT
 */
public class MainController implements Initializable {

    @FXML
    private Button movie;
    @FXML
    private AnchorPane root;
    @FXML
    private Button home;
    @FXML
    private AnchorPane mainroot;
    @FXML
    private Button setting;
    @FXML
    private Button logout;
    @FXML
    private Button his;
    @FXML
    private Button profile;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void movieaction(ActionEvent event) throws IOException {
        AnchorPane a2= FXMLLoader.load(getClass().getResource("shows.fxml"));
        root.getChildren().setAll(a2);
    }

    @FXML
    private void homeaction(ActionEvent event) throws IOException {
        AnchorPane a1= FXMLLoader.load(getClass().getResource("main.fxml"));
        mainroot.getChildren().setAll(a1);
    }

    @FXML
    private void settingaction(ActionEvent event) throws IOException {
        AnchorPane a3= FXMLLoader.load(getClass().getResource("settings.fxml"));
        root.getChildren().setAll(a3);
    }

    @FXML
    private void logoutaction(ActionEvent event) throws IOException {
        Parent p2 = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene s3 = new Scene(p2);
        Stage window;
        window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(s3);
        window.show();
    }

    @FXML
    private void hisaction(ActionEvent event) throws IOException {
        AnchorPane a4= FXMLLoader.load(getClass().getResource("history.fxml"));
        root.getChildren().setAll(a4);
    }

    @FXML
    private void profileaction(ActionEvent event) {
    }
    
}
