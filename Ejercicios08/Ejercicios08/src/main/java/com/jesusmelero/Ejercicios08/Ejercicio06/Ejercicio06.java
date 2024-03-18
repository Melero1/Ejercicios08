package com.jesusmelero.Ejercicios08.Ejercicio06;

import javax.swing.*;

public class Ejercicio06 {

    private enum Clasificacion {
        PESO_BAJO, DELGADEZ_SEVERA, DELGADEZ_MODERADA, DELGADEZ_LEVE,
        NORMAL,
        SOBRE_PESO, PREOBESIDAD,
        OBESIDAD, OBESIDAD_LEVE, OBESIDAD_MEDIA, OBESIDAD_MORBIDA,
    }

    private double masa;
    private double estatura;

    private double totalIMC = masa /estatura * 2;


    public Ejercicio06() {
        //Invoca la clase UI
        SwingUtilities.invokeLater(UI::new);



    }

}
