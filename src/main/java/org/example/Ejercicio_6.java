package org.example;

import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Ejercicio_6 extends Application {

    @Override
    public void start(Stage stage) {

        BorderPane border = new BorderPane();

        Button norte  = new Button("NORTE");
        Button sur    = new Button("SUR");
        Button oeste  = new Button("OESTE");
        Button este   = new Button("ESTE");
        Button centro = new Button("CENTRO");

        border.setTop(norte);
        border.setBottom(sur);
        border.setLeft(oeste);
        border.setRight(este);
        border.setCenter(centro);

        // Centrar cada botón dentro de su región
        BorderPane.setAlignment(norte,  Pos.CENTER);
        BorderPane.setAlignment(sur,    Pos.CENTER);
        BorderPane.setAlignment(oeste,  Pos.CENTER);
        BorderPane.setAlignment(este,   Pos.CENTER);
        BorderPane.setAlignment(centro, Pos.CENTER);

        Scene scene = new Scene(border, 300, 200);
        stage.setTitle("Ejercicio 6 - BorderPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}