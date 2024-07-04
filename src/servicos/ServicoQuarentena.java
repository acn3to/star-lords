package servicos;

import entidades.Alienigena;

import java.util.List;

public class ServicoQuarentena {
    private List<Alienigena> alienigenasEmQuarentena;

    public ServicoQuarentena(List<Alienigena> alienigenas) {
        this.alienigenasEmQuarentena = alienigenas;
    }

    public void listarEmQuarentena() {
        System.out.println("Alienigenas em quarentena:");
        for (Alienigena alienigena : alienigenasEmQuarentena) {
            System.out.println(alienigena.getNome());
        }
    }
}
