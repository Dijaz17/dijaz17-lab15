import java.awt.BorderLayout;
import javax.swing.*;

public class EnigmaFrame {

    public EnigmaFrame() {
        JFrame frame = new JFrame();
        frame.setTitle("Enigma GUI"); 
        frame.setSize(900, 450); 
        frame.setLocation(200, 200);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        JComboBox<Integer> inner = new JComboBox<>();
        JComboBox<Integer> middle = new JComboBox<>();
        JComboBox<Integer> outer = new JComboBox<>();

        for (int i = 1; i <= 5; i++) {
            inner.addItem(i);
            middle.addItem(i);
            outer.addItem(i);
        }
        
        JTextField initialPos = new JTextField(3);

        JButton encrypt = new JButton("encrypt");
        JButton decrypt = new JButton("decrypt");

        JTextArea input = new JTextArea(10, 60);
        JTextArea output = new JTextArea(10,60);

        JPanel top = new JPanel();
        JPanel center = new JPanel();
        JPanel bottom = new JPanel();

        JLabel innerLabel = new JLabel("Inner");
        JLabel midLabel = new JLabel("Middle");
        JLabel outerLabel = new JLabel("Outer");
        JLabel posLabel = new JLabel("Initial Positions");
        JLabel inputLabel = new JLabel("Input");
        JLabel outputLabel = new JLabel("Output");

        top.add(innerLabel);
        top.add(inner);
        top.add(midLabel);
        top.add(middle);
        top.add(outerLabel);
        top.add(outer);
        top.add(posLabel);
        top.add(initialPos);
        top.add(encrypt);
        top.add(decrypt);

        center.add(inputLabel);
        center.add(input);

        bottom.add(outputLabel);
        bottom.add(output);

        frame.add(top, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);

        frame.setVisible(true);

    }

}
