package ejer5.utils;
   
import java.awt.HeadlessException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author AluDAM
 */
public class UtilidadesGrafica {
    
    public static String menuConCabecera(String cabecera, String[] opciones){
        String respuesta;
        String mensaje="";
        boolean haRespondido= false;
        do {
            mensaje="";
            for (int i = 0; i < opciones.length; i++) {
                mensaje+=(i+1)+". "+opciones[i]+". \n";
            }
            respuesta = pideEnteroPositivo(cabecera+"\n"+mensaje)+"";
            for (int i = 0; i < opciones.length; i++) {
                if (respuesta.equals((i+1)+"")) {
                    haRespondido = true;
                }
            }
        } while (!haRespondido);
        return respuesta;
    }
    
    public static String menu(String[] opciones){
        String respuesta;
        int[] numOps = new int[opciones.length];
        boolean haRespondido = false;
        do {
            String mensaje="";
            for (int i = 0; i < opciones.length; i++) {
                mensaje+=(i+1)+". "+opciones[i]+". \n";
                numOps[i]=i;
            }
            respuesta = pideEnteroPositivo(mensaje)+"";
            for (int i = 0; i < opciones.length; i++) {
                if (respuesta.equals((i+1)+"")) {
                    haRespondido = true;
                }
            }
        } while (!haRespondido);
        return respuesta;
    }
    
    /**
     * Pide un entero, mediante JOptionPane. 
     * Caza el error Headless exception, y NumberFormat. 
     * 
     * @param mensaje
     * @return 
     */
    public static int pideEntero(String mensaje){
        int entero=0;
        String graf;
        boolean esCorrecto=false;
        do {
            try{
                graf = JOptionPane.showInputDialog(
            null, mensaje, 
                "pideEntero", 
                JOptionPane.QUESTION_MESSAGE);
                entero = Integer.parseInt(graf);
                esCorrecto=true;
            }catch(HeadlessException e){
                System.out.println("No se soporta teclado. ");
            }catch(NumberFormatException e){
                System.out.println("Error en el formato del numero. ");
            }
        } while (!esCorrecto);
        return entero;
    }
    
    
    /**
     * Pide un entero lanzando la excepción en caso de error. 
     * 
     * @param mensaje
     * @return 
     */
    public static int pideEnteroII(String mensaje){
        int entero=0;
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        
        String graf = JOptionPane.showInputDialog(
            null, mensaje, 
                "pideEntero", 
                JOptionPane.QUESTION_MESSAGE);
        entero = Integer.parseInt(graf);
        
        return entero;
    }
    
    public static int pideEnteroIII(String mensaje){
        int entero=0;
        int contador=0;
        boolean esCorrecto=false;
        do {
            System.out.println(mensaje);
            try{
                String graf = JOptionPane.showInputDialog(
            null, mensaje, 
                "pideEntero", 
                JOptionPane.QUESTION_MESSAGE);
                entero = Integer.parseInt(graf);
                esCorrecto=true;
            }catch(HeadlessException e){
                System.out.println("No se soporta teclado. ");
                contador++;
            }catch(NumberFormatException e){
                System.out.println("Error en el formato del numero. ");
                contador++;
            }catch(InputMismatchException e){
                System.out.println("Input incorrecto. ");
                contador++;
            }
        } while (!esCorrecto && contador<3);
        return entero;
    }
    
    public static String ponerCeros(int numero, int cifras){
        String resultado = numero+"";
        int lon = resultado.length();
        if (lon==cifras) {
            return resultado;
        }
        for (int i = 0; i < cifras; i++) {
            if (lon<cifras) {
                resultado = "0"+resultado;
            }
        }
        return resultado;
    }
    
    /**
     * Devuelve un array de ints de la longitud de @lonArray, 
     * y con un número máximo de @hasta, empezando en @desde. 
     * 
     * @param lonArray
     * @param desde
     * @param hasta
     * @return 
     */    
    public static int[] numerosSinRepetir(int lonArray, int desde, int hasta){
        int[] aa = new int[lonArray];
        int[] dichos = new int[lonArray];
        int nuevoNumero;
        hasta =- desde;
        for (int i = 0; i < lonArray; i++) {
            do {
                nuevoNumero = (int)(Math.random()*hasta)+desde;
            } while (arrayIntContiene(dichos, nuevoNumero));
            dichos[i]=nuevoNumero;
            aa[i]=nuevoNumero;
        }
        return aa;
    }
    
