/*Crear la clase Articulo con las siguientes propiedades:

·        Descripción

·        Precio

·        Departamento
 */
package modelos;

import gestores.MyException;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Articulo {
    private String descripcion;
    private float precio;
    private String departamento;
    public static final String []  DEPARTAMENTOS= {"Selecciona un departamento","Perfumeria", "Mascotas","Deportes","Informatica"};

    public Articulo(String descripcion, float precio, String departamento) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.departamento = departamento;
    }

    public Articulo(String descripcion, String precio, String departamento) throws MyException{
        setDescripcion(descripcion);
        setDepartamento(departamento);
        setPrecio(precio);
    }

    public void setDescripcion(String descripcion) throws MyException {
        if (descripcion.length() == 0 || descripcion.equalsIgnoreCase("")) {
            throw new MyException("La descripcion no puede estar vacia");
        }
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) throws MyException {
        if (precio < 0) {
            throw new MyException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }
    
    public void setPrecio(String precio) throws MyException{
        float e = 0;
        
        try {
            if (precio.length() == 0 || precio.isEmpty()) {
                throw new MyException("El precio no puede estar vacio, nulo o sin ningun precio");
            }
            e = Float.parseFloat(precio);
            setPrecio(e);
        } catch (NullPointerException ex) {
            throw new MyException("El precio no puede ser nulo");
        }catch (NumberFormatException ex){
            throw new MyException("El formato del precio no es correcto, decimales ejemplo 7.89");
        }
    }
    
    
    
    public void setDepartamento(String departamento) throws MyException {
        if (getNumDepartamento() == 0) {
            throw new MyException("El departamento no es válido");
        }else{
            this.departamento = departamento;
        }
    }
    
      public void setDepartamento(int departamento) throws MyException {
        if (getNumDepartamento() == 0 || DEPARTAMENTOS.length >= 0) {
            throw new MyException("El departamento no es válido");
        }
        this.departamento = DEPARTAMENTOS[departamento];
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    public int getNumDepartamento(){
        // Nos recorremos el array de DEPARTAMENTOS y devolvemos
        // la posición que ocupa mi departamento
        int pos = 0;
        for (int i = 0; i < DEPARTAMENTOS.length; i++) {
            if (DEPARTAMENTOS[i].equalsIgnoreCase(departamento)) {
                return i;
            }
        }
        return pos;  
}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.descripcion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Articulo other = (Articulo) obj;
        return Objects.equals(this.descripcion, other.descripcion);
    }

    @Override
    public String toString() {
        return descripcion+", Dep.: "+departamento;
    }

    
}
