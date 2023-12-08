/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Pessoa {
    private int idade;
    private String nome;
    
    public void exibeInformacoes() {
         JOptionPane.showMessageDialog(null,"Nome: "+ this.nome+ "; Idade: "+ this.idade+ " anos");
    }
    public int fazAniversario (){
        this.idade++;
        return idade; 
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}

