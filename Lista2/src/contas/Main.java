package contas;

public class Main {
    public static void main(String[] args) {
    	   System.out.println("----------------------------------------------------");
        Cliente cliente1 = new Cliente("Fernando Fernandes", "000.234.111-43");
        Cliente cliente2 = new Cliente("Maria Oliveira", "111.444.223-54");
        Produto produto1 = new Produto("Shorts", 85.00);
        Produto produto2 = new Produto("Chinela", 100.00);
        Conta c1 = new Conta(1, "06/03/2023", "14/04/2023", produto1, cliente1);
        Conta c2 = new Conta(2, "13/04/2023", "12/05/2023", produto2, cliente2);

        c1.visualizarConta();
        System.out.println("----------------------------------------------------");
        c2.visualizarConta();
        
    }
}

