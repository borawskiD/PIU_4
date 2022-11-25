package com.company;

import javax.swing.*;

public class PerfectNumberFirstVersion {
    public PerfectNumberFirstVersion(){
        String number = JOptionPane.showInputDialog(null, "Podaj liczbe: ");
        int num = Integer.parseInt(number);
        String text;
        PerfectNumber perfectNumber = new PerfectNumber();
        boolean isPerfect = perfectNumber.divideMe(num);
        text = "Ta liczba"  + (isPerfect ? " jest" : " nie jest") + " doskonala";
        JOptionPane.showMessageDialog(null, text);
        System.exit(0);
    }
}
