package lista.pkg1;

import java.util.Scanner;

public class Lista1 {
    public static void main(String[] args) {
        
        // Área = b.h  Perímetro = soma dos lados
        Scanner input = new Scanner(System.in);
        int x, y, p, a;
        
        System.out.print("Base do retângulo: ");
        x = Integer.valueOf(input.nextLine());
        System.out.print("Altura do retângulo: ");
        y = Integer.valueOf(input.nextLine());
        
        p = x*2+y*2;
        a = x*y;
        
        System.out.println("O perímetro do triângulo é "+p+" e a área é "+a); 
    }

}
