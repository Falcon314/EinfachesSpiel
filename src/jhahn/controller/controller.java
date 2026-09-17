package jhahn.controller;

import jhahn.model.GewinnModel;
import jhahn.view.GrafikFrame;
import jhahn.view.GrafikPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller implements ActionListener {
    private GrafikFrame view;
    private GewinnModel model;
    public controller() {
        this.view = new GrafikFrame(this);
        this.model = new GewinnModel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GrafikPanel panel = view.getPanel();
        if (e.getSource() == panel.getEingabe()) {
            int eingabe;
            try {
                eingabe = Integer.parseInt(panel.getEingabe().getText().trim());
            } catch (NumberFormatException ex) {
                return;
            }
            panel.getEingabe().setEditable(false);
            panel.getNochMalBtn().setEnabled(true);
            model.berechneRunde(eingabe);
            JLabel rundenErgebnis = panel.getRundenErgebnis();
            if (model.hatGewonnen()) rundenErgebnis.setText("Gewonnen");
            else if (model.hatVerloren()) rundenErgebnis.setText("Verloren");
            else rundenErgebnis.setText(Integer.toString(model.getRundenErgebnis()));
            panel.getComputerPunkte().setText(Integer.toString(model.getComputerZahl()));
            panel.getGesamtPunkte().setText(Integer.toString(model.getGesamtPunkte()));
        } else if (e.getSource() == panel.getNochMalBtn()) {
            panel.getEingabe().setEditable(true);
            panel.getNochMalBtn().setEnabled(false);
            panel.getComputerPunkte().setText("");
            panel.getRundenErgebnis().setText("");
            panel.getEingabe().setText("");
        }
    }

    public static void main(String[] args) {new controller();}
}
