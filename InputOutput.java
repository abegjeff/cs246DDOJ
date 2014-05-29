import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class InputOutput extends JFrame {
    
    JLabel label;
    JTextField tf;
    JButton button;
    
    public InputOutput() {
        
    
    
    setLayout(new FlowLayout());
    
    label = new JLabel("Enter text to write to the file");
    
    tf = new JTextField(10);
    add(tf);
    
    button = new JButton("Write to file");
    add(button);
    
    event e = new event();
    button.addActionListener(e);    
    }
    
    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String word = tf.getText();

   		//Wherever you want it to write to, you could also add a
                //prompt
                FileWriter stream = new FileWriter("C:\\Users\\Jeff\\Desktop\\file.txt");
                BufferedWriter out = new BufferedWriter(stream);
                out.write(word);
                
                //I forgot to close when first compiling. I was
                //getting confused why nothing was in the file.
                out.close();
            } catch (Exception ex) {
                }
            }
        }
    
    public static void main(String[] args) {
        InputOutput gui = new InputOutput();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(300, 150);
        gui.setTitle("Writer");
        gui.setVisible(true);
    }