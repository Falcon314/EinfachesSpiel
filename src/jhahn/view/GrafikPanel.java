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
        southPanel.add(nochMalBtn);

        this.add(northPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(southPanel, BorderLayout.SOUTH);
    }
    public JButton getNochMalBtn() {return nochMalBtn;}
    public JLabel getRundenErgebnis() {return rundenErgebnis;}
    public JLabel getGesamtPunkte() {return gesamtPunkte;}
    public JTextField getEingabe() {return eingabe;}
    public JTextField getComputerPunkte() {return computerPunkte;}
}
