package lista.pkg1.ex.pkg8;

import java.util.Scanner;

public class Lista1Ex8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fixo, mín, quant, com, valor;
        
        System.out.print("Valor das vendas: ");
         valor = Double.valueOf(input.nextLine());
        System.out.print("Quantidade de carros vendidos: ");
         quant = Double.valueOf(input.nextLine());
        System.out.print("Valor do salário mínimo: ");
         mín = Double.valueOf(input.nextLine());
         
        com = valor/20;
        fixo = mín*2+150*quant+com;
        
        System.out.println("O salário do funcionário será: "+fixo);
        
    }
    
}
