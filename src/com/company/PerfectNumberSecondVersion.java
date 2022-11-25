package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PerfectNumberSecondVersion extends Frame implements ActionListener {
    TextField argument;
    Label wynik;
    Button zamiana;

    public PerfectNumberSecondVersion() {
        super("Liczba doskonala");
        setSize(800, 400);
        setLayout(new FlowLayout());
        setBackground(Color.lightGray);
        argument = new TextField(4);
        add(new Label("Liczba: "));
        add(argument);
        zamiana = new Button("Sprawdź");
        zamiana.addActionListener(this);
        add(zamiana);
        wynik = new Label("Czy ta liczba jest doskonala?");
        add(wynik);

        MenuBar menuBar = new MenuBar();
        setMenuBar(menuBar);
        Menu menu = new Menu("Plik");
        MenuItem mi = new MenuItem("Zamknij", new MenuShortcut('1'));
        menu.add(mi);
        menu.addActionListener(this);
        menuBar.add(menu);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String label = e.getActionCommand();
        if (label.equals("Sprawdź")) {
            try {
                int num = Integer.parseInt(argument.getText());
                System.out.println(num);
                boolean isPerfect = new PerfectNumber().divideMe(num);
                wynik.setText("Ta liczba"  + (isPerfect ? " jest" : " nie jest") + " doskonala");
            } catch (NumberFormatException ev) {
                System.out.println("Blad argumentow!? Wpisz poprawne wartosci!");
            }
        } else if (label.equals("Zamknij")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Zamiana();
    }
}
