package org.example;

import java.util.ArrayList;

public class ListaOrdenada<E extends Comparable<E>> {
    private ArrayList<E> lista;

    // Constructor
    public ListaOrdenada() {
        lista = new ArrayList<>();
    }

    public void add(E o) {
        int i = 0;
        while (i < lista.size() && lista.get(i).compareTo(o) < 0) {
            i++;
        }
        lista.add(i, o);
    }

    public E get(int index) {
        if (index >= 0 && index < lista.size()) {
            return lista.get(index);
        }
        return null;
    }

    public int size() {
        return lista.size();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public boolean remove(E o) {
        return lista.remove(o);
    }

    public int indexOf(E o) {
        return lista.indexOf(o);
    }

    @Override
    public String toString() {
        return lista.toString();
    }

    public static void main(String[] args) {
        ListaOrdenada<Integer> lista = new ListaOrdenada<>();
        lista.add(5);
        lista.add(2);
        lista.add(8);
        lista.add(3);

        System.out.println("Lista ordenada: " + lista);
        System.out.println("Elemento en índice 2: " + lista.get(2));
        System.out.println("Tamaño de la lista: " + lista.size());
        System.out.println("¿Está vacía? " + lista.isEmpty());
        lista.remove(3);
        System.out.println("Lista después de eliminar 3: " + lista);
        System.out.println("Índice del elemento 5: " + lista.indexOf(5));
    }
}
