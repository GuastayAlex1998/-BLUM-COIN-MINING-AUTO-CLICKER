import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        // Clase Scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y Asignaciones
        String palabraSecreta = "INTELIGENCIA-GRATITUD";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de Control: Iterativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Estructura de Control: Iterativa (Bucle)
        while (!palabraAdivinada && intentos < intentosMaximos) {
                                                        //Esto se usa cuando tenemos una palabra de chars
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");

            System.out.println("Intoduce una letra por favor!");

            // Usamos la clase scanner para pedir una letra
            //toLowerCase utilizamos para transformar letras de mayusculas a minusculas
            //toUpperCase utilizamos para transformar letras de minusculas a mayusculas
            char letra = Character.toUpperCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Estructura de Control: Iterativa (Bucle)
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura de control: condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }

            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto de queda! " + (intentosMaximos - intentos) + " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades, as adivinado la palabra secreta: " + palabraSecreta);
            }
        }

        if (!palabraAdivinada) {
            System.out.println("¡Que pena te has quedado sin intentos! GAME OVER");
        }

        scanner.close();
    }
}
