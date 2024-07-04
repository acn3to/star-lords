package entidades;

import java.util.Date;

public class Alienigena {
    private int id;
    private String nome;
    private Especie especie;
    private int nivelPericulosidade;
    private Date dataHoraEntrada;
    private boolean emQuatentena;

    public Alienigena(int id, String nome, Especie especie, int nivelPericulosidade, Date dataHoraEntrada, boolean emQuatentena) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.nivelPericulosidade = nivelPericulosidade;
        this.dataHoraEntrada = dataHoraEntrada;
        this.emQuatentena = emQuatentena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public int getNivelPericulosidade() {
        return nivelPericulosidade;
    }

    public void setNivelPericulosidade(int nivelPericulosidade) {
        this.nivelPericulosidade = nivelPericulosidade;
    }

    public Date getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(Date dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public boolean isEmQuatentena() {
        return emQuatentena;
    }

    public void setEmQuatentena(boolean emQuatentena) {
        this.emQuatentena = emQuatentena;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", especie=" + getEspecie() +
                ", nivelPericulosidade=" + getNivelPericulosidade() +
                ", dataHoraEntrada=" + getDataHoraEntrada() +
                '}';
    }
}
