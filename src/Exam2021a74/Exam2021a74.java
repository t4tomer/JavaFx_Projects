package Exam2021a74;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;


public class Exam2021a74 {

	int counter=0;
	Button num_pressed; //the id of the butten that pressed
	
    @FXML
    private GridPane pane;
    
    @FXML
    private Button but11;

    @FXML
    private Button but12;

    @FXML
    private Button but13;

    @FXML
    private Button but21;

    @FXML
    private Button but22;

    @FXML
    private Button but23;

    @FXML
    private Button but31;

    @FXML
    private Button but32;

    @FXML
    private Button but33;

    @FXML
    private Button clear;

    @FXML
    void but11_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but11);   	   	
    }

    @FXML
    void but12_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but12);
    }

    @FXML
    void but13_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but13);
    }

    @FXML
    void but21_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but21);
    }

    @FXML
    void but22_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but22);
    }

    @FXML
    void but23_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but23);
    }

    @FXML
    void but31_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but31);
    }

    @FXML
    void but32_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but32);
    }

    @FXML
    void but33_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but33);
    }
       
    
    @FXML
    void clear_pressed(ActionEvent event) {
    	clear();
    }

    public void control_cell(int counter,Button input) 
    {
    	
    	if(counter%2==0)
    		input.setStyle("-fx-background-color: white; ");
    	else
    		input.setStyle("-fx-background-color: black");
    }
    public void clear()
    {
    	
    	but11.setStyle("-fx-background-color: white");
    	but12.setStyle("-fx-background-color: white");
    	but13.setStyle("-fx-background-color: white");
    	but21.setStyle("-fx-background-color: white");
    	but22.setStyle("-fx-background-color: white");
    	but23.setStyle("-fx-background-color: white");
    	but31.setStyle("-fx-background-color: white");
    	but32.setStyle("-fx-background-color: white");
    	but33.setStyle("-fx-background-color: white");

    }
    
    
    
    
    
    
    
    
    
    

}
