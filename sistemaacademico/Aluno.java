/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico;

/**
 *
 * @author rober
 */
public abstract class Aluno {
    private String nome;
    private String matricula;
    private double notaFinal;
    
    public Aluno(String nome, String matricula, double notaFinal){
    
        if (nome == null || nome.trim().isEmpty()) {
            System.err.println("O Nome não pode estar vazio!");
            this.nome = "Não Informado";
        } else{
            this.nome = nome;
        }
        
        if (matricula == null || matricula.trim().isEmpty()) {
            System.err.println("A matrícula não pode estar vazia!");
            this.matricula = "Não Informado";
        } else {
            this.matricula = matricula;
        }
        
        setNotaFinal(notaFinal);
    }
    
    public void setNotaFinal(double notaFinal){
     if (notaFinal >= 0 && notaFinal <= 10) {
            this.notaFinal = notaFinal;
        } else {
            this.notaFinal = 0;
            System.out.println("Nota Inválida! Digite um valor entre 0 e 10");
        }
    }
    
    public double getNotaFinal(){
        return notaFinal;
    }
    
    public void ajustarNota(double novaNota){
        setNotaFinal(novaNota);
    }
    
    public void exibirDados(){
        System.err.println("=================================================");
        System.out.println("Dados do Aluno");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota Final: " + notaFinal);      
    }

    public abstract boolean verificarAprovacao();
}
