/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico;

public class Professor {
    private String nome;
    private String matriculaFuncional;
    private double salario;
    
    public Professor (String nome, String matriculaFuncional, double salario){
      
        this.nome = nome;
        this.matriculaFuncional = matriculaFuncional;
        setSalario(salario);
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        if (salario>=0) {
            this.salario = salario;
        } else {
            this.salario = 0;
            System.out.println("O salário não pode ser negativo");
        }
    }
    
    public void aumentarSalario(double valor){
        if (valor > 0) {
            this.salario += valor;
        } else {
            System.out.println("Não foi possível continuar o processo! Digite somente valores positivos");
        }
    }
}
