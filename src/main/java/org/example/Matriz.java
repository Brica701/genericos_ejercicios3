package org.example;

public class Matriz<T> {
    private T[][] matriz;
    private int filas;
    private int columnas;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = (T[][]) new Object[filas][columnas]; 
    }

    public void set(int fila, int columna, T elemento) {
        matriz[fila][columna] = elemento;
    }

    public T get(int fila, int columna) {
        return matriz[fila][columna];
    }

    public int filas() {
        return filas;
    }

    public int columnas() {
        return columnas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sb.append(matriz[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Matriz<Integer> miMatriz = new Matriz<>(3, 3);
        miMatriz.set(0, 0, 1);
        miMatriz.set(0, 1, 2);
        miMatriz.set(0, 2, 3);
        miMatriz.set(1, 0, 4);
        miMatriz.set(1, 1, 5);
        miMatriz.set(1, 2, 6);
        miMatriz.set(2, 0, 7);
        miMatriz.set(2, 1, 8);
        miMatriz.set(2, 2, 9);

        System.out.println(miMatriz.toString());
    }
}
