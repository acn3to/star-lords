package entidades;

import java.util.Date;

public class Especie extends Alienigena {
    public Especie(String id, String nome, Especie especie, int nivelPericulosidade, Date dataHoraEntrada, boolean emQuatentena, Planeta planetaOrigem, int periculosidadeBase) {
        super(id, nome, especie, nivelPericulosidade, dataHoraEntrada, emQuatentena);
        this.planetaOrigem = planetaOrigem;
        this.periculosidadeBase = periculosidadeBase;
    }

    public Planeta getPlanetaOrigem() {
        return planetaOrigem;
    }

    public void setPlanetaOrigem(Planeta planetaOrigem) {
        this.planetaOrigem = planetaOrigem;
    }

    public int getPericulosidadeBase() {
        return periculosidadeBase;
    }

    public void setPericulosidadeBase(int periculosidadeBase) {
        this.periculosidadeBase = periculosidadeBase;
    }

    private Planeta planetaOrigem;
    private int periculosidadeBase;


    @Override
    public String toString() {
        return "Especie{" +
                "planetaOrigem=" + getPlanetaOrigem() +
                ", periculosidadeBase=" + getPericulosidadeBase() +
                '}';
    }
}
