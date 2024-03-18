package com.jesusmelero.Ejercicios08.Ejercicio02;

import javax.swing.*;
import java.awt.*;

public class Ejercicio02 {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Hola Swing");
        Dimension dimension = new Dimension(800, 400);
        JLabel label = new JLabel("Bienvenido al mundo de las interfaces gráficas");



        ventana.setContentPane(label);
        ventana.setVisible(true);
        ventana.setResizable(true);
        ventana.pack();
        ventana.setSize(dimension);


    }
}
