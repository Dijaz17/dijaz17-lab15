import java.awt.BorderLayout;
import javax.swing.*;

public class EnigmaFrame {
    private JFrame frame;
    private JComboBox<String> inner;
    private JComboBox<String> middle;
    private JComboBox<String> outer;
    private JTextField initialPos;
    private JButton encrypt;
    private JButton decrypt;
    private JTextArea input;
    private JTextArea output;

    public EnigmaFrame() {
        frame = new JFrame();
        frame.setTitle("Enigma GUI"); 
        frame.setSize(900, 450); 
        frame.setLocation(200, 200);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        inner = new JComboBox<>();
        middle = new JComboBox<>();
        outer = new JComboBox<>();

        for (int i = 1; i <= 5; i++) {
            inner.addItem(String.valueOf(i));
            middle.addItem(String.valueOf(i));
            outer.addItem(String.valueOf(i));
        }
        
        initialPos = new JTextField(3);

        encrypt = new JButton("encrypt");
        decrypt = new JButton("decrypt");

        input = new JTextArea(10, 60);
        output = new JTextArea(10,60);
        output.setEditable(false);

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

    public String getInner() {
        return (String) inner.getSelectedItem();
    }

    public String getMiddle() {
        return (String) middle.getSelectedItem();
    }

    public String getOuter() {
        return (String) outer.getSelectedItem();
    }

    public String getInitialPosition() {
        return initialPos.getText();
    }

    public String getInputText() {
        return input.getText();
    }

    public JButton getEncryptButton() {
        return encrypt;
    }

    public JButton getDecryptButton() {
        return decrypt;
    }

    public void setOutputText(String text) {
        output.setText(text);
    }

}
