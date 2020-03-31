package ch.fhnw.module06.ab3;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class ApplicationUI extends BorderPane {

    private Button left;
    private Button bottom;
    private Button right;
    private Button top;
    private TextArea textArea;
    
    public ApplicationUI() {
        initializeControls();
        layoutControls();
    }
    
    
    private void initializeControls() {
        top = new Button("top");
        top.setMaxWidth(400);
        
        bottom = new Button("bottom");
        bottom.setMaxWidth(400);
        
        left = new Button("left");
        right = new Button("right");

        textArea = new TextArea();

    }
 
    private void layoutControls() {
        setMargin(top, new Insets(5,5,5,5)); //Reihenfolge nicht massgebend
        setTop(top);
        setMargin(bottom, new Insets(5,5,5,5));
        setBottom(bottom);
        setMargin(left, new Insets(0,5,5,5));
        setLeft(left);
        setMargin(right, new Insets(0,5,5,5));
        setRight(right);
        setCenter(textArea);
        
        
        
        

    }
    
    
    



}
