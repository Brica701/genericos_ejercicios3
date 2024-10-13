import org.example.Operable;

public class TestOperable {
    public static void main(String[] args) {
        Operable<Integer> operacion = new Operable<Integer>() {
            @Override
            public Integer sumar(Integer otro) {
                return 5 + otro; // Por simplicidad, usando 5 como valor fijo
            }

            @Override
            public Integer restar(Integer otro) {
                return 5 - otro;
            }

            @Override
            public Integer multiplicar(Integer otro) {
                return 5 * otro;
            }

            @Override
            public Integer dividir(Integer otro) {
                if (otro == 0) {
                    throw new ArithmeticException("División por cero");
                }
                return 5 / otro;
            }
        };

        System.out.println("Suma: " + operacion.sumar(3));
        System.out.println("Resta: " + operacion.restar(2));
        System.out.println("Multiplicación: " + operacion.multiplicar(4));
        System.out.println("División: " + operacion.dividir(1));
    }
}

