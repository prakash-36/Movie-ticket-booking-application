/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticket;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ELCOT
 */
public class ShowsController implements Initializable {

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
    private TableColumn<Show, String> typecol;
    @FXML
    private TableColumn<Show, Float> rating;
    @FXML
    private Button button;
    /**
     * Initializes the controller class.
     */
    ObservableList<Show> list = FXCollections.observableArrayList(
    new Show("05/07/2020","5:00","thalaiva","PVR","Action", (float) 7.9),
    new Show("10/05/2020","5:00","Narania","PVR","Drametic", (float) 9.8),
    new Show("012/07/2020","4:00","Mersal","PVR","Action", (float) 8.9));
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        datecol.setCellValueFactory(new PropertyValueFactory<>("datecol"));
        timecol.setCellValueFactory(new PropertyValueFactory<>("timecol"));
        movienamecol.setCellValueFactory(new PropertyValueFactory<>("movienamecol"));
        thetercol.setCellValueFactory(new PropertyValueFactory<>("thetercol"));
        typecol.setCellValueFactory(new PropertyValueFactory<>("typecol"));
        rating.setCellValueFactory(new PropertyValueFactory<>("rating"));
        
        table.setItems(list);
    }    

    @FXML
    private void buttonoaction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("movie.fxml"));
        Parent p5 = loader.load();
        Scene s4 = new Scene(p5);
        //Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        MovieController con=loader.getController();
        con.initdata(table.getSelectionModel().getSelectedItem());
        Stage window=new Stage();
        window.setScene(s4);
        window.show();
    }
    
}
