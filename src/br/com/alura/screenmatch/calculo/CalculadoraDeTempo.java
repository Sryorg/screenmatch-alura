package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
//
//    public void incluiTempo(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }

    public void incluiTempo(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
