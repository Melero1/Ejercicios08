package com.jesusmelero.Ejercicios08;

import com.jesusmelero.utils.Lib;

import javax.swing.*;
import java.util.Random;

public class Ejercicio05 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Hola Swing");
        ventana.setBounds(400, 400, 1024, 768);

        Random rnd = new Random();
        int numeroRandom = rnd.nextInt(1001) + 1;
        numeroRandom++;

        JLabel intentos = new JLabel();
        JPanel panel = new JPanel();

        ventana.setContentPane(panel);
        ventana.setVisible(true);

        for (int i = 0; i < 4; i++) {
            //JLabel label = new JLabel("Numero de intentos total: " + i) - 1;
        }


        JTextField field = new JTextField();





        //panel.add(label);

        ventana.setResizable(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
