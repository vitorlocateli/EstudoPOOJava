package br.com.vitor.screenmatch.modelos;

import br.com.vitor.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
       private String diretor;

        public String getDiretor() {
            return diretor;
        }

        public void setDiretor(String diretor) {
            this.diretor = diretor;
        }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
