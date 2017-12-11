/**
 * This program adds an order for a pizza to a database
 * 12.06.17
 * CSC 251 0001 -- Project 2 -- Pizzeria
 * @author Matthew (Melissa) Walsh, Erika Wilson, Jeovannie Melendezmorales
 */

package project2_GroupProject;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;

public class Project2_GroupProject extends Application {
    public void start(Stage stage) throws Exception {
        // Load the FXML file
        Parent parent = FXMLLoader.load(getClass().getResource("project2_GroupProject.fxml"));
        
        // Build the scene graph
        Scene scene = new Scene(parent);
        
        // Display our window, using scene graph
        stage.setTitle("Pizza Creator");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
