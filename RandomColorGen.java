import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RandomColorGen extends JFrame {
    
    JPanel panel;
    
    public RandomColorGen() {
        panel = new JPanel();
        panel.setBackground(randomColor());
        add(panel);
        
        Event e = new Event();
        panel.addMouseListener(e);
      
    }
    
    public Color randomColor() {
        int red = (int)(Math.random() * 256);
        int green = (int)(Math.random() * 256);
        int blue = (int)(Math.random() * 256);
        return (new Color(red, green, blue));
    }
    
    public class Event implements MouseListener {
        
        public void mouseClicked(MouseEvent e) {
            panel.setBackground(randomColor());
        }
        
        public void mousePressed(MouseEvent e) {
        }
        
        public void mouseReleased(MouseEvent e) {
        }
        
        public void mouseEntered(MouseEvent e) {
        }
        
        public void mouseExited(MouseEvent e) {
        }
    }
    
    public static void main(String [] args) {
        RandomColorGen gui = new RandomColorGen();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(300, 300);
        gui.setTitle("Random color generator");
        
    }    
}
