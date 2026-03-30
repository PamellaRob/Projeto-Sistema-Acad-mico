/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaacademico;

/**
 *
 * @author rober
 */
public class SistemaAcademico {

    public static void main(String[] args) {
        AlunoGraduacao ag1 = new AlunoGraduacao("Rya Michel", "2026001", 7.6);
        
        AlunoGraduacao ag2 = new AlunoGraduacao("Elizabeth Maria", "2026123", 9.5);
        
        AlunoPosGraduacao ap1 = new AlunoPosGraduacao("Alex Henrique", "2026456", 4.5);
        
        AlunoPosGraduacao ap2 = new AlunoPosGraduacao("Maria Geisilane", "2026789", 6.5);
        
        Professor p1 = new ProfessorEfetivo("Geraldo", "20261005", 5400);
        Professor p2 = new ProfessorTemporario("Nairon", "20260712", 3000, 24);
        Professor p3 = new ProfessorTemporario("Canidé", "20260809", 4670, 0);
        
        p1.aumentarSalario(800);
        System.err.println("Novo salário do professor efetivo: " + p1.getSalario());
        
        p2.aumentarSalario(600);
        System.out.println("Novo salário do professor temporário: " + p1.getSalario());
        
        p3.aumentarSalario(400);
        System.out.println("Salário professor temporário (encerrado): " + p3.getSalario());
        
        Disciplina d1 = new Disciplina("Banco de Dados", p1);
        Disciplina d2 = new Disciplina("Ciência de Dados", p2);
                
        d1.adicionarAluno(ag1);
        d1.adicionarAluno(ag2);
        
        d2.adicionarAluno(ap1);
        d2.adicionarAluno(ap2);
        
        
        d1.listarAlunos();
        d2.listarAlunos();
        
        
        ag1.exibirDados();
        System.out.println("Está aprovado(a)? " + ag1.verificarAprovacao());
        
        ag2.exibirDados();
        System.out.println("Está aprovado(a)? " + ag2.verificarAprovacao());
        ag2.ajustarNota(10);
        System.out.println("Nota ajustada: " + ag2.getNotaFinal());
        
        ap1.exibirDados();
        System.out.println("Está aprovado(a)? " + ap1.verificarAprovacao());
        
        ap2.exibirDados();
        System.out.println("Está aprovado(a)? " + ap2.verificarAprovacao());
        ap2.publicarArtigo("Maria Geisilane");
    }
}
