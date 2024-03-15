package com.jesusmelero.Ejercicios08;

import javax.swing.*;
import java.awt.*;

public class Ejercicio03 {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Hola Swing");
        ventana.setBounds(400, 400, 480, 300);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel("Bienvenido al mundo de las interfaces gráficas");
        label.setBounds(20, 20, 300, 20);

        panel.add(label);
        ventana.setContentPane(panel);

        ventana.setVisible(true);
        ventana.setResizable(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
