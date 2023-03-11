package funcionario;

public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Maria", "RH", 1800, "01/01/2023", "12345678932");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("RG: " + f1.getCpf());
        System.out.println("Departamento: " + f1.getDepartamento());
        System.out.println("Salário: " + f1.getSalario());
        System.out.println("Data de entrada: " + f1.getDataEntrada());
        System.out.println("Ativo: " + f1.isAtivo());

        f1.bonifica(100);
        System.out.println("Novo salário: " + f1.getSalario());

        f1.demite();
        System.out.println("Ativo: " + f1.isAtivo());
        
       f1.mostra();
       
    }
	}


