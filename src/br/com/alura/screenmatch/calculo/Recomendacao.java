package br.com.alura.screenmatch.calculo;

public class Recomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificado() >= 4) {
            System.out.println("Está entre os melhores filmes do momento");
        } else if (classificavel.getClassificado() >= 2) {
            System.out.println("Filme de qualidade mediana");
        } else {
            System.out.println("Ainda não assistiu");
        }
    }
}
