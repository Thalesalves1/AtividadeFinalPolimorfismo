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
public class DisciplinaTrimestral extends Disciplina {

    private double media;
    private double nota1;
    private double nota2;
    DisciplinaTrimestral (){}
    
   
    public DisciplinaTrimestral(double media, double nota1, double nota2) {
        this.media = media;
        this.nota1 = nota1;
        this.nota2 = nota2;
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
    
   public void avaliarDisciplina(double media){
        
    }
     public void avaliarDisciplina (){
    media = (nota1 * 0.4) + (nota2 * 0.6);
   

}
   
    
}


