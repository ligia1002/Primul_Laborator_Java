package exercitiul_5;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        // Creăm un obiect Random
        Random random = new Random();

        // Generăm un număr întreg aleatoriu între 0 și 20 inclusiv
        int numarGenerat = random.nextInt(21);

        // Afișăm numărul generat
        System.out.println("Numărul generat aleatoriu: " + numarGenerat);

        // Calculăm șirul lui Fibonacci până când depășește numărul generat
        int a = 0, b = 1, c;
        while (a < numarGenerat) {
            c = a + b;
            a = b;
            b = c;
        }

        // Verificăm dacă numărul generat aparține șirului lui Fibonacci
        if (a == numarGenerat) {
            System.out.println(numarGenerat + " aparține șirului lui Fibonacci.");
        } else {
            System.out.println(numarGenerat + " nu aparține șirului lui Fibonacci.");
        }
    }
}