    /**
     * Devuelve un array de ints de la longitud de @lonArray, 
     * y con un número máximo de @hasta, empezando en @desde. 
     * 
     * @param lonArray
     * @param desde
     * @param hasta
     * @return 
     */    
    public static String[] numerosSinRepetirConGuiones(int lonArray, int desde, int hasta){
        String[] aa = new String[lonArray];
        String[] dichos = new String[lonArray];
        String nuevoNumero;
        int probabilidadGuion;
        hasta =- desde;
        for (int i = 0; i < lonArray; i++) {
            probabilidadGuion = (int) (Math.random() * 3);
            do {
                if (probabilidadGuion<=1) {
                    nuevoNumero="-";
                }else{
                    nuevoNumero = (int) ((Math.random()*hasta)+desde)+"";
                }
            } while (arrayStringContieneNumero(dichos, nuevoNumero));
            dichos[i]=nuevoNumero;
            aa[i]=nuevoNumero;
        }
        return aa;
    }
    
    public static boolean arrayIntContiene(int[] array, int contenido){
        for (int i = 0; i < array.length; i++) {
            return array[i]==contenido;
        }
        return false;
    }
    public static boolean arrayStringContieneNumero(String[] array, String contenido){
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=null && esNumero(contenido)) {
                return array[i].equals(contenido);
            }
        }
        return false;
    }
    
    public static String muestraCabecera(){
        return String.format("%-35s %-25s %5s %5s %5s \n\n", 
                "TITULO", "AUTOR", "PRESTAMOS", "PRESTADO", 
                "PRESTABLE");
    }
    
    public static int tresOpciones(String mensaje){
        int graf = JOptionPane.showConfirmDialog(null, mensaje);
        return graf;
    }
    public static int cuatroOpciones(String mensaje, String[] options){
        int graf = JOptionPane.showOptionDialog(null, mensaje, "Option Dialog", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        return graf;
    }
    
    
    
    public static int pideEnteroPositivo(String cadena){
        String numero="";
        int respuesta = -1;
        try{
            numero = pideCadena(cadena);
            respuesta = Integer.parseInt(numero);
        }catch(NumberFormatException e){System.out.println("Error");}
        
        return respuesta;
    }
    
    public static float pideFloat(String mensaje){
        String graf = JOptionPane.showInputDialog(
            null, mensaje, 
                "pideFloat", 
                JOptionPane.INFORMATION_MESSAGE);
        return Float.parseFloat(graf);
        
    }
    public static double pideDouble(String mensaje){
        String graf = pideCadena(mensaje);
        if (graf.length()>0 && esNumero(graf)) {
            return Double.parseDouble(graf);
        } return -1;
    }
    
    public static void muestraMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, 
                mensaje, 
                "muestraMensaje", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    public static void muestraError(String mensaje){
        JOptionPane.showMessageDialog(null, 
                mensaje, 
                "muestraError", 
                JOptionPane.ERROR_MESSAGE);
    }

    public static int calcFactorial(int num){
        int n, suma = 1;
        
        n = num;
        while(n>0){
            suma *= n;
            n -=1;
        }
        return suma;
    }
    
    public static boolean esNumero(char letra){
        String numeros = "0123456789";       
        return numeros.contains(letra+"");
    }
    
    public static boolean esNumero(String numero){
        int lon = numero.length();
        for (int i = 0; i < lon; i++) {
            if(!esNumero(numero.charAt(i))){
                return false;
            }
        } return true;
    }
    
    public static String pideCadena(String cadena){
        String graf = JOptionPane.showInputDialog(
            null, cadena, 
                "pideCadena", 
                JOptionPane.QUESTION_MESSAGE);
        return graf;
    }
    
}





























