package ejercicios;

import java.util.Scanner; //importamos la clase Scanner del paquete java.util

public class Ejercicios {
    
    /*
    public static void main(String[] args) {
        float a = 10;
        float b = 20;
        float c = 5;
        float d = 3;
        float e = 8, f = 2;
        float resultado;
        resultado = (a + b/c)/(d + e/f);
        System.out.println("Solución: " + resultado);
    }
    
    public static void main(String[] args) {
        float notaPrac = 6, notaTeo = 8, notaPar = 7, notaFin;
        notaPrac *= 0.3; //es lo mismo que notaPrac = notaPrac * 3/10;
        notaTeo *= 0.6;
        notaPar *= 0.1;
        notaFin = notaPrac + notaTeo + notaPar;
        System.out.println("Calificación final:" + notaFin);
    }
    
    public static void main(String[] args) {
//        float x = 64, y = 2;
//        double result;
        double x = 64, y = 2, result;

        result = Math.sqrt(x)/(Math.pow(y,2) - 1);
        System.out.println("Resultado: " + result);
    }

    public static void main(String[] args) {
        for(int i=1; i<=10;i++)
           System.out.println(i);

        for(int i=10; i>=0;i--)
            System.out.print(i + " \n\n");
    }

    public static void main (String args[]) {
        int i;
        double suma=0;
        
        for(i=0;i<=20;i++)        
            suma=suma+i;
        
        System.out.println("La suma es: "+suma);
    }

//La clase Scanner es la clase más sencilla para poder leer datos de un
//programa de Java. Scanner, por tanto, se encarga de proporcionarnos un
//conjunto de métodos para leer valores de entrada de distintas fuentes.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //creación del objeto Scanner
        double radio;
        System.out.print("Introduzca el radio de la circunferencia: ");
        radio = entrada.nextDouble(); //lee un valor double introducido
        System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);
    }
    */
public static void main(String[] args) {
    float[] num = new float[4];
    //declaración de un array de tipo float de 4 elementos
    Scanner entrada = new Scanner(System.in);

//Bucle for para ir solicitando e introduciendo valores en el array
    for (int i=0 ; i<num.length ; i++){
        System.out.print("Introduzca el elemento "+ i +" del array: ");
        num[i] = entrada.nextFloat() * 2;
        System.out.println("");
    }
    
    System.out.print("El array doble del introducido es: ");
    //Bucle for para ir mostrando por pantalla los valores del array
    
    for (int i=0 ; i<num.length ; i++){
        System.out.print(num[i] + " ");
    }
    
    System.out.println("");
    }    
}


