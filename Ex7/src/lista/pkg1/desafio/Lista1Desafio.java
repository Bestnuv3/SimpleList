package lista.pkg1.desafio;

import java.util.Scanner;

public class Lista1Desafio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inicial, min, hora, resto;
        
        System.out.print("Tempo de vídeo em segundos: ");
        inicial = Integer.valueOf(input.nextLine());
        
        hora = inicial/3600;
        min = inicial%3600/60;
        resto = hora%60;
        
        System.out.println(hora+"h"+min+"m"+resto+"s");
    }
    
}
