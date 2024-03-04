package br.com.vitor.screenmatch.calculo;
import br.com.vitor.screenmatch.modelos.Titulo;

public class calculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de" + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
