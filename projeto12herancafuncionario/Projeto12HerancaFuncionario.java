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
public class Projeto12HerancaFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instanciar
        
        Funcionario objFunc01 = new Funcionario();
        objFunc01.setNome("Joao");
        objFunc01.setSalario(500);
        objFunc01.setCpf("111222333");
        System.out.println("Func01: "+objFunc01.getNome());
        System.out.println("Func01: "+objFunc01.getSalario());
        System.out.println("Func01: "+objFunc01.getCpf());
        System.out.println("Info: "+ objFunc01.getInformacao()+"\n\n");
        
        
        //instanciar a classe gerente
        
        Gerente objGer01 = new Gerente();
        objGer01.setNome("maria" );
        objGer01.setSalario(600);
        objGer01.setCpf("222111444");
        objGer01.setSetor("ADM");
        objGer01.setSenha("323");
        System.out.println("Ger01: "+
                objGer01.getNome()+"\n"+"Salario: "+
                objGer01.getSalario()+"\n"+"CPF: "+
                objGer01.getCpf()+"\n"+"SETOR: "+
                objGer01.getSetor()+"\n"+"SENHA: "+
                objGer01.getSenha()+"\n");
                objGer01.getAutenticacao("566");
        
        
       //uncionario objFunc02 = new(Gerente);
        //casting entre objetos ( CLASSES)
        //da mesma forma que vimos em tipos PRIMITIVOS
      //Gerente objGer02 = (Gerente) new Funcionario();
        
        //atribuição entre gerente
        //usando casting
        
      //objFunc02 = objGer02;
      //objGer02 = (Gerente) objFunc02;
      
            
        
    
         
        
        
    }
    
}
