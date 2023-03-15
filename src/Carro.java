// Criação um objeto Carro
public class Carro {
    //Atributos (características do objeto)
    String cor;
    String modelo;
    String marca;
    int ano;
    int numeroPortas;
    boolean ligado;
    float velocidade;

    // Construtor do objeto que define valores padrão para os atributos (características) do objeto
    public Carro() {
        // Neste caso adotei o meu carro como o carro padrão que o Construtor irá criar.
        this.cor = "Prata";
        this.modelo = "Hb20";
        this.marca = "Hyundai";
        this.ano = 2021;
        this.numeroPortas = 4;

        // Definição dos atributos ligado e velocidade dentro do próprio construtor
        // Anteriormente havíamos colocado estas inicializações junto com a declaração das variáveis
        // O adequeado é sempre inicializarmos os valores dentro do construtor
        this.ligado = false;
        this.velocidade = 0f;
    }

    // Construtor do objeto que recebe como parâmetro todas as características do Carro que será criado
    // Aqui nós obrigamos quem estiver criando o Carro à definir as características já na criação do carro (new Carro("branco", "Sandero", "Renault", 2010, 2)
    public Carro(String cor, String modelo, String marca, int ano, int numeroPortas) {
        // Definição das características do carro de acordo com os parâmetros passados para o construtor
        // usamos "this" para explicitar que estamos nos referindo às variáveis de dentro da classe Carro
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.numeroPortas = numeroPortas;

        // Definição dos atributos ligado e velocidade dentro do próprio construtor
        // Anteriormente havíamos colocado estas inicializações junto com a declaração das variáveis
        // O adequeado é sempre inicializarmos os valores dentro do construtor
        this.ligado = false;
        this.velocidade = 0f;
    }

    // Métodos (ações que o objeto pode executar)

    // Método que representa a ação de Ligar o carro
    public void Ligar() {
        // Alteração do valor do atributo ligado para verdadeiro (true)
        ligado = true;
        // Impressão de um feedback de que o carro está ligado
        System.out.println("O seu carro está ligado");
    }

    // Método que representa a ação de Desligar o carro
    public void Desligar() {
        // Alteração do valor do atributo ligado para verdadeiro (true)
        ligado = false;
        // Impressão de um feedback de que o carro está desligado
        System.out.println("O seu carro está desligado");
    }

    // Método que representa a ação de Acelerar o carro
    // e recebe como parâmetro o valor que será adicionado à velocidade
    public void Acelerar(float adicao) {
        // Acréscimo do valor informado ao valor atual da velocidade
        velocidade += adicao;
        // Impressão da velocidade atual como feedback
        System.out.println("Sua velocidade agora é: " + velocidade);
    }

    // Método que representa a ação de Frear o carro
    public void Frear() {
        // Redução do valor fixo 5 toda vez que o método Frear é chamado
        velocidade -= 5f;
        // Impressão da velocidade atual como feedback
        System.out.println("Sua velocidade agora é: " + velocidade);
    }

    // Método Buzinar que retorna uma String com o som da buzina
    public String Buzinar() {
        return "BIIIIIIIIIIIIIII";
    }

    // Método Bater que retorna uma String com o som da batida
    public String Bater() {
        return "BUMMMMMMMMM";
    }

    // Método Ligar o Pisca que recebe como parâmetro uma String
    // que informa para qual lado o pisca está sendo acionado
    public void LigarPisca(String lado) {
        // Caso a String lado recebida por parâmetro seja igual à palavra "direita"
        if(lado.equals("direita")) {
            // Então o pisca foi acionado para a direita e fazemos uma impressão de feedback
            System.out.println("Você está virando para a direita!");
        // Caso contrário, o pisca está sendo acionado para a esquerda
        } else {
            // Impressão do feedback do lado que está sendo ligado o pisca
            System.out.println("Você está virando para a esquerda!");
        }
    }
}