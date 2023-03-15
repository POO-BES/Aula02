public class Main {
    public static void main(String[] args) {
        // Criando um carro (hb20) com o construtor que não recebe parâmetros
        // Esse construtor foi implementado na classe Carro para criar um modelo "default" (padrão) de carro
        Carro hb20 = new Carro();

        // Criando um carro (sandero) com o construtor que recebe todas as características (atributos) por parâmetro
        Carro sandero = new Carro("Branco", "Sandero", "Renault", 2006, 2);
        // Criar um carro como na linha 8, seria a mesma coisa que fazer o código abaixo
//        sandero.cor = "Branco";
//        sandero.modelo = "Sandero";
//        sandero.marca = "Renault";
//        sandero.ano = 2006;
//        sandero.numeroPortas = 2;
        // Economizamos 5 linhas e ficou muito mais bonito certo?

        // Impressão de teste para o modelo hb20
        System.out.println("----- HB20 -----");
        System.out.println("O seu carro é um " + hb20.modelo);
        System.out.println("O modelo pertence à marca " + hb20.marca);
        System.out.println("A cor do seu carro é " + hb20.cor);
        System.out.println("O ano do seu carro é " + hb20.ano);
        System.out.println("O seu carro possui " + hb20.numeroPortas + " portas");

        // Impressão de teste para o modelo sandero
        System.out.println("----- SANDERO -----");
        System.out.println("O seu carro é um " + sandero.modelo);
        System.out.println("O modelo pertence à marca " + sandero.marca);
        System.out.println("A cor do seu carro é " + sandero.cor);
        System.out.println("O ano do seu carro é " + sandero.ano);
        System.out.println("O seu carro possui " + sandero.numeroPortas + " portas");


        // Testando os métodos do hb20:
        // motorista ligou o carro, motorista acelerou 2x, motorista freou 3x, motorista buzinou
        // motorista ligou o pisca para a direita, motorista ligou o pisca para a esquerda
        // motorista bateu, o carro desligou :(
//        hb20.Ligar();
//        hb20.Acelerar(40);
//        hb20.Acelerar(60);
//        hb20.Frear();
//        hb20.Frear();
//        hb20.Frear();
//        System.out.println(hb20.Buzinar());
//        hb20.LigarPisca("direita");
//        hb20.LigarPisca("esquerda");
//        System.out.println(hb20.Bater());
//        hb20.Desligar();
    }
}
