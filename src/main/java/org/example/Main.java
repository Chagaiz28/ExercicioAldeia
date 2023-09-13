package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aldeia aldeia = new Aldeia("Konoha", 1000, "Fogo");
        int op;
        do{
            System.out.println("1 - Adicionar ninja");
            System.out.println("2 - Mostrar informações da aldeia");
            System.out.println("3 - Mostrar ninjas com ranking S");
            System.out.println("4 - Mostrar quantidade de ninjas com cada titulo");
            System.out.println("0 - Sair");
            op = sc.nextInt();
            if (op ==1){
                Ninja ninja = new Ninja();
                System.out.println("Digite o nome do ninja: ");
                ninja.nome = sc.next();
                System.out.println("Digite a idade do ninja: ");
                ninja.idade = sc.nextInt();
                System.out.println("Digite o titulo do ninja: ");
                ninja.titulo = sc.next();
                System.out.println("Digite o ranking do ninja: ");
                ninja.ranking = sc.next();
                aldeia.adcNinja(ninja);}
            if (op ==2){
                aldeia.mostraInfo();}
            if (op ==3){
                aldeia.rankingS();}
            if (op ==4){
                aldeia.qtdTitulos();
            }
            if (op ==0){
                System.out.println("Saindo...");
            }
        }while(op != 0);

    }
}

// Path: src\main\java\org\example\Ninja.java