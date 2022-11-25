package com.company;

import javax.swing.*;

public class Wizytowka {
    public static void main(String[] args) {
        String nazwisko = JOptionPane.showInputDialog(null, "Podaj nazwisko: ");
        String imie = JOptionPane.showInputDialog(null, "Podaj imie: ");
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);

        String text;
        text = "Imie: " + imie + "\n";
        text += "Nazwisko: " + nazwisko;
        JOptionPane.showMessageDialog(null, text);
        System.exit(0);
    }
}
