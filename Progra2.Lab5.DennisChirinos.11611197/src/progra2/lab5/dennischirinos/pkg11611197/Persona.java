/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.lab5.dennischirinos.pkg11611197;

/**
 *
 * @author denni
 */
public class Persona {
    private String Nombre;
    private int Edad;
    private int ID;
    private int IdBoleto;
    private String Departamento;
    private double Dinero;
    private String Trabajo;
    private String Secundario;

    public Persona(String Nombre, int Edad, int ID, int IdBoleto, String Departamento, double Dinero, String Trabajo, String Secundario) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.ID = ID;
        this.IdBoleto = IdBoleto;
        this.Departamento = Departamento;
        this.Dinero = Dinero;
        this.Trabajo = Trabajo;
        this.Secundario = Secundario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIdBoleto() {
        return IdBoleto;
    }

    public void setIdBoleto(int IdBoleto) {
        this.IdBoleto = IdBoleto;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public double getDinero() {
        return Dinero;
    }

    public void setDinero(double Dinero) {
        this.Dinero = Dinero;
    }

    public String getTrabajo() {
        return Trabajo;
    }

    public void setTrabajo(String Trabajo) {
        this.Trabajo = Trabajo;
    }

    public String getSecundario() {
        return Secundario;
    }

    public void setSecundario(String Secundario) {
        this.Secundario = Secundario;
    }
    
}
