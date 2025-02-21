import javax.swing.*;

public class Carro {
    // variáveis;
    // tipo de dado primitivo;
    public int ano;
    public float velocidade;
    // tipo de dado é uma classe
    public String marca, modelo; // P: Por que String é maiúscula se não é uma classe
    // métodos construtores (sem parâmetros);
    public Carro(){
        this.marca = "Vazia";
        this.modelo = "Vazia";
    }
    public Carro(int ano, float velocidade, String marca, String modelo) {
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }
    // métodos;
    public void exibirDetalhes() {
        JOptionPane.showMessageDialog(null, "Marca: " + this.marca +
                "; Modelo: " + this.modelo +
                "; Ano: " + this.ano +
                "; Velocidade: " + this.velocidade); // this representa o obj que chama o método
    }

    // método que acelere a velocidade do carro;
    public void acelerar(float x) {
        this.velocidade = this.velocidade + x;
    }

    public void frear(float x) {
        this.velocidade = this.velocidade - x;
        if(this.velocidade < 0) {
            this.velocidade = 0;
        }
    }
}
