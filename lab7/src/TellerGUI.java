
import java.awt.*;
import javax.swing.*;

public class TellerGUI {

    private JFrame f;
    private JPanel p1, p2, p3, p4;
    private JLabel l1, l2;
    private JTextField tf1, tf2;
    private JButton b1, b2, b3;

    public TellerGUI() {
        f = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        l1 = new JLabel("Balance");
        l2 = new JLabel("Amount");
        tf1 = new JTextField("6000");
        tf2 = new JTextField();
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");

        p1.setLayout(new GridLayout(4, 1));
        p2.setLayout(new GridLayout(1, 2));
        p3.setLayout(new GridLayout(1, 2));
        p4.setLayout(new FlowLayout());

        p2.add(l1);
        p2.add(tf1);

        p3.add(l2);
        p3.add(tf2);

        p4.add(b1);
        p4.add(b2);
        p4.add(b3);

        p1.add(p2);
        p1.add(p3);
        p1.add(p4);

        f.add(p1);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TellerGUI();
    }

}
