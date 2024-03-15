package com.jesusmelero.Ejercicios08;

import com.jesusmelero.*;

import javax.swing.*;
import java.awt.*;

public class Ejercicio01 {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Hola Swing");
        Dimension dimension = new Dimension(200, 200);

        JPanel panel = new JPanel();


        ventana.setVisible(true);
        ventana.setResizable(true);
        ventana.pack();
        ventana.setContentPane(panel);
        ventana.setSize(dimension);

    }



}
