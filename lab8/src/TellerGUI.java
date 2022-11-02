
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TellerGUI extends Account implements ActionListener {

    private JFrame f;
    private JPanel p1, p2, p3, p4;
    private JLabel l1, l2, l3;
    private JTextField tf;
    private JButton b1, b2, b3;

    public TellerGUI() {
        super(6000, "");

        f = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        l1 = new JLabel("Balance");
        l2 = new JLabel("");
        l3 = new JLabel("Amount");
        tf = new JTextField();
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        p1.setLayout(new GridLayout(4, 1));
        p2.setLayout(new GridLayout(1, 2));
        p3.setLayout(new GridLayout(1, 2));
        p4.setLayout(new FlowLayout());

        p2.add(l1);
        l2.setText(String.valueOf(this.getBalance()));
        p2.add(l2);

        p3.add(l3);
        p3.add(tf);

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

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(b3)) {
            System.exit(0);
        }
        if (Double.valueOf(tf.getText()) >= 0) {
            if (ae.getSource().equals(b1)) {
                setBalance(this.getBalance() + (Double.valueOf(tf.getText())));
                l2.setText(String.valueOf(this.getBalance()));
            } else if (ae.getSource().equals(b2)) {
                if (this.getBalance() - (Double.valueOf(tf.getText())) >= 0) {
                    setBalance(this.getBalance() - (Double.valueOf(tf.getText())));
                }
                l2.setText(String.valueOf(this.getBalance()));
            }
        }

    }

    public static void main(String[] args) {
        new TellerGUI();
    }

}
