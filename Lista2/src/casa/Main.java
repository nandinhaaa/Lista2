package casa;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria", 18);
        System.out.println("Nome: " + pessoa.getNome() + ", idade: " + pessoa.getIdade());

        pessoa.setNome("Fernanda");
        pessoa.setIdade(19);
        System.out.println("Nome: " + pessoa.getNome() + ", idade: " + pessoa.getIdade());

        pessoa.fazAniversario();
        System.out.println("Nome: " + pessoa.getNome() + ", idade: " + pessoa.getIdade());

        Porta porta = new Porta(false, "Preta", 0.6, 3.0, 0.03);
        System.out.println("Porta aberta? " + porta.isAberta());
        porta.setAberta(true);
        System.out.println("Porta aberta? " + porta.isAberta());
        porta.setAberta(false);
        System.out.println("Porta aberta? " + porta.isAberta());
        porta.setCor("azul");
        System.out.println("Cor da porta: " + porta.getCor());
        porta.setDimensaoX(1.0);
        porta.setDimensaoY(2.1);
        porta.setDimensaoZ(0.04);
        System.out.println("Dimensões da porta: " + porta.getDimensaoX() + " x " + porta.getDimensaoY() + " x " + porta.getDimensaoZ());

        // Criando as portas
        Porta porta1 = new Porta(false, "azul", 1.5, 2.2, 0.03);
        Porta porta2 = new Porta(true, "verde", 1.5, 2.0, 0.04);
        Porta porta3 = new Porta(true, "amarela", 0.7, 2.4, 0.05);

        // Criando a casa
        Casa casa = new Casa("Rosa", porta1, porta2, porta3);

        // Pintando a casa
        casa.setCor("Verde");

        // Abrindo e fechando as portas
        casa.getPorta1().abre();
        casa.getPorta2().fecha();
        casa.getPorta3().fecha();

        // Imprimindo o número de portas que estao abertas
        System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());

    }
}