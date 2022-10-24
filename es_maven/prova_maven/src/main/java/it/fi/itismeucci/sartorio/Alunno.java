package it.fi.itismeucci.sartorio;

import java.util.Date;

public class Alunno 
{
    public String nome;
    public String cognome;
    public Date dataNascita;

    public Alunno() {
    }

    public Alunno(String nome, String cognome, Date dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataNascita() {
        return this.dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Alunno nome(String nome) {
        setNome(nome);
        return this;
    }

    public Alunno cognome(String cognome) {
        setCognome(cognome);
        return this;
    }

    public Alunno dataNascita(Date dataNascita) {
        setDataNascita(dataNascita);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cognome='" + getCognome() + "'" +
            ", dataNascita='" + getDataNascita() + "'" +
            "}";
    }

}


