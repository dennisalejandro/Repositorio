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
public class Boleto {
    int Codigo;
    int Persona;

    public Boleto(int Codigo, int Persona) {
        this.Codigo = Codigo;
        this.Persona = Persona;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getPersona() {
        return Persona;
    }

    public void setPersona(int Persona) {
        this.Persona = Persona;
    }
    
}
