/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_final_Slide_Polimorfismo;

/**
 *
 * @author Thales
 */

public abstract class Disciplina {
    private String nome;
    private String período;
    private double nota1;
    private double nota2;
    
  Disciplina (){}

    public Disciplina(String nome, String período, double nota1, double nota2) {
        this.nome = nome;
        this.período = período;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeríodo() {
        return período;
    }

    public void setPeríodo(String período) {
        this.período = período;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    } 
    
    public abstract void avaliarDisciplina(double media);
    public void avaliarDisciplina(){
    
    
    
    }  
}
