package ch.fhnw.module06.ab3;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Starter extends Application {
    

    @Override
    public void start(Stage primaryStage) {
        Parent rootPanel = new ApplicationUI();
        Scene myScene = new Scene(rootPanel);
        primaryStage.setScene(myScene);
        primaryStage.setTitle("JavaFX App");
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        primaryStage.show();
    }
    
    
    
    
    public static void main(String[] args) {
        Application.launch();
    }

}
