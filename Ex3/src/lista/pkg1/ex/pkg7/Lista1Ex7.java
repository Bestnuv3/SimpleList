package lista.pkg1.ex.pkg7;

import java.util.Scanner;

public class Lista1Ex7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y, z, total, xa, yb, zc;
        int a, b, c;
        
        System.out.print("Qauntidade de picolés X vendidos: ");
         a = Integer.valueOf(input.nextLine());
        System.out.print("Qauntidade de picolés Y vendidos: ");
         b = Integer.valueOf(input.nextLine());
        System.out.print("Qauntidade de picolés Z vendidos: ");
         c = Integer.valueOf(input.nextLine());
        
        x = 1.50;
        y = 2.0;
        z = 0.75;
        xa = x*a;
        yb = y*b;
        zc = z*c;
        total = xa+yb+zc;
        
        System.out.println("O valor total da venda é de: "+total);
    }
    
}
