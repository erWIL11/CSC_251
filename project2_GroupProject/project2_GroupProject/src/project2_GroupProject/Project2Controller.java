package project2_GroupProject;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javax.swing.*;
import java.sql.*;

public class Project2Controller {

    @FXML
    private RadioButton xtraLargeSizeRadioButton;

    @FXML
    private RadioButton stuffedCrustRadioButton;

    @FXML
    private CheckBox pineappleToppingCheckBox;

    @FXML
    private RadioButton largeSizeRadioButton;

    @FXML
    private CheckBox chickenToppingCheckBox;

    @FXML
    private Label toppingLabel;

    @FXML
    private RadioButton gutBusterCrustRadioButton;

    @FXML
    private RadioButton mediumSizeRadioButton;

    @FXML
    private CheckBox extraCheeseToppingCheckBox;

    @FXML
    private ToggleGroup pizzaSize;

    @FXML
    private ToggleGroup crustStyle;

    @FXML
    private CheckBox onionToppingCheckBox;

    @FXML
    private CheckBox hamToppingCheckBox;

    @FXML
    private CheckBox pepperoniToppingCheckBox;

    @FXML
    private CheckBox greenPepperToppingCheckBox;

    @FXML
    private RadioButton smallSizeRadioButton;

    @FXML
    private Label crustLabel;

    @FXML
    private CheckBox slicedTomatoToppingCheckBox;

    @FXML
    private RadioButton deepDishCrustRadioButton;

    @FXML
    private CheckBox blackOliveToppingCheckBox;

    @FXML
    private CheckBox mushroomToppingCheckBox;

    @FXML
    private RadioButton handTossedCrustRadioButton;

    @FXML
    private Label sizeLabel;

    @FXML
    private CheckBox sausageToppingCheckBox;

    @FXML
    private CheckBox baconToppingCheckBox;

    @FXML
    private RadioButton thinCrustRadioButton;
    
    double cost;
    String size;
    String crustStyleVar;
    String toppingList;

    public void initialize() {
        double cost = 0.0; // Pizza cost
        size = "";
        crustStyleVar = "";
        toppingList = "Topping List: |";
    }
    
    // Event listener for submit button
    public void submitButtonListener() {
        
        // Determine size
        if (smallSizeRadioButton.isSelected() == true) {
            cost += 7;
            size = "Small";
        }
        else if (mediumSizeRadioButton.isSelected() == true) {
            cost += 9;
            size = "Medium";
        }
        else if (largeSizeRadioButton.isSelected() == true) {
            cost += 11;
            size = "Large";
        }
        else if (xtraLargeSizeRadioButton.isSelected() == true) {
            cost += 13;
            size = "Extra Large";
        }
        
        // Determine crust
        if (handTossedCrustRadioButton.isSelected() == true) {
            crustStyleVar = "Hand Tossed";
        }
        else if (thinCrustRadioButton.isSelected() == true) {
            crustStyleVar = "Thin Crust";
        }
        else if (gutBusterCrustRadioButton.isSelected() == true) {
            crustStyleVar = "Gut Buster";
        }
        else if (stuffedCrustRadioButton.isSelected() == true) {
            crustStyleVar = "Stuffed Crust";
        }
        else if (deepDishCrustRadioButton.isSelected() == true) {
            crustStyleVar = "Deep Dish";
        }
        
        // Determine toppings
        if (baconToppingCheckBox.isSelected() == true) {
            cost += .5;
            toppingList += "| Bacon |";
        }
        
        if (sausageToppingCheckBox.isSelected() == true) {
            cost += .5;
            toppingList += "| Sausage |";
        }
        
        if (mushroomToppingCheckBox.isSelected() == true) {
            cost += .5;
            toppingList += "| Mushroom |";
        }
        
        if (blackOliveToppingCheckBox.isSelected() == true) {
            cost += .5;
            toppingList += "| Black Olives |";
        }
        
        if (slicedTomatoToppingCheckBox.isSelected() == true) {
            cost += .5;
            toppingList += "| Sliced Tomatoes |";
        }
        
        if (greenPepperToppingCheckBox.isSelected() == true) {
            cost += .5;
            toppingList += "| Green Peppers |";
        }
        
        if (pepperoniToppingCheckBox.isSelected() == true) {
            cost += .5;
            toppingList += "| Pepperoni |";
        }
        
        if (hamToppingCheckBox.isSelected() == true) {
            cost += .5;
            toppingList += "| Ham |";
        }
        
        if (onionToppingCheckBox.isSelected() == true) {
            cost += .5;
            toppingList += "| Onions |";
        }
        
        if (extraCheeseToppingCheckBox.isSelected() == true) {
            cost += .5;
            toppingList += "| Extra Cheese |";
        }
        
        if (chickenToppingCheckBox.isSelected() == true) {
            cost += .5;
            toppingList += "| Chicken |";
        }
        
        if (pineappleToppingCheckBox.isSelected() == true) {
            cost += .5;
            toppingList += "| Pineapple |";
        }
        
        System.out.println("Size: " + size);
        System.out.println("Crust Style: " + crustStyleVar);
        System.out.println(toppingList);
        System.out.println("Cost: $" + cost);
        
        try {
            OrderTableManager orderManager = new OrderTableManager();
            orderManager.insert(size, crustStyleVar, toppingList, cost);
            JOptionPane.showMessageDialog(null, "Order created!");
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.exit(0);
        }
    }
}
