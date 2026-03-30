/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico;

/**
 *
 * @author rober
 */
public class AlunoGraduacao extends Aluno{
    
    
    public AlunoGraduacao(String nome, String matricula, double notaFinal) {
        super(nome, matricula, notaFinal);
    }
    
    @Override
    public boolean verificarAprovacao(){
        return getNotaFinal() >=7;
    }
}
