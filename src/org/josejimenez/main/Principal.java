/*
Nombre: Jose Alejandro Jimenez de la Cruz
código: IN5BV
Canet:2022152
Fecha de creación:24-03-2023
Fecha de modificación:25-03-2023 
    a 26-03-2023 de 10pm a 3:33am
Fecha de modificación:25-03-2023 de
    10:30pm a 1:10am 
 */
package org.josejimenez.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author informatica
 */
public class Principal extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
