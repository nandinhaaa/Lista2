package funcionario;

public class Funcionario {
	String nome;
	String cpf;
	String departamento;
	double salario;
	String dataEntrada;
	boolean ativo;

public Funcionario (String nome,String departamento,double salario,String dataEntrada, String cpf) {
	this.nome = nome;
	this.cpf = cpf;
	this.departamento = departamento;
	this.salario=salario;
	this.dataEntrada = dataEntrada;
	this.ativo = true;

}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public String getDepartamento() {
	return departamento;
}

public void setDepartamento(String departamento) {
	this.departamento = departamento;
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

public String getDataEntrada() {
	return dataEntrada;
}

public void setDataEntrada(String dataEntrada) {
	this.dataEntrada = dataEntrada;
}

public boolean isAtivo() {
	return ativo;
}

public void setAtivo(boolean ativo) {
	this.ativo = ativo;
}

public void bonifica(double valor) {
    this.salario= salario + valor;
}

public void demite() {
    this.ativo = false;
}

public void mostra () {
    System.out.println("Nome: " + getNome());
    System.out.println("CPF: " + getCpf());
    System.out.println("Departamento: " + getDepartamento());
    System.out.println("Salário: " + getSalario());
    System.out.println("Data de entrada: " + getDataEntrada());
    System.out.println("Ativo: " + isAtivo());
}
}
