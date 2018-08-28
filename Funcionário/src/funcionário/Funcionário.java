/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionário;

/**
 *
 * @author dudu
 */
public class Funcionário {
    private String matricula;
    private String  nome;
    private int  idade;
    private String cargo;
    private float salario;
    public static int numeroFuncionário=0;

    public Funcionário() {
      
        this.salario = 1500;
        Funcionário.numeroFuncionário+=1;
    }
  
 
    
     public Funcionário(String matricula, String nome, float salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        Funcionário.numeroFuncionário+=1;      
    }
        public Funcionário( String nome, int idade) {
        
        this.nome = nome;
        this.idade = idade;
        Funcionário.numeroFuncionário+=1;
    }
    public void Imprime1(){
           System.out.println("Salário:"+this.salario);
           System.out.println("Número de funcionários:"+Funcionário.numeroFuncionário);
    }
    public void Imprime2(){
        System.out.println("Nome:"+this.nome);
        System.out.println("Idade:"+this.idade);
         System.out.println("Número de funcionários:"+Funcionário.numeroFuncionário);
    }
    public void Imprime3(){
         System.out.println("Nome:"+this.nome);
         System.out.println("Matrícula:"+this.matricula);
         System.out.println("Salário:"+this.salario);
          System.out.println("Número de funcionários:"+Funcionário.numeroFuncionário);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
