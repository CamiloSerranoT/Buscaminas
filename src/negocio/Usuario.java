/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.io.Serializable;

/**
 *
 * @author Jaen,Pedro,Camilo
 */
public class Usuario implements Serializable {
   private String nickName;
   private int puntuacion=0;

    public Usuario(String p, int i) {
        this.nickName=p;
        this.puntuacion=i;
    }

    public Usuario() {
        
    }

    public Usuario(String toString) {
        
    }
    
    /**
     * @return the nickName
     */
    public String getNickName() {
        return nickName;
    }

    
    /**
     * @param nickName the nickName to set
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * @return the puntuacion
     */
    public int getPuntuacion() {
        return puntuacion;
    }

    /**
     * @param puntuacion the puntuacion to set
     */
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nickName=" + nickName + ", puntuacion=" + puntuacion + '}';
    }
}
