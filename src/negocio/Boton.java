/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import javax.swing.JButton;
import java.awt.*;
import java.io.Serializable;
/**
 *
 * @author Jaen,Pedro,Camilo
 */
public class Boton extends JButton implements Serializable {
    
   
    private int estado;
    private boolean mina;
    private int numBoton;
   
    

    public Boton(int numBoton) {
       
        this.estado = 0;
        this.mina = false;
        this.numBoton = numBoton;
    }
    
    
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public boolean getMina() {
        return mina;
    }

    public void setMina(boolean mina) {
        this.mina = mina;
    }

    public int getNumBoton() {
        return numBoton;
    }

    public void setNumBoton(int numBoton) {
        this.numBoton = numBoton;
    }

    
    
}

