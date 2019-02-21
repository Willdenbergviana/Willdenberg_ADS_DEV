package ExercicioRevisao;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EX01 {
    public static void main(String[] args){
        System.out.println(" Entre com Total de Vendas: ");
        Scanner sc = new Scanner(System.in);
        double totalVendas = sc.nextDouble();
        double comissao = totalVendas*0.1;
        System.out.println(comissao);



    }
}
