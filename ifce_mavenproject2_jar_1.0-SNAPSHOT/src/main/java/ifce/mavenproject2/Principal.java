/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifce.mavenproject2;

import javax.swing.JOptionPane;
import modelo.Pessoa;

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     //Criando uma Pessoa
    Pessoa p1 = new Pessoa();

    //Imprimindo informações iniciais
    String nome = JOptionPane.showInputDialog("Entre o nome");
    String idade = JOptionPane.showInputDialog("Entre a idade");
    p1.setIdade(Integer.parseInt(idade));
    p1.setNome(nome);

     p1.exibeInformacoes();

    //Fazendo alguns aniversários
    p1.fazAniversario();
    p1.fazAniversario();
    p1.fazAniversario();

    // Imprimindo informações após os aniversários
    p1.exibeInformacoes();

    }
    
}
