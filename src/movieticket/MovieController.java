/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticket;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ELCOT
 */
public class MovieController implements Initializable {
    
    private Show selectedShow;

    @FXML
    private TextField the;
    @FXML
    private TextField mov;
    @FXML
    private TextField time;
    @FXML
    private RadioButton c1;
    @FXML
    private RadioButton c2;
    @FXML
    private RadioButton c3;
    @FXML
    private Label res;
    @FXML
    private DatePicker dat;
    @FXML
    private TextField tic;
    @FXML
    private Button book;

    /**
     * Initializes the controller class.
     * @param show
     */
    
    public void initdata(Show show)
    {
        selectedShow=show;
        the.setText(selectedShow.getThetercol());
        mov.setText(selectedShow.getMovienamecol());
        time.setText(selectedShow.getTimecol());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void c1action(ActionEvent event) {
        c2.setSelected(false);
        c3.setSelected(false);
        res.setText("$ 1000");
    }

    @FXML
    private void c2action(ActionEvent event) {
        c1.setSelected(false);
        c3.setSelected(false);
        res.setText("$ 600");
    }

    @FXML
    private void c3action(ActionEvent event) {
        c1.setSelected(false);
        c2.setSelected(false);
        res.setText("$ 300");
    }

    @FXML
    private void bookaction(ActionEvent event) {
    }


    
}
