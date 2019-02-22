package ExercicioRevisao;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args){
        System.out.print(" Digite Quantidade de Folhas: ");
        Scanner sc = new Scanner(System.in);
        int totalFolha = sc.nextInt();
        double resultado;
        if (totalFolha<=100) {
            resultado = totalFolha * 0.25;
        }else{
            resultado = totalFolha*0.20;
        }
        System.out.println(" Valor total das Folhas: " + resultado);


    }
}
