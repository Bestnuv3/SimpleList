package lista.pkg1.ex.pkg10;

import java.util.Scanner;

public class Lista1Ex10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quo, resto, número;
        
        System.out.print("Digite o número: ");
         número = Integer.valueOf(input.nextLine());
        
         quo = número/2;
         resto = número%2;
         
         System.out.println("O quociente de "+número+" divido por 2 é "+quo+" e o resto é "+resto);
    }
    
}
