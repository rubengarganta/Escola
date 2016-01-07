/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author aRomano
 */
public class CursosList {
    
    private static Curso[] cursos = new Curso[10];
    private static int cursosLength = 0;
    
    public static void add(Curso curso) {
        if(cursosLength < cursos.length) {
            cursos[cursosLength] = curso;
            System.out.println("Curso adicionado à lista no index " + cursosLength);
            cursosLength++;
        }
    }
    
    public static Curso get(int index) {
        return cursos[index]; 
    }
    
    public static Curso[] get() {
        return cursos;
    }
    
    public static int length() {
        return cursosLength;
    }
    
    
}
