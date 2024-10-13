/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author deboravieira
 */
public class Utente extends Pessoa {

    private double NISS;

    public static ArrayList<Utente> listaUtentes = new ArrayList<Utente>();

    public double getNiss() {
        return NISS;

    }

    public void setNISS(double n) {
        NISS = n;
    }

    public Utente(String n, double niss, String m) {
        Nome = n;
        NISS = niss;
        Morada = m;

    }
}
