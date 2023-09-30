package exercitiul_4;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        // Creăm un obiect Random
        Random random = new Random();

        // Generăm două numere aleatoare între 1 și 30 inclusiv
        int num1 = random.nextInt(30) + 1;
        int num2 = random.nextInt(30) + 1;

        // Afișăm cele două numere generate
        System.out.println("Numărul 1: " + num1);
        System.out.println("Numărul 2: " + num2);

        // Calculăm CMMDc folosind algoritmul lui Euclid
        int cmmdc = calculCMMDc(num1, num2);

        // Afișăm rezultatul
        System.out.println("CMMDc al celor două numere: " + cmmdc);
    }

    // Metodă pentru a calcula CMMDc folosind algoritmul lui Euclid
    public static int calculCMMDc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}






