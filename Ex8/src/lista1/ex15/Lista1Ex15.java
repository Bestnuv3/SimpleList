
package lista1.ex15;

import java.util.Scanner;

public class Lista1Ex15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso1, nv1, nv2;
        
        System.out.print("Digite deu peso: ");
        peso1 = Double.valueOf(input.nextLine());
        
        nv1 = peso1*1.15;
        nv2 = peso1*0.8;
        
        System.out.println("Seu peso se ganhar 15% de peso será "+nv1+" e se perder 20% será "+nv2);
    }
    
}
