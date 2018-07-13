/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Serializar {

    public void serializar(String nombreArchivo, Object objeto) {

        ObjectOutputStream escribiendoFichero = null;
        try {
            escribiendoFichero = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            escribiendoFichero.writeObject(objeto);
            escribiendoFichero.close();
        } catch (IOException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                escribiendoFichero.close();
            } catch (IOException ex) {
                Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Object desSerializar(String nombreArchivo) {
        Object obj;
        ObjectInputStream leyendoFichero = null;
        try {
            leyendoFichero = new ObjectInputStream(new FileInputStream(nombreArchivo));

            obj = leyendoFichero.readObject();
            leyendoFichero.close();
            return obj;
        } catch (IOException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                leyendoFichero.close();
            } catch (IOException ex) {
                Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
   
}
