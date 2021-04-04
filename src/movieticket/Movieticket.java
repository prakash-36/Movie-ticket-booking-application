/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ELCOT
 */
public class Movieticket extends Application {
    public static Connection con;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("movie ticket");
        stage.setScene(scene);
        stage.show();
    }
    public static Connection getcon()
    {
        return con;
    }

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        con=(Connection)DriverManager.getConnection("jdbc:derby://localhost:1527/movielogin","root","prakash");
        if(con!=null)
        {
            System.out.println("connection successfull");
        }
        else
        {
            System.out.println("connection successfull");
        }
        launch(args);
    }
    
}
