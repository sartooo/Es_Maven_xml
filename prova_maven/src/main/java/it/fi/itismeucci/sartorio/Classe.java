package it.fi.itismeucci.sartorio;

import java.util.ArrayList;

public class Classe 
{
    public int numero ;
    public String sezione ;
    public String aula;
    public ArrayList <Alunno> listAlunni;

    public Classe() {
    }

    public Classe(int numero, String sezione, String aula, ArrayList<Alunno> listAlunni) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
        this.listAlunni = listAlunni;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSezione() {
        return this.sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getAula() {
        return this.aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public ArrayList<Alunno> getListAlunni() {
        return this.listAlunni;
    }

    public void setListAlunni(ArrayList<Alunno> listAlunni) {
        this.listAlunni = listAlunni;
    }

    public Classe numero(int numero) {
        setNumero(numero);
        return this;
    }

    public Classe sezione(String sezione) {
        setSezione(sezione);
        return this;
    }

    public Classe aula(String aula) {
        setAula(aula);
        return this;
    }

    public Classe listAlunni(ArrayList<Alunno> listAlunni) {
        setListAlunni(listAlunni);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " numero='" + getNumero() + "'" +
            ", sezione='" + getSezione() + "'" +
            ", aula='" + getAula() + "'" +
            ", listAlunni='" + getListAlunni() + "'" +
            "}";
    }

}
