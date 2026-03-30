/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico;

/**
 *
 * @author rober
 */
public class AlunoPosGraduacao extends Aluno{
      
    public AlunoPosGraduacao(String nome, String matricula, double notaFinal) {
        super(nome, matricula, notaFinal);
        
    }
    
    @Override
    public boolean verificarAprovacao(){
        return getNotaFinal() >=6;
    }
     
    public void publicarArtigo(String nome){
        System.out.println("Artigo Publicado pelo(a) aluno(a): " + nome);
    }
}
