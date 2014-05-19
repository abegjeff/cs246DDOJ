import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
    JButton add;
    JButton subtract;
    JButton multiply;
    JButton divide;
    
    JTextField num1;
    JTextField num2;
    
    JLabel result;
    JLabel enter1;
    JLabel enter2;
    
    public Calculator() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        enter1 = new JLabel("1st: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        add(enter1, c);
        
        num1 = new JTextField(10);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        add(num1, c);
        
        enter2 = new JLabel("2nd: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        add(enter2, c);
        
        num2 = new JTextField(10);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 3;
        add(num2, c);
        
        add = new JButton("+");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        add(add, c);
        
        subtract = new JButton("-");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        add(subtract, c);
        
        multiply = new JButton("*");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 2;
        add(multiply, c);
        
        divide = new JButton("/");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 2;
        add(divide, c);
        
        result = new JLabel("");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 4;
        add(result, c);
        
        Event a = new Even();
        add.addActionListener(a);
        subtract.addActionListener(a);
        multiply.addActionListener(a);
        divide.addActionListener(a);
        
        public class Event implements ActionListener {
            public void actionPerformed (ActionEvent a) {
                double number1;
                double number2;
                
                try {
                    number1 = Double.parseDouble(num1.getText());
                } catch (NumberFormatException e) {
                    result.setText("Illegal data in field 1");
                    result.setForeground(Color.RED);
                    return;
                }
                
                try {
                    number2 = Double.parseDouble(num2.getText());
                } catch (NumberFormatException e) {
                    result.setText("Illegal data in field 2");
                    result.setForeground(Color.RED);
                    return;
                }
            }
        }
        
    }
