/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private Professor professorResponsavel;
    private List<Aluno> alunos;
    
    public Disciplina(String nome, Professor professorResponsavel){
        
        this.nome = nome;
        
        if (professorResponsavel == null) {
    throw new IllegalArgumentException("Professor deve ser obrigatório");
} 
        this.professorResponsavel = professorResponsavel;
        this.alunos = new ArrayList<>();
    
    }
    
    public void adicionarAluno(Aluno aluno){
        if (aluno == null) {
            System.out.println("Aluno inválido!");
            return;
        }
        if (alunos.contains(aluno)) {
            System.out.println("O aluno já esta adicionado nesta disciplina");
        } else {
            alunos.add(aluno);
        }
    }
    
    public void listarAlunos(){
        System.out.println("=== Lista de Alunos em " + nome + " ===");
        
        for (Aluno a: alunos){
            a.exibirDados();
        }
    
    }

}
