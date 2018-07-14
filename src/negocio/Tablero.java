/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jaen,Pedro,Camilo
 */
public class Tablero implements Serializable {

    private JPanel p;
    private int numMinas;
    private int tamaño;
    private Boton[][] botones;

    public JPanel getP() {
        return p;
    }

    public void setP(JPanel p) {
        this.p = p;
    }

    public Tablero() {
        p = new JPanel();
    }

    public Boton[][] getBotones() {
        return botones;
    }

    public void setBotones(Boton[][] botones) {
        this.botones = botones;
    }

    public int getNumMinas() {
        return numMinas;
    }

    public void setNumMinas(int numMinas) {
        this.numMinas = numMinas;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void calNumMinas(int t, JPanel p) {
        switch (t) {
            case 0:
                numMinas = 1;
                break;
            case 1:
                numMinas = 1;
                break;
            case 2:
                numMinas = 3;
                break;
            case 3:
                numMinas = 7;
                break;
            case 4:
                numMinas = 9;
                break;
            case 5:
                numMinas = 13;
                break;
            case 6:
                numMinas = 15;
                break;
            case 7:
                numMinas = 18;
                break;
            case 8:
                numMinas = 22;
                break;
        }
    }

    public boolean generarMinas() {

        Random generar = new Random();
        return generar.nextBoolean();
    }

    public void generarTablero(int t, JFrame f) {
        int c = 0;
        int a = 0;
        int d = 0;
        this.tamaño = t;
        botones = new Boton[this.tamaño][this.tamaño];

        p.setBackground(Color.BLACK);
        while (a < numMinas) {
            for (int i = 0; i < this.tamaño; i++) {
                for (int j = 0; j < this.tamaño; j++) {
                    botones[i][j] = new Boton(c);
                    botones[i][j].setBounds((400 / this.tamaño) * i, (400 / this.tamaño) * j, 400 / this.tamaño, 400 / this.tamaño);
                    botones[i][j].setBackground(new java.awt.Color(102, 255, 153));
                    botones[i][j].setEnabled(true);
                    botones[i][j].setMina(false);
                    botones[i][j].addActionListener((ActionListener) f);
                    botones[i][j].setNumBoton(d);
                    c = c++;
                    p.add(botones[i][j]);
                    if (a < numMinas) {
                        if (botones[i][j].getMina() == false) {
                            botones[i][j].setMina(generarMinas());
                            if (botones[i][j].getMina() == true) {

                                a++;
                            }
                        }
                    }
                    d++;
                }
            }
        }
        p.setVisible(true);
        p.setLayout(null);
        p.setBounds(15, 120, 400, 400);

        f.add(p);
    }

    @Override
    public String toString() {
        return "Tablero{" + "numMinas=" + numMinas + ", tama\u00f1o=" + tamaño + '}';
    }

}
