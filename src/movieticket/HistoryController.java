/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticket;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author ELCOT
 */
public class HistoryController implements Initializable {

    @FXML
    private TableView<Show> table;
    @FXML
    private TableColumn<Show, String> datecol;
    @FXML
    private TableColumn<Show, String> timecol;
    @FXML
    private TableColumn<Show, String> movienamecol;
    @FXML
    private TableColumn<Show, String> thetercol;
    @FXML
    private TableColumn<Show, String> classcol;
    @FXML
    private TableColumn<Show, Integer> ticketcol;
    @FXML
    private TableColumn<Show, Integer> pricecol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }   
    
}
