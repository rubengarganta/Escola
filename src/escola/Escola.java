/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import javax.swing.JTextField;

/**
 *
 * @author aRomano
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    private static int totalMatriculas = 0;
    
    public static void novaMatricula() {
        Escola.totalMatriculas++;
    }
    
    public static void removerMatricula() {
        Escola.totalMatriculas--;
    }
    
    Escola() {
        
    }
    
    public static void main(String[] args) {
        CursoInformatica curso1 = new CursoInformatica("Noturno", "Desconhecido", "coordenador@escola.pt");
        CursoInformatica curso2 = new CursoInformatica("2222", "Desconh2222ecido", "coorden2222ador@escola.pt");
        CursoMultimedia curso3 = new CursoMultimedia("Notu3333rno", "Desconh3333ecido", "coorde3333nador@escola.pt");
        CursoInformatica curso4 = new CursoInformatica("Notu4444rno", "Descon4444hecido", "coorden4444ador@escola.pt");
        CursoMultimedia curso5 = new CursoMultimedia("Notur5555no", "Desconh5555ecido", "coorde5555nador@escola.pt");
        CursosList.add(curso1);
        CursosList.add(curso2);
        CursosList.add(curso3);
        CursosList.add(curso4);
        CursosList.add(curso5);
        
        
        System.out.println(CursosList.get(0).getCoordenador());
        
        Cadeira mat = new Cadeira();
        CursosList.get(1).addCadeira(mat);
        System.out.println(CursosList.get(1).getCadeira(0).getNumero());
        System.out.println(CursosList.get(1).getCadeira(0));
        
        Aluno aluno1 = new Aluno("Andre1");
        Aluno aluno2 = new Aluno("Andre2");
        Aluno aluno3 = new Aluno("Andre3");
        Aluno aluno4 = new Aluno("Andre4");
        Aluno aluno5 = new Aluno("Andre5");
        Aluno aluno6 = new Aluno("Andre6");
        Aluno aluno7 = new Aluno("Ruben");
        CursosList.get(0).addAluno(aluno1);
        CursosList.get(1).addAluno(aluno2);
        CursosList.get(2).addAluno(aluno3);
        CursosList.get(4).addAluno(aluno4);
        CursosList.get(1).addAluno(aluno5);
        CursosList.get(1).addAluno(aluno6);
        CursosList.get(1).addAluno(aluno7);
        
        System.out.println(CursosList.get(1).getAluno(0).getNumero());
        
        System.out.println(CursosList.get(0).alunosLength());
        
        EscolaView mainView = new EscolaView();
        
        //mainView.geralView(cursos);
        mainView.addAlunoView();
        
        
    }
    
}


 