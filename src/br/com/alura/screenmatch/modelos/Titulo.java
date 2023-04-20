package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDeAvaliacao;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;
    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    };

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibirFichaTecnica() {
        System.out.println("O nome do filme é: " + nome);
        System.out.println("A duração do filme é: " + duracaoEmMinutos + "minutos");
    };

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void avalia(double nota) {
        somaDeAvaliacao += nota;
        totalDeAvaliacao++;
    };

    double media() {
        return somaDeAvaliacao / totalDeAvaliacao;
    }
}
