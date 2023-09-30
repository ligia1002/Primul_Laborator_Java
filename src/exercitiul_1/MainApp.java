package exercitiul_1;

import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("l= ");
        int l=scanner.nextInt();
        System.out.print("L= ");
        int L=scanner.nextInt();

        System.out.print("Perimetrul dreptunghiului este: "+ (2*L+2*l));
        System.out.print("\n ");
        System.out.print("Aria dreptunghiului este: "+ (L*L+l*l));
        scanner.close();
    }
}