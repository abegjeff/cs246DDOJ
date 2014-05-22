import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBox extends JFrame {
    JCheckBox showOne;
    JCheckBox showTwo;
    
    JLabel labelOne;
    JLabel labelTwo;
    
    public CheckBox() {
        setLayout(new GridLayout(2,2));
        
        labelOne = new JLabel("");
        add(labelOne);
        
        labelTwo = new JLabel("");
        add(labelTwo);
        
        showOne = new JCheckBox("Show the first label");
        add(showOne);
        
        showTwo = new JCheckBox("Show the second label");
        add(showTwo);
        
        Event e = new Event();
        showOne.addItemListener(e);
        showTwo.addItemListener(e);
    }
    
    public class Event implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            if(showOne.isSelected()) {
                labelOne.setText("You pushed the first check box!");
            } else {
                labelOne.setText("");
            }
            
            if(showTwo.isSelected()) {
                labelTwo.setText("You pushed the second check box!");
            } else {
                labelTwo.setText("");
            }
        }
    }
        public static void main(String[] args) {
            CheckBox gui = new CheckBox();
            gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui.setSize(450, 125);
            gui.setVisible(true);
            gui.setTitle("Checkbox program");
        }
    }
