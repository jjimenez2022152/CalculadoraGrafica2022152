/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.josejimenez.main;

import static java.lang.System.exit;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 *
 * @author informatica
 */
public class FXMLDocumentController implements Initializable {

    double valor1, valor2, resultado;
    int op;

    @FXML
    private TextField txtPantalla;
    @FXML
    private Button btnCero;
    @FXML
    private Button btnUno;
    @FXML
    private Button btnDos;
    @FXML
    private Button btnTres;
    @FXML
    private Button btnCuatro;
    @FXML
    private Button btnCinco;
    @FXML
    private Button btnSeis;
    @FXML
    private Button btnSiete;
    @FXML
    private Button btnOcho;
    @FXML
    private Button btnNueve;
    @FXML
    private Button btnMas;
    @FXML
    private Button btnMenos;
    @FXML
    private Button btnIgual;
    @FXML
    private Button btnPunto;
    @FXML
    private Button btnMasMenos;
    @FXML
    private Button btnMulti;
    @FXML
    private Button btnDivi;
    @FXML
    private Button btnRaiz;
    @FXML
    private Button btnCuadrado;
    @FXML
    private Button btnUnoX;
    @FXML
    private Button btnPorciento;
    @FXML
    private Button btnC;
    @FXML
    private Button btnCE;
    @FXML
    private ImageView imgCerrar;
    @FXML
    private Button btnImagen;

    @FXML
    private void buttonPunto(ActionEvent event) {
        if (event.getSource() == btnPunto) {
            txtPantalla.setText(txtPantalla.getText() + ".");
        }
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnUno) {
            txtPantalla.setText(txtPantalla.getText() + "1");
        }

        if (event.getSource() == btnDos) {
            txtPantalla.setText(txtPantalla.getText() + "2");
        }

        if (event.getSource() == btnTres) {
            txtPantalla.setText(txtPantalla.getText() + "3");
        }

        if (event.getSource() == btnCuatro) {
            txtPantalla.setText(txtPantalla.getText() + "4");
        }

        if (event.getSource() == btnCinco) {
            txtPantalla.setText(txtPantalla.getText() + "5");
        }

        if (event.getSource() == btnSeis) {
            txtPantalla.setText(txtPantalla.getText() + "6");
        }

        if (event.getSource() == btnSiete) {
            txtPantalla.setText(txtPantalla.getText() + "7");
        }

        if (event.getSource() == btnOcho) {
            txtPantalla.setText(txtPantalla.getText() + "8");
        }

        if (event.getSource() == btnNueve) {
            txtPantalla.setText(txtPantalla.getText() + "9");
        }

        if (event.getSource() == btnCero) {
            txtPantalla.setText(txtPantalla.getText() + "0");
        } else if (event.getSource() == btnMas) {
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            op = 1;

        } else if (event.getSource() == btnMenos) {
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            op = 2;

        } else if (event.getSource() == btnMulti) {
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            op = 3;

        } else if (event.getSource() == btnDivi) {
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            op = 4;

        } else if (event.getSource() == btnCuadrado) {
            valor1 = Double.parseDouble(txtPantalla.getText());
            resultado = Math.pow(valor1, 2);
            txtPantalla.setText("" + resultado);
            op = 5;

        } else if (event.getSource() == btnRaiz) {
            valor1 = Double.parseDouble(txtPantalla.getText());
            resultado = Math.sqrt(valor1);
            txtPantalla.setText("" + resultado);
            op = 6;

        } else if (event.getSource() == btnUnoX) {
            valor1 = Double.parseDouble(txtPantalla.getText());
            resultado = 1.0 / valor1;
            txtPantalla.setText("" + resultado);
            op = 7;

        } else if (event.getSource() == btnPorciento) {
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            op = 8;

        } else if (event.getSource() == btnC) {
            txtPantalla.setText("");

        } else if (event.getSource() == btnCE) {
            txtPantalla.setText(txtPantalla.getText().substring(0, txtPantalla.getText().length() - 1));

        } else if (event.getSource() == btnMasMenos) {
            valor1 = Double.parseDouble(txtPantalla.getText());
            resultado = valor1 * -1;
            txtPantalla.setText("" + resultado);

        } else if (event.getSource() == btnImagen) {
            exit(0);
            
        } else if (event.getSource() == btnIgual) {
            valor2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.setText("");
            switch (op) {
                case 1:
                    resultado = valor1 + valor2;
                    txtPantalla.setText(String.valueOf(resultado));
                    break;

                case 2:
                    resultado = valor1 - valor2;
                    txtPantalla.setText(String.valueOf(resultado));
                    break;

                case 3:
                    resultado = valor1 * valor2;
                    txtPantalla.setText(String.valueOf(resultado));
                    break;

                case 4:
                    resultado = valor1 / valor2;
                    txtPantalla.setText(String.valueOf(resultado));
                    break;

                case 5:
                    txtPantalla.setText(String.valueOf(resultado));
                    break;

                case 6:
                    txtPantalla.setText(String.valueOf(resultado));
                    break;

                case 7:
                    txtPantalla.setText(String.valueOf(resultado));
                    break;

                case 8:
                    resultado = valor1 * valor2 / 100;
                    txtPantalla.setText(String.valueOf(resultado));
                    break;

                case 9:
                    txtPantalla.setText(String.valueOf(resultado));
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
