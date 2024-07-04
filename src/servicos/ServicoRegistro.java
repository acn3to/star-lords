package servicos;

import entidades.Alienigena;
import entidades.Especie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ServicoRegistro {
    private List<Alienigena> alienigenas;
    private Map<String, Especie> mapEspecies;

    public ServicoRegistro(List<Alienigena> alienigenas, Map<String, Especie> mapEspecies) {
        this.alienigenas = alienigenas;
        this.mapEspecies = mapEspecies;
    }

    public void registrarAlienigena() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do alienígena:");
        String nomeAlienigena = scanner.nextLine();

        System.out.println("Digite o nome da espécie (e.g., 'Humano', 'Avatariano', etc.):");
        String nomeEspecie = scanner.nextLine();

        Especie especie = mapEspecies.get(nomeEspecie);

        if (especie == null) {
            System.out.println("Erro: Espécie desconhecida!");
            return;
        }

        System.out.println("Digite o nível de periculosidade (de 1 a 100):");
        int nivelPericulosidade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a data de entrada (formato YYYY-MM-DD):");
        String dataHoraEntradaString = scanner.nextLine();
        Date dataHoraEntrada = null;
        try {
            dataHoraEntrada = new SimpleDateFormat("yyyy-MM-dd").parse(dataHoraEntradaString);
        } catch (ParseException e) {
            System.out.println("Data de entrada inválida!");
            return;
        }

        System.out.println("Está o alienígena em quarentena? (s/n)");
        String emQuarentenaInput = scanner.nextLine().trim().toLowerCase();
        boolean emQuarentena = emQuarentenaInput.equals("s");

        UUID id = UUID.randomUUID();
        Alienigena alienigena = new Alienigena(id.toString(), nomeAlienigena, especie, nivelPericulosidade, dataHoraEntrada, emQuarentena);

        alienigenas.add(alienigena);

        System.out.println("Alienígena " + nomeAlienigena + " registrado com sucesso como um " + nomeEspecie + ".");
    }
}
