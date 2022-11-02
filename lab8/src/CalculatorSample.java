
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorSample implements ActionListener {

    private JFrame f;
    private JTextField tf;
    private JPanel p1, p2;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    String symbol;
    double num1;
    double num2;

    public CalculatorSample() {
        f = new JFrame("My Calculator");
        p1 = new JPanel();
        p2 = new JPanel();
        tf = new JTextField();
        b1 = new JButton("7");
        b2 = new JButton("8");
        b3 = new JButton("9");
        b4 = new JButton("+");
        b5 = new JButton("4");
        b6 = new JButton("5");
        b7 = new JButton("6");
        b8 = new JButton("-");
        b9 = new JButton("1");
        b10 = new JButton("2");
        b11 = new JButton("3");
        b12 = new JButton("x");
        b13 = new JButton("0");
        b14 = new JButton("c");
        b15 = new JButton("=");
        b16 = new JButton("/");

        p1.setLayout(new BorderLayout());
        p1.add(tf, BorderLayout.NORTH);
        p2.setLayout(new GridLayout(4, 4));
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);

        p1.add(p2);
        f.add(p1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(b1)) {
            tf.setText(tf.getText() + "7");
        } else if (ae.getSource().equals(b2)) {
            tf.setText(tf.getText() + "8");
        } else if (ae.getSource().equals(b3)) {
            tf.setText(tf.getText() + "9");
        } else if (ae.getSource().equals(b4)) {
            symbol = "+";
            num1 = Double.parseDouble(tf.getText());
            tf.setText("");
        } else if (ae.getSource().equals(b5)) {
            tf.setText(tf.getText() + "4");
        } else if (ae.getSource().equals(b6)) {
            tf.setText(tf.getText() + "5");
        } else if (ae.getSource().equals(b7)) {
            tf.setText(tf.getText() + "6");
        } else if (ae.getSource().equals(b8)) {
            symbol = "-";
            num1 = Double.parseDouble(tf.getText());
            tf.setText("");
        } else if (ae.getSource().equals(b9)) {
            tf.setText(tf.getText() + "1");
        } else if (ae.getSource().equals(b10)) {
            tf.setText(tf.getText() + "2");
        } else if (ae.getSource().equals(b11)) {
            tf.setText(tf.getText() + "3");
        } else if (ae.getSource().equals(b12)) {
            symbol = "*";
            num1 = Double.parseDouble(tf.getText());
            tf.setText("");
        } else if (ae.getSource().equals(b13)) {
            tf.setText(tf.getText() + "0");
        } else if (ae.getSource().equals(b14)) {
            num1 = 0;
            num2 = 0;
            tf.setText("");
        } else if (ae.getSource().equals(b15)) {
            num2 = Double.parseDouble(tf.getText());
            tf.setText(String.valueOf(cal(symbol, num1, num2)));
        } else if (ae.getSource().equals(b16)) {
            symbol = "/";
            num1 = Double.parseDouble(tf.getText());
            tf.setText("");
        }
    }

    public double cal(String s, double num1, double num2) {
        switch (s) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        new CalculatorSample();
    }
}
