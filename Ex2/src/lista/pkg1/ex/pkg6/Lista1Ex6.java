package lista.pkg1.ex.pkg6;

import java.util.Scanner;

public class Lista1Ex6 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double x, y;
       
       System.out.print("Digite a temperatura em Celcius: ");
        x = Double.valueOf(input.nextLine());
        
        y = (9*x)/5.0+32;
        
        System.out.println(x+" Celcius é igual a "+y+" Fahrenheit");
       
    }
    
}
