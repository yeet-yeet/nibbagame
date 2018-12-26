package engine.graphics;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame(int w, int h) {
        super();
        this.setSize(w, h);
        this.getContentPane().setLayout(null);
        this.setLayout(null);
        this.setVisible(true);
    }
}
