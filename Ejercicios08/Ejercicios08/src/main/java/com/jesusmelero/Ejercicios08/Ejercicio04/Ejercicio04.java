package com.jesusmelero.Ejercicios08.Ejercicio04;

import javax.swing.*;
import java.awt.*;

public class Ejercicio04 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Hola Swing");
        ventana.setBounds(400, 400, 1024, 768);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        ventana.setContentPane(panel);
        ventana.setVisible(true);

        JLabel label1 = new JLabel("Me gusta cocinar.");
        JLabel label2 = new JLabel("Me gusta programar.");
        JLabel label3 = new JLabel("Me gusta jugar.");
        JLabel label4 = new JLabel("Me gusta escuchar música.");
        JLabel label5 = new JLabel("Me gusta correr.");

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);

        ventana.setResizable(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
