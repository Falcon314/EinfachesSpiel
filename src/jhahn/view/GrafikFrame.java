package jhahn.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class GrafikFrame extends JFrame {
    private final GrafikPanel panel;
    public GrafikFrame(ActionListener controller) {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new GrafikPanel();
        this.add(panel);
        panel.getNochMalBtn().addActionListener(controller);
        panel.getEingabe().addActionListener(controller);
        this.setVisible(true);
        this.setSize(400, 400);
    }
    public GrafikPanel getPanel() {
        return panel;
    }
}
