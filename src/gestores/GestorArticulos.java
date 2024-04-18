/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestores;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import modelos.Articulo;

/**
 *
 * @author Alumno
 */
public class GestorArticulos {

    private static LinkedList<Articulo> articulos = new LinkedList<>();
    public static ListIterator<Articulo> it;
    private static Articulo actual;

    public static int sizeArticulos() {
        return articulos.size();
    }

    public static boolean addArticulo(Articulo a) {
        if (it == null || articulos.isEmpty()) {
            it = articulos.listIterator();
        }
        if (articulos.contains(a)) {
            return false;
        } else {
            it.add(a);
            return true;
        }
    }

    public static Articulo removeArticulo() {
        Articulo siguiente=null;
        
        
        if (articulos.size()>1) {
            siguiente = nextArticulo();
        }
        if (articulos.size()==1) {
            articulos=null;
        }else{
            it.remove();
        }
        
        

        return siguiente;

    }

    

    public static Articulo primerArticulo() throws MyException {
        if (articulos.size() > 1) {
            it = articulos.listIterator();
            actual = it.next();
            return actual;
        } else if (articulos.size() == 1) {
            return articulos.get(0);
        }
        throw new MyException("Lista vacía");
    }

    public static Articulo previusArticulo() {  
        if (it != null && articulos.size() > 1) {
            if (it.hasPrevious()) {
                Articulo a = it.previous();
                if (a.equals(actual)) {
                    return previusArticulo();
                } else {
                    actual = a;
                    return a;
                }
            } else {
                it = articulos.listIterator(articulos.size());
                return previusArticulo();
            }
        }
        return null;

    }

    public static Articulo nextArticulo() {
        if (it != null && articulos.size() > 1) {
            if (it.hasNext()) {
                Articulo a = it.next();
                if (a.equals(actual)) {
                    return nextArticulo();
                } else {
                    actual = a;
                    return a;
                }
            } else {
                it = articulos.listIterator();
                return nextArticulo();
            }
        }
        return null;
    }
    
    public static String listadoArticulos(){
        String res = "";
        
        for (Articulo a : articulos) {
            res += a.toString();
            if (actual.equals(a)) {
                res += "🔹";
            }
            res+="\n";
        }
        res+=  "Tamaño: "+articulos.size();
        return res;
    }

}
