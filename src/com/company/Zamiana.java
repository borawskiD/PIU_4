package com.company;
import java.awt.*;
import java.awt.event.*;
public class Zamiana extends Frame implements ActionListener {
    TextField argument;
    Label wynik;
    Button zamiana;

    public Zamiana(){
        super("Zamiana temperatur ver. 1.0");
        setSize(400, 100);
        setLayout(new FlowLayout());
        setBackground(Color.lightGray);
        argument = new TextField(2);
        add(argument);
        add(new Label("st. Celsjusza to"));
        zamiana = new Button("Zamiana");
        zamiana.addActionListener(this);
        add(zamiana);
        wynik = new Label("    st. Fahrenheita");
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
    public void actionPerformed(ActionEvent e){
        String label = e.getActionCommand();
        if(label.equals("Zamiana")){
            try{
                int tempFahr = (int)((Double.parseDouble(argument.getText())) * 1.8 + 32);
                wynik.setText(tempFahr + " st. Fahrenheita");
            }catch (NumberFormatException ev){
                System.out.println("Blad argumentow!? Wpisz poprawne wartosci!");
            }
        }
        else if(label.equals("Zamknij")){
            System.exit(0);
        }
    }
    public static void main(String[] args){
        new Zamiana();
    }
}
