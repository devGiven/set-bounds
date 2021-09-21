package setbounds;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.event.*;

public class Frame extends MouseInputAdapter {
private JFrame frame = new JFrame();
private JLabel label = new JLabel();

static int SCREEN_WIDTH, SCREEN_HEIGHT;
public Frame() {
SCREEN_WIDTH = Integer.parseInt(JOptionPane.showInputDialog(null,"","SCREEN_WIDTH",JOptionPane.PLAIN_MESSAGE));
SCREEN_HEIGHT = Integer.parseInt(JOptionPane.showInputDialog(null,"","SCREEN_HEIGHT",JOptionPane.PLAIN_MESSAGE));
    
    
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
frame.setTitle("setBounds");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.setAlwaysOnTop(true);
frame.setLocationRelativeTo(null);


frame.add(label);


label.addMouseListener(this);
label.addMouseMotionListener(this);
}
// responds to mouse movement events
public void mouseMoved(MouseEvent event) {
label.setText("[ " + event.getX() + " : " + event.getY() + " ]");
}
} 
