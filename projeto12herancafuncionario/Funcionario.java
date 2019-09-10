/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto12herancafuncionario;

/**
 *
 * @author aluno
 */
public class Funcionario {
    //inicialmente os ATR serao PRIVADOS
    //mudar os modificadores dos atributos para protected de modo que
    //esses atributos da classe funcionario ( pai) tenham
    //visibilidade dentro da hierarquia de herança na classe gerente
    
    protected String nome;
    protected double salario;
    protected String cpf;
    
//construtores/getters/setters
    public Funcionario() {
    }

    public Funcionario(String nome, double salario, String cpf) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getInformacao(){
        return "Funcionario: "+this.nome +"Recebe: "+this.salario;
    }
    public double getBonificacao(){
        return this.salario* 0.10;
    }
}
