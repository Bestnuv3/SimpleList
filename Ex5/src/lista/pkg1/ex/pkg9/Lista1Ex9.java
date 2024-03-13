package lista.pkg1.ex.pkg9;

import java.util.Scanner;

public class Lista1Ex9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, x, y, z, vgnpc, vgnpl, vgnpb, total;
        
        System.out.print("Quantidade de café comprado: ");
         x = Double.valueOf(input.nextLine());
        System.out.print("Quantidade de leite comprado: ");
         y = Double.valueOf(input.nextLine());
        System.out.print("Quantidade de bolacha comprado: ");
         z = Double.valueOf(input.nextLine());
        System.out.print("Valor do café: ");
         a = Double.valueOf(input.nextLine());
        System.out.print("Valor do leite: ");
         b = Double.valueOf(input.nextLine());
        System.out.print("Valor da bolacha: ");
         c = Double.valueOf(input.nextLine());
         
        vgnpc = x*a;
        vgnpl = y*b;
        vgnpb = z*c;
        
        total = vgnpc+vgnpl+vgnpb;
        
        System.out.println("O valor pago em café foi: "+vgnpc);
        System.out.println("O valor pago em leite foi: "+vgnpl);
        System.out.println("O valor pago em bolacha foi: "+vgnpb);
        System.out.println("O valor total pago foi: "+total);
    }
    
}
