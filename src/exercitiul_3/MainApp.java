package exercitiul_3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int prim=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("nr= ");
        int nr=scanner.nextInt();

        for(int i=2;i<=nr/2;i++)
            if(nr%i==0)
            {
                System.out.print(i);
                System.out.print("\n");
                prim=1;
            }
        if(prim==1) System.out.print("Numarul nu e prim.\n");

    }
}