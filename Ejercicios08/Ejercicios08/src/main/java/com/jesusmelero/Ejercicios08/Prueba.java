package com.jesusmelero.Ejercicios08;

// Interfaz Animal con el metodo ruido
interface Animal {
    void rudio();
}

// Clase Gato implementando la interfaz Animal
class Gato implements Animal {
    public void rudio() {
        System.out.println("Miau Miau");
    }

}
// Ejemplo de uso
public class Prueba {
    public static void main(String[] args) {
        Animal gato = new Gato();
        gato.rudio();
    }
}
