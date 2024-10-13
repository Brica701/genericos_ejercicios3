package org.example;

public class PilaArray<T> {

    private T[] array;
    private int contador;

    public PilaArray(int tamaño) {
        array = (T[]) new Object[tamaño];
        contador = 0;
    }

    public boolean estaVacia() {
        return contador == 0;
    }

    public T extraer() {
        if (estaVacia()) {
            System.out.println("La pila está vacía, no se puede extraer.");
            return null;
        }
        contador--;
        T elemento = array[contador];
        array[contador] = null;
        return elemento;
    }

    public T primero() {
        if (estaVacia()) {
            System.out.println("La pila está vacía, no hay elementos.");
            return null;
        }
        return array[contador - 1];
    }

    public void aniadir(T elemento) {
        if (contador == array.length) {
            System.out.println("La pila está llena, no se puede añadir.");
            return;
        }
        array[contador] = elemento;
        contador++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < contador; i++) {
            sb.append(array[i]);
            if (i < contador - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        PilaArray<String> pila = new PilaArray<>(5);

        pila.aniadir("Hola");
        pila.aniadir("Mundo");
        pila.aniadir("Java");

        // Mostrar pila
        System.out.println("Contenido de la pila: " + pila);

        System.out.println("¿Está vacía?: " + pila.estaVacia());

        System.out.println("Primero en la pila: " + pila.primero());

        System.out.println("Extrayendo: " + pila.extraer());
        System.out.println("Contenido después de extraer: " + pila);
    }
}
