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
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Funcionário f1=new Funcionário();
       f1.Imprime1();
        System.out.println("-----------------------------------");
       Funcionário f2=new Funcionário("Carlos Eduardo Magalhães Cyrillo",21);
      f2.Imprime2();
      System.out.println("-----------------------------------");
       Funcionário f3=new Funcionário("201576004","Carlos Eduardo Magalhães Cyrillo",2100);
       f3.Imprime3();
       
    }
    
}
