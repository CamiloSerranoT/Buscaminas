/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.InicioJuego;

/**
 *
 * @author CAMILO
 */
public class Juego implements Serializable {

    private int numPartidas;
    private int resultados;
    private Tablero tablero;

    public Juego() {
        tablero = new Tablero();
    }

    public void setNumPartidas(int numPartidas) {
        this.numPartidas = numPartidas;
    }

    public int getNumPartidas() {
        return numPartidas;
    }

    public int getResultados() {
        return resultados;
    }

    public void setResultados(int resultados) {
        this.resultados = resultados;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public void mostrarJuego(JFrame r, int tamaño, JFrame f) {
        r.dispose();
        f.setVisible(true);

        tablero.generarTablero(tamaño, f);

    }

    public void verificarJugada(ActionEvent e, JFrame f, int a) {

        Boton obj = (Boton) e.getSource();
        if (obj.getMina()) {
            obj.setEnabled(false);
            obj.setFont(new java.awt.Font("Verdana", 0, 90 / tablero.getTamaño()));
            obj.setForeground(Color.ORANGE);
            obj.setText("BUM");
            JOptionPane.showMessageDialog(null, "juego terminado el ganador es :el jugador 1");
            System.out.println(numPartidas);

            if (numPartidas > 0) {
                int v = JOptionPane.showConfirmDialog(null, "desea volver a jugar");
                if (v == JOptionPane.YES_OPTION) {
                    numPartidas--;
                    tablero.getP().removeAll();
                    mostrarJuego(f, tablero.getTamaño(), f);
                } else {
                    JOptionPane.showMessageDialog(obj, "se acabo el juego");
                    InicioJuego i = new InicioJuego();
                    i.setVisible(true);
                    f.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(obj, "se acabo el juego");
                InicioJuego i = new InicioJuego();
                i.setVisible(true);
                f.dispose();
            }
        } else if (a == 1) {
            obj.setEnabled(false);
            obj.setFont(new java.awt.Font("Verdana", 0, 90 / tablero.getTamaño()));
            obj.setForeground(Color.red);
            obj.setText(verificarPista(e));
            obj.setEstado(1);

        } else {
            obj.setEnabled(false);
            obj.setFont(new java.awt.Font("Verdana", 0, 90 / tablero.getTamaño()));
            obj.setForeground(Color.blue);
            obj.setText(verificarPista(e));
            obj.setEstado(0);

        }
    }

    public String verificarPista(ActionEvent e) {
        int a = 0;
        Boton obj = (Boton) e.getSource();

        for (int i = 0; i < tablero.getTamaño(); i++) {
            for (int j = 0; j < tablero.getTamaño(); j++) {
                if ((tablero.getBotones()[i][0].getNumBoton() == obj.getNumBoton())) {

                    if (tablero.getBotones()[i][j].getNumBoton() == (obj.getNumBoton() + 1)
                            || tablero.getBotones()[i][j].getNumBoton() == (obj.getNumBoton() - tablero.getTamaño())
                            || tablero.getBotones()[i][j].getNumBoton() == (obj.getNumBoton() + tablero.getTamaño() + 1)
                            || tablero.getBotones()[i][j].getNumBoton() == (obj.getNumBoton() + tablero.getTamaño())
                            || tablero.getBotones()[i][j].getNumBoton() == (obj.getNumBoton() - tablero.getTamaño())) {
                        if (tablero.getBotones()[i][j].getMina() == true) {
                            a++;
                        }
                    }
                } else if ((tablero.getBotones()[i][tablero.getTamaño() - 1].getNumBoton() == obj.getNumBoton())
                        && (tablero.getBotones()[i][j].getNumBoton() == (obj.getNumBoton() - 1)
                        || tablero.getBotones()[i][j].getNumBoton() == (obj.getNumBoton() - tablero.getTamaño() - 1)
                        || tablero.getBotones()[i][j].getNumBoton() == (obj.getNumBoton() + tablero.getTamaño())
                        || tablero.getBotones()[i][j].getNumBoton() == (obj.getNumBoton() + tablero.getTamaño() - 1)
                        || tablero.getBotones()[i][j].getNumBoton() == (obj.getNumBoton() - tablero.getTamaño() - 1))) {
                    if (tablero.getBotones()[i][j].getMina() == true) {
                        a++;
                    }
                } else if (tablero.getBotones()[i][j].getNumBoton() == obj.getNumBoton() - 1
                        || tablero.getBotones()[i][j].getNumBoton() == obj.getNumBoton() + 1
                        || tablero.getBotones()[i][j].getNumBoton() == obj.getNumBoton() + tablero.getTamaño()
                        || tablero.getBotones()[i][j].getNumBoton() == obj.getNumBoton() - tablero.getTamaño()
                        || tablero.getBotones()[i][j].getNumBoton() == obj.getNumBoton() + tablero.getTamaño() + 1
                        || tablero.getBotones()[i][j].getNumBoton() == obj.getNumBoton() + tablero.getTamaño() - 1
                        || tablero.getBotones()[i][j].getNumBoton() == obj.getNumBoton() - tablero.getTamaño() + 1
                        || tablero.getBotones()[i][j].getNumBoton() == obj.getNumBoton() - tablero.getTamaño() - 1) {
                    if (tablero.getBotones()[i][j].getMina() == true) {
                        a++;
                    }
                }
                if (tablero.getBotones()[i][j].getNumBoton() == obj.getNumBoton() - 1
                        || tablero.getBotones()[i][j].getNumBoton() == obj.getNumBoton() + 1
                        || tablero.getBotones()[i][j].getNumBoton() == obj.getNumBoton() + tablero.getTamaño()
                        || tablero.getBotones()[i][j].getNumBoton() == obj.getNumBoton() - tablero.getTamaño()
                        || tablero.getBotones()[i][j].getNumBoton() == obj.getNumBoton() + tablero.getTamaño() + 1
                        || tablero.getBotones()[i][j].getNumBoton() == obj.getNumBoton() + tablero.getTamaño() - 1
                        || tablero.getBotones()[i][j].getNumBoton() == obj.getNumBoton() - tablero.getTamaño() + 1
                        || tablero.getBotones()[i][j].getNumBoton() == obj.getNumBoton() - tablero.getTamaño() - 1) {
                    if (tablero.getBotones()[i][j].getMina() == true) {
                        a++;
                    }
                }

            }
        }
        return String.valueOf(a / 2);
    }

    public int elegirPrimerMovimiento() {
        Random r = new Random();
        int a = r.nextInt(2);
        return a;

    }
}
