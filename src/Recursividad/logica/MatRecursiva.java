package Recursividad.logica;

public class MatRecursiva {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El numero debe ser >= 0");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumaHastaN(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El numero debe ser >= 0");
        }

        if (n == 0) {
            return 0;
        }

        return n + sumaHastaN(n - 1);
    }

    public static double serieArmonica(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("El numero debe ser mayor que 0");
        }

        if (n == 1) {
            return 1;
        }

        return (1.0 / n) + serieArmonica(n - 1);
    }

    public static int potencia(int base, int exponente) {
        if (exponente < 0) {
            throw new IllegalArgumentException("El exponente debe ser >= 0");
        }

        if (exponente == 0) {
            return 1;
        }

        return base * potencia(base, exponente - 1);
    }

    public static int mcd(int m, int n) {

        if (m < 0 || n < 0) {
            throw new IllegalArgumentException("Los numeros deben ser >= 0");
        }

        if (n == 0) {
            return m;
        }

        return mcd(n, m % n);
    }
}
