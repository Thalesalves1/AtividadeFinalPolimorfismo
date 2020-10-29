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
public class DisciplinaSemestral extends Disciplina {
    private double media;
    private double nota1;
    private double nota2;
    private double nota3;
    
    DisciplinaSemestral (){}
     public void avaliarDisciplina(double media){
        
    }

    public DisciplinaSemestral(double media, double nota1, double nota2, double nota3) {
        this.media = media;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
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

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
  public void avaliarDisciplina (){
   media = (nota1 + nota2 + nota3)/3;
   

    }

}
