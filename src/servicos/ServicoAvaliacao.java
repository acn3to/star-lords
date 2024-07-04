package servicos;

import entidades.Alienigena;
import entidades.Especie;

import java.util.ArrayList;
import java.util.List;

public class ServicoAvaliacao {
    private List<Alienigena> alienigenas;

    public ServicoAvaliacao(List<Alienigena> alienigenas) {
        this.alienigenas = alienigenas;
    }

    public void procurarEspeciesPerigosas(int limiarPericulosidade) {
        List<Especie> especiesPerigosas = new ArrayList<>();
        for (Alienigena alienigena : alienigenas) {
            if (alienigena.getNivelPericulosidade() >= limiarPericulosidade) {
                especiesPerigosas.add(alienigena.getEspecie());
            }
        }
        System.out.println("Especies perigosas encontradas:");
        for (Especie especie : especiesPerigosas) {
            System.out.println(especie.getNome());
        }
    }
}
