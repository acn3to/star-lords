import entidades.Alienigena;
import entidades.Especie;
import entidades.Planeta;
import servicos.ServicoAvaliacao;
import servicos.ServicoQuarentena;
import servicos.ServicoRegistro;
import servicos.ServicoRelatorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Alienigena> alienigenas = new ArrayList<>();
        Map<String, Especie> mapEspecies = new HashMap<>();
        ServicoRelatorio servicoRelatorio = new ServicoRelatorio(alienigenas);
        ServicoAvaliacao servicoAvaliacao = new ServicoAvaliacao(alienigenas);
        ServicoRegistro servicoRegistro = new ServicoRegistro(alienigenas, mapEspecies);
        ServicoQuarentena servicoQuarentena = new ServicoQuarentena(alienigenas);

        // Criando planetas
        Planeta terra = new Planeta(1, "Terra", "Planeta habitado pelos humanos.");
        Planeta avatar = new Planeta(2, "Avatar", "Planeta habitado pelos Avatarianos.");

        mapEspecies.put("Humano", new Especie("1637", "Humano", null, 5, null, false, terra, 100));
        mapEspecies.put("Avatariano", new Especie("1555", "Avatariano", null, 7, null, false, avatar, 150));

        while (true) {
            System.out.println("Bem vindo ao sistema StarLord, o maior gerenciador de espécies do universo C-137. O que gostaria de fazer agora:");
            System.out.println("1. Registrar um alienígena");
            System.out.println("2. Mostrar todos os alienígenas registrados");
            System.out.println("3. Procurar por espécies perigosas");
            System.out.println("4. Listar alienígenas em quarentena");
            System.out.println("5. Sair");

            int choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
                case 1:
                    servicoRegistro.registrarAlienigena();
                    break;
                case 2:
                    servicoRelatorio.mostrarTodosAlienigenas();
                    break;
                case 3:
                    int limiarPericulosidade = 17;
                    servicoAvaliacao.procurarEspeciesPerigosas(limiarPericulosidade);
                    break;
                case 4:
                    servicoQuarentena.listarEmQuarentena();
                    break;
                case 5:
                    System.out.println("Adeus!");
                    return;
                default:
                    System.out.println("Escolha inválida!");
            }
        }
    }
}
