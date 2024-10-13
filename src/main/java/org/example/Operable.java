package org.example;

public interface Operable<E> {
    E sumar(E otro);
    E restar(E otro);
    E multiplicar(E otro);
    E dividir(E otro);
}
