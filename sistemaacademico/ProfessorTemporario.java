/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico;

public class ProfessorTemporario extends Professor{
    private int contratoDuracao;
    
    public ProfessorTemporario(String nome, String matriculaFuncional, double salario, int contratoDuracao) {
        super(nome, matriculaFuncional, salario);
        
        this.contratoDuracao = contratoDuracao;
    }

    @Override
    public void aumentarSalario(double valor){
        if (contratoDuracao>0) {
            super.aumentarSalario(valor);
        } else {
            System.out.println("Ñão é possível fazer o aumento salarial pois o contrato está encerrado");
        }
    }
}
