
import java.awt.*;
import javax.swing.*;

public class SimpleCalGUI {

    private JFrame f;
    private JPanel p1, p2, p3, p4;
    private JTextField tf1, tf2, tf3;
    private JButton b1, b2, b3, b4;

    public SimpleCalGUI() {
        f = new JFrame("Calculator");
        p1 = new JPanel();
        p2 = new JPanel();
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");

        p1.setLayout(new GridLayout(4, 1));
        p2.setLayout(new FlowLayout());

        p1.add(tf1);
        p1.add(tf2);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);

        p1.add(p2);
        p1.add(tf3);

        f.add(p1);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleCalGUI();
    }

}
