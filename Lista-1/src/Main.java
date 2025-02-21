//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Público e estático void (não retorna nada) main (função)
        // criando objetos da classe Carro
        // instanciar a classe Carro
        Carro obj1 = new Carro();
        obj1.ano = 2015;
        obj1.velocidade = 0.0f;
        obj1.marca = "Chevrolet";
        obj1.modelo = "Onix";
        obj1.exibirDetalhes(); // velocidade = 0
        obj1.acelerar(50);
        obj1.exibirDetalhes(); // velocidade = 50
        obj1.frear(60);
        obj1.exibirDetalhes(); // velocidade = 0

        Carro obj2 = new Carro();
        obj2.ano = 2018;
        obj2.velocidade = 0.0f;
        obj2.marca = "Volkswagen";
        obj2.modelo = "Gol";
        obj2.exibirDetalhes(); // velocidade  = 0
        obj2.acelerar(50);
        obj2.exibirDetalhes(); // velocidade = 50
        obj2.frear(30);
        obj2.exibirDetalhes(); // velocidade = 20

        Carro obj3 = new Carro();
        obj3.exibirDetalhes();
    }
}