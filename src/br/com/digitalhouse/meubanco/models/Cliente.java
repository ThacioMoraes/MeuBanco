package br.com.digitalhouse.meubanco.models;

public class Cliente {
    private int numeroCliente;
    private String nome;
    private double divida;
    private double[] numeros;

    public Cliente(int numero, String nome){
        this.numeroCliente = numero;
        this.nome = nome;
    }

    public void aumentarDivida(double valor){
        this.divida += valor;
    }

    public void pagarDivida(double valor){
        this.divida -= valor;
    }

    public double consultaDivida() {
        return this.divida;
    }

    public void setNumeros(double[] numeros) {
        this.numeros = numeros;
    }

    public double[] getNumeros() {
        return numeros;
    }
}
