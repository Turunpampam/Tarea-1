package Modelo;

import java.util.ArrayList;

public class Persona {
    String nombre;
    String id;
    String fechaNacimiento;
    String edad;
    String direccionCasa;
    ArrayList<Integer> cuentas = new ArrayList<Integer>();


    public Persona(String nombre, String id, String fechaNacimiento, String edad, String direccionCasa, ArrayList<Integer> cuentas) {
        this.nombre = nombre;
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.direccionCasa = direccionCasa;
        this.cuentas = cuentas;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDireccionCasa() {
        return direccionCasa;
    }

    public void setDireccionCasa(String direccionCasa) {
        this.direccionCasa = direccionCasa;
    }

    public ArrayList<Integer> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Integer> cuentas) {
        this.cuentas = cuentas;
    }
}
