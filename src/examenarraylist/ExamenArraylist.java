
package examenarraylist;
import java.util.*;


public class ExamenArraylist {

    public static void main(String[] args) {
         
       Scanner leer=new Scanner (System.in);
       ArrayList<String>nombre=new ArrayList<String>();
       ArrayList<Float>velocidad=new ArrayList<Float>();
       ArrayList<Float>tiempo=new ArrayList<Float>();
       int opcion=1 , mejort=0, peort=0;
       float reset=0;
       
       while(opcion !=0){
    System.out.println("Digite el nombre del estudiante ");
    nombre.add(leer.next());
     System.out.println("Digite la velocidad del estudiante  o (0 para salir):");
     opcion=leer.nextInt();
     if (opcion !=0){
         velocidad.add((float)opcion);
         tiempo.add(100/velocidad.get(velocidad.size()-1));
         reset=reset+tiempo.get(tiempo.size()-1);
     }
    }
       reset = reset/tiempo.size();
       
       int i=0, cont=0, x=0;
       
      for(; x<velocidad.size(); x++){
      if(velocidad.get(x)<velocidad.get(peort)){
      peort = x;
        }
        }
      for(; i<velocidad.size(); i++){
      if(velocidad.get(i)>velocidad.get(mejort)){
       mejort = i;
        } 
        if(tiempo.get(i)>reset){
         cont++;
            }
        System.out.println(nombre.get(i) + " V: " + velocidad.get(i) + " T: " + tiempo.get(i));
            }
     System.out.println("Alumno más veloz: " + nombre.get(mejort) + "  "+"Tiempo: " + tiempo.get(mejort) + "  "+"Velocidad: " + velocidad.get(mejort));
     System.out.println("Alumno menos veloz: " + nombre.get(peort) + "  "+"Tiempo: " + tiempo.get(peort) + "  "+"Velocidad: " + velocidad.get(peort));
     System.out.println("Promedio: " + reset);
     System.out.println("Estudiantes por encima del promedio: " + cont);
}
       
      
      
}

    
    

