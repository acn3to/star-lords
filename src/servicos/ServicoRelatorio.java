package servicos;

import entidades.Alienigena;
import java.util.List;

public class ServicoRelatorio {
    private List<Alienigena> alienigenas;

    public ServicoRelatorio(List<Alienigena> alienigenas) {
        this.alienigenas = alienigenas;
    }

    public void mostrarTodosAlienigenas() {
        for (Alienigena alienigena : alienigenas) {
            System.out.println("ID: " + alienigena.getId());
            System.out.println("Nome: " + alienigena.getNome());
            System.out.println("Espécie: " + alienigena.getEspecie().getNome());
            System.out.println("Nível de Periculosidade: " + alienigena.getNivelPericulosidade());
            System.out.println("Data de Entrada: " + alienigena.getDataHoraEntrada());
            System.out.println("Em Quarentena: " + (alienigena.isEmQuatentena() ? "Sim" : "Não"));
            System.out.println("-----------------------------");
        }
    }
}
