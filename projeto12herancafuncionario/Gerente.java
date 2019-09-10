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
public class Gerente extends Funcionario{
    
    private String setor;
    private String senha;
    
//construtores/getters/setters
    
    public Gerente() {
    }

    public Gerente(String setor, String senha, String nome, double salario, String cpf) {
        //palavra reservada SUPER
        //this.nome = nome;
        //this.salario = salario;
        //this.cpf = cpf;
        super(nome, salario, cpf);
        this.setor = setor;
        this.senha = senha;
        
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
      public String getInformacao(){
        return "Gerente: "+this.nome +"Recebe: "+this.salario;
    }
    @Override
    public double getBonificacao(){
        return this.salario* 0.15;
    }
    // comparação String usamos equals
    //comparação int usamos ==
   public boolean getAutenticacao(String senha){
       if(this.senha.equals(senha)){
           System.out.println("Acesso Permitido!");
           return true;
       }
       else{
           System.out.println("Acesso Negado!");
           return false;
       }
   }
 
}
