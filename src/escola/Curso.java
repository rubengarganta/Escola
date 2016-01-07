/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import java.util.ArrayList;

/**
 *
 * @author aRomano
 */
abstract public class Curso {
    // numero de creditos para conclusao
    // final pois nao tem nenhum metodo set
    private static final int creditos = 180;
    

    // regime diurno ou pos laboral
    protected String regimeHorario = "Diurno";
    protected String coordenador;
    protected String emailCoordenador;
    
    abstract public String getNomeCurso();
    
    abstract public char getTurma();
    
    public static int getCreditos() {
        return Curso.creditos;
    }
    
    public void setRegimeHorario(String horario) {
        this.regimeHorario = horario;
    }
    
    public String getRegimeHorario() {
        return this.regimeHorario;
    }
    
    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }
    
    public String getCoordenador() {
        return this.coordenador;
    }
    
    public void setEmailCoordenador(String email) {
        this.emailCoordenador = email;
    }
    
    public String getEmailCoordenador() {
        return this.emailCoordenador;
    }
    
    //abstract public void addCadeira(Cadeira cadeira);
    
    //abstract public Cadeira getCadeira(int index);
    
    private Cadeira[] cadeiras = new Cadeira[20];
    private int cadeirasLength = 0;
    public void addCadeira(Cadeira cadeira) {
        if(cadeirasLength < cadeiras.length) {
            cadeiras[cadeirasLength] = cadeira;
            System.out.println("Cadeira adicionado à lista no index " + cadeirasLength);
            cadeirasLength++;
        }
    }
    
    public Cadeira getCadeira(int index) {
        return cadeiras[index];
    }
    
    public int cadeirasLength() {
        return cadeirasLength;
    }
    
//    private Aluno[] alunos = new Aluno[200];
//    private int alunosLength = 0;
//    public void addAluno(Aluno aluno) {
//        if(alunosLength < alunos.length) {
//            alunos[alunosLength] = aluno;
//            System.out.println("Aluno adicionado à lista no index " + alunosLength);
//            alunosLength++;
//        }
//    }
//    
//    public Aluno getAluno(int index) {
//        return alunos[index];
//    }
//    
//    public int alunosLength() {
//        return alunosLength;
//    }
    private ArrayList<Aluno> alunos = new ArrayList<>();
    
    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void remAluno(int index) {
        alunos.remove(index);
    }
    
    public Aluno getAluno(int index) {
        return alunos.get(index);
    }
    
    public int alunosLength() {
        return alunos.size();
    }
    
}
