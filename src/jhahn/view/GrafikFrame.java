package jhahn.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class GrafikFrame extends JFrame {
    private final GrafikPanel panel;
    public GrafikFrame(ActionListener controller) {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(400, 400);
        panel = new GrafikPanel();
        this.add(panel);
    }
    public GrafikPanel getPanel() {
        return panel;
    }
}
