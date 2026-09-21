package jhahn.view;

import javax.swing.*;
import java.awt.*;

public class GrafikPanel extends JPanel {
    private JButton nochMalBtn;
    private JLabel rundenErgebnis, gesamtPunkte;
    private JTextField eingabe, computerPunkte;

    public GrafikPanel() {
        this.setLayout(new BorderLayout());
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(3, 2, 4, 4));
        northPanel.add(new JLabel("Rundenergebnis:", JLabel.CENTER));
        northPanel.add(new JLabel("Gesamtpunkte:", JLabel.CENTER));
        rundenErgebnis = new JLabel("Tippe eine Zahl von 1 - 9", JLabel.CENTER);
        rundenErgebnis.setOpaque(true);
        rundenErgebnis.setBackground(new Color(255, 255, 255));
        gesamtPunkte = new JLabel("Gesamtpunkte: 30", JLabel.CENTER);
        gesamtPunkte.setOpaque(true);
        gesamtPunkte.setBackground(new Color(255, 255, 255));
        northPanel.add(rundenErgebnis);
        northPanel.add(gesamtPunkte);
        northPanel.add(new JLabel("Deine Zahl:", JLabel.CENTER));
        northPanel.add(new JLabel("Computer:", JLabel.CENTER));

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(1, 2, 4, 4));
        eingabe = new JTextField();
        eingabe.setHorizontalAlignment(JTextField.CENTER);
        centerPanel.add(eingabe);
        computerPunkte = new JTextField();
        computerPunkte.setHorizontalAlignment(JTextField.CENTER);
        computerPunkte.setEditable(false);
        centerPanel.add(computerPunkte);

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout());
        nochMalBtn = new JButton("Noch einmal");
        nochMalBtn.setEnabled(false);
        southPanel.add(nochMalBtn);

        this.add(northPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(southPanel, BorderLayout.SOUTH);
    }
    // ONLY FOR ACTIONLISTENER AND getSource()
    public JButton getNochMalBtn() {
        return nochMalBtn;
    }
    public JTextField getEingabe() {
        return eingabe;
    }

    // Code for controller (Btn & Eingabe)
    public void setEingabeEditable(boolean editable) {
        this.eingabe.setEditable(editable);
    }
    public void setNochMalBtnEnabled(boolean enabled) {
        this.nochMalBtn.setEnabled(enabled);
    }
    public String getEingabeValue() {
        return this.eingabe.getText().trim();
    }
    public void setEingabeValue(String eingabeValue) {
        this.eingabe.setText(eingabeValue);
    }


    // Code for controller (Labels)
    public void setRundenErgebnis(String rundenErgebnis) {
        this.rundenErgebnis.setText(rundenErgebnis);
    }
    public void setRundenErgebnis(Color color) {
        this.rundenErgebnis.setBackground(color);
    }
    public void setGesamtPunkte(String gesamtPunkte) {
        this.gesamtPunkte.setText(gesamtPunkte);
    }
    public void setGesamtPunkte(Color color) {
        this.gesamtPunkte.setBackground(color);
    }

    public void setComputerPunkte(String computerPunkte) {
        this.computerPunkte.setText(computerPunkte);
    }
}
