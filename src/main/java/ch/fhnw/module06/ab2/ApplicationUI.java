package ch.fhnw.module06.ab2;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {

    private Button button;
    private Label label;
    private TextField field;
    private TextArea area;
    
    public ApplicationUI() {
        initializeControls();
        layoutControls();
    }
    
    
    private void initializeControls() {
        button = new Button("Ein Button");
        label = new Label("Ein Label");
        field = new TextField("text field");
        area = new TextArea("text area");

    }
 
    private void layoutControls() {
        setPadding(new Insets(8));
        getChildren().add(label); //Reihenfolge wichtig
        setMargin(field, new Insets(5));
        getChildren().add(field);
        getChildren().add(area);
        getChildren().add(button);
        
        

    }
    
    
    



}
