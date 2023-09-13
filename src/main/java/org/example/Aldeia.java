package org.example;

import java.util.Objects;

public class Aldeia {
    String nome;
    int qtdMoradores;
    String regiao;
    Ninja[] ninjas;

    public Aldeia(String nome, int qtdMoradores, String regiao) {
        this.nome = nome;
        this.qtdMoradores = qtdMoradores;
        this.regiao = regiao;
        this.ninjas = new Ninja[100];
    }

    void adcNinja(Ninja ninja){
        for (int i = 0; i < ninjas.length; i++) {
            if(ninjas[i] == null){
                System.out.println("Ninja "+ninja.nome+" adicionado a aldeia "+nome);
                ninjas[i] = ninja;
                break;
            }
        }
    }
    void mostraInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Quantidade de moradores: "+qtdMoradores);
        System.out.println("Região: "+regiao);
        System.out.println("Ninjas: ");
        for (Ninja ninja : ninjas) {
            if (ninja != null) {
                System.out.println(ninja.nome);
            }
        }
    }



    public void rankingS() {
        for (Ninja ninja : ninjas) {
            if (ninja != null) {
                if (Objects.equals(ninja.ranking, "S")) {
                    System.out.println(ninja.nome);
                }
            }
        }
    }


    public void qtdTitulos() {
        int qtdc = 0;
        int qtdg = 0;
        int qtda = 0;
        for (Ninja ninja : ninjas) {
            if (ninja != null){
                if (Objects.equals(ninja.titulo, "Chunin")) {
                    qtdc++;
                }
                if (Objects.equals(ninja.titulo, "Genin")) {
                    qtdg++;
                }
                if (Objects.equals(ninja.titulo, "Anbu")) {
                    qtda++;
                }
            }
        }
        System.out.println("Quantidade de Chunins: " + qtdc);
        System.out.println("Quantidade de Genins: " + qtdg);
        System.out.println("Quantidade de Anbus: " + qtda);
    }
}
