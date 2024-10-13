package org.example;

import java.util.LinkedList;

public class Pila<T> {

    private LinkedList<T> lista;

    public Pila() {
        lista = new LinkedList<>();
    }

    public boolean estaVacia() {
        return lista.isEmpty();
    }

    public T extraer() {
        if (estaVacia()) {
            System.out.println("La pila está vacía, no se puede extraer.");
            return null;
        }
        return lista.removeFirst();
    }

    public T primero() {
        if (estaVacia()) {
            System.out.println("La pila está vacía, no hay elementos.");
            return null;
        }
        return lista.getFirst();
    }

    public void aniadir(T elemento) {
        lista.addFirst(elemento);
    }

    @Override
    public String toString() {
        return lista.toString();
    }

    public static void main(String[] args) {
        Pila<String> pilaCadenas = new Pila<>();

        pilaCadenas.aniadir("Hola");
        pilaCadenas.aniadir("Mundo");
        pilaCadenas.aniadir("Java");

        System.out.println("Contenido de la pila: " + pilaCadenas);

        System.out.println("¿Está vacía?: " + pilaCadenas.estaVacia());

        System.out.println("Primero en la pila: " + pilaCadenas.primero());

        System.out.println("Extrayendo: " + pilaCadenas.extraer());
        System.out.println("Contenido después de extraer: " + pilaCadenas);
    }
}
