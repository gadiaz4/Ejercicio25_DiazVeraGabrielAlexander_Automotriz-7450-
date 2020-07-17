/*
Diseñe un algoritmo; de tal manera que le permita crear una matriz de objetos
como una matriz de elemtos de datos de tipo primitivo.
 */
package tarea6_arrayobjeto1;
import java.util.Scanner;

/**
 *
 * @author Gabriel Alexander Diaz Vera
 */
class Distractores{
public int codigo;
public String  descripcion;
Distractores(int codigo, String descripcion){
    this.codigo=codigo;
    this.descripcion=descripcion;
}
}
public class Tarea6_ArrayObjeto1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);
    System.out.println("\t\t\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE\n");
    System.out.println("Nombre: Díaz Vera Gabriel Alexander");
    System.out.println("Asignatura: Programación");
    System.out.println("Nrc: 7450");
    System.out.println("Tema del Paper: Transferencia de Aprendizaje Mediante Redes Neuronales"
            + " Convolucionales para el Reconocimiento de Conductores Distraídos.");
        Distractores[] arreglo;
       arreglo= new Distractores[10];
       arreglo[0]=new Distractores (0, " Conducción normal");
       arreglo[1]=new Distractores (1, " Usar el celular – Derecha");
       arreglo[2]=new Distractores (2, " Hablar por teléfono – Derecha");
       arreglo[3]=new Distractores (3, " Usar el celular – Izquierda");
       arreglo[4]=new Distractores (4, " Hablar por teléfono – Izquierda");
       arreglo[5]=new Distractores (5, " Operar la radio");
       arreglo[6]=new Distractores (6, " Beber");
       arreglo[7]=new Distractores (7, " Voltearse");
       arreglo[8]=new Distractores (8, " Maquillarse o arreglarse el cabello");
       arreglo[9]=new Distractores (9, " Hablar con el pasajero");
       //accediendo a los elemntos del array
       for (int i=0;i<arreglo.length;i++)
           System.out.println("Categoria posibles a indetificar en " +i+ ": D"+ arreglo[i].codigo + ""
                   + "--->"+arreglo[i].descripcion);
    }

}
