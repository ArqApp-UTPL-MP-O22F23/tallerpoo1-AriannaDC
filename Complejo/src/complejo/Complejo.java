/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package complejo;

/**
 *
 * @author Arianna Vinueza
 */
public class Complejo implements InterfaceComplejo {

    private float partereal;
    private float parteimaginaria;
    
    public Complejo() {
    }

    public Complejo(float real, float imaginaria) {
        this.partereal = real;
        this.parteimaginaria = imaginaria;
    }
    
    public float getPartereal() {
        return partereal;
    }

    public void setPartereal(float partereal) {
        this.partereal = partereal;
    }

    public float getParteimaginaria() {
        return parteimaginaria;
    }

    public void setParteimaginaria(float parteimaginaria) {
        this.parteimaginaria = parteimaginaria;
    }
    

    @Override
    public Complejo Suma(Complejo suma) {
        Complejo complejo = new Complejo();
        
        float nuevoReal = this.partereal + suma.getPartereal();
        float nuevoImaginaria = this.parteimaginaria + suma.getParteimaginaria();
        
        complejo.setPartereal(nuevoReal);
        complejo.setParteimaginaria(nuevoImaginaria);
        
        return complejo;
    }

    @Override
    public Complejo Resta(Complejo resta) {
        Complejo complejo = new Complejo();
        
        float nuevoReal = this.partereal - resta.getPartereal();
        float nuevoImaginaria = this.parteimaginaria - resta.getParteimaginaria();
        
        complejo.setPartereal(nuevoReal);
        complejo.setParteimaginaria(nuevoImaginaria);
        
        return complejo;
    }

    @Override
    public String toFloatString() {
        return String.format("(%.2f, %.2fi)", partereal, parteimaginaria);
    }
}
