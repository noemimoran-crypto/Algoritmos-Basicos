package Clases;


public class Algoritmos {
   
   
    //numero par
    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    // verificar si un numero es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        // divisores desde 2 hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }

    // Metodo para invertir un String
    public static String stringEnReversa(String texto) {
        if (texto == null) {
            return null;
        }
        StringBuilder reversa = new StringBuilder();
        // Recorremos el string desde el ultimo indice hasta el primero
        for (int i = texto.length() - 1; i >= 0; i--) {
            reversa.append(texto.charAt(i));
        }
        return reversa.toString();
    }

    // Metodo para verificar si es palindromo
    public static boolean esPalindromo(String texto) {
        if (texto == null) {
            return false;
        }
        // Limpiamos el texto: quitamos espacios y pasamos a minusculas
        String textoLimpio = texto.replace(" ", "").toLowerCase();
        // Reutilizamos el metodo estatico stringEnReversa
        String textoInvertido = stringEnReversa(textoLimpio);
        
        return textoLimpio.equals(textoInvertido);
    }

    // secuencia FizzBuzz
    public static void secuenciaFizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Salto de linea 
    }
}  

