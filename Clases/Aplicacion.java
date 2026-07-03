package Clases;

public class Aplicacion {

    public static void main(String[] args) {
        System.out.println(" PRUEBAS DE LA CLASE ALGORITMOS ");

        // 1. Prueba de par
        int numPar = 14;
        int numImpar = 7;
        System.out.println("¿El numero " + numPar + " es par?: " + Algoritmos.esPar(numPar));
        System.out.println("¿El numero " + numImpar + " es par?: " + Algoritmos.esPar(numImpar));
        System.out.println("----------------------------------------");

        // 2. Prueba de primo
        int numPrimo = 17;
        int numNoPrimo = 20;
        System.out.println("¿El numero " + numPrimo + " es primo?: " + Algoritmos.esPrimo(numPrimo));
        System.out.println("¿El numero " + numNoPrimo + " es primo?: " + Algoritmos.esPrimo(numNoPrimo));
        System.out.println("----------------------------------------");

        // 3. Prueba de stringEnReversa()
        String palabraOriginal = "Java";
        System.out.println("Texto original: " + palabraOriginal);
        System.out.println("Texto en reversa: " + Algoritmos.stringEnReversa(palabraOriginal));
        System.out.println("----------------------------------------");

        // 4. Prueba de esPalindromo()
        String palindromo = "Anilina";
        String noPalindromo = "Computadora";
        System.out.println("¿La palabra '" + palindromo + "' es palindromo?: " + Algoritmos.esPalindromo(palindromo));
        System.out.println("¿La palabra '" + noPalindromo + "' es palindromo?: " + Algoritmos.esPalindromo(noPalindromo));
        System.out.println("----------------------------------------");

        // 5. Prueba de secuenciaFizzBuzz()
        System.out.println("Secuencia FizzBuzz hasta el 15:");
        Algoritmos.secuenciaFizzBuzz(15);
        System.out.println("----------------------------------------");
    }
}