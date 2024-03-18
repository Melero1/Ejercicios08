package com.jesusmelero.Ejercicios08.Ejercicio06;

import javax.swing.*;
import java.awt.*;

public class UI {
    public UI() {
        JFrame ventana = new JFrame("Tabla IMC");
        Dimension dimension = new Dimension(400, 300);



        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(true);
        //ventana.setContentPane(panel);
        ventana.setSize(dimension);
        ventana.setVisible(true);
    }
}
