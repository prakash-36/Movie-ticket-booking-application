/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticket;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ELCOT
 */
public class LoginController implements Initializable {

    @FXML
    private Button login;
    @FXML
    private TextField uname;
    @FXML
    private PasswordField pwd;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginaction(ActionEvent event) throws IOException,SQLException {
        Connection con;
        Statement st;
        ResultSet rs;
        String t1=uname.getText();
        String t2=pwd.getText();
        try
        {
            con=Movieticket.getcon();
            st=con.createStatement();
            String q="select*from username";
            rs=st.executeQuery(q);
            String s11,s22;
            while(rs.next())
            {
                s11=rs.getString("name");
                s22=rs.getString("password");
                if((t1.equals(s11)) && (t2.equals(s22)))
                {
                    System.out.println("you are allowed to login");
                    Parent p1 = FXMLLoader.load(getClass().getResource("main.fxml"));
                    Scene s2 = new Scene(p1);
                    Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
                    window.setScene(s2);
                    window.show();
                }
                else{
                    System.out.println("wrong username and password");
                }
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
}
