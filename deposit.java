import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JPanel;

public class deposit extends JFrame {
    deposit() {
        // Create a JFrame.
        this.setTitle("MY ATM APP");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setResizable(false);
        this.setSize(800,600);
        // Changing logo
        ImageIcon image = new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        //  Change color of background
        this.getContentPane().setBackground(new Color(154,211,183)); 
        JLabel label = new JLabel("Deposit");
        ImageIcon image1 = new ImageIcon("deposit1.png");
        label.setIcon(image1);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        // Style font
        label.setForeground(new Color(6,36,130));
        label.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 20));
        // Set position
        label.setVerticalAlignment(JLabel.TOP); // set vertical position
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(180, 30, 360, 250);
        // Build the panel
        JLabel messageLabel = new JLabel("Enter the amount to deposit");
        messageLabel.setForeground(Color.black);
        messageLabel.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 18));
        JTextArea amount = new JTextArea(2,15);
        JRadioButton checking = new JRadioButton("Checking account");
        JRadioButton savings = new JRadioButton("Savings account");
        // Group the radio buttons.
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(checking);
        radioButtonGroup.add(savings);
        // Create a panel and add the components to it
        JPanel panel = new JPanel();
        panel.setBounds(50,180,400,150);
        panel.setBackground(new Color(154,211,183));
        panel.add(messageLabel);
        panel.add(amount);
        panel.add(checking);
        panel.add(savings);
        // Back button
        JButton back = new JButton("Back to menu");
        back.setBounds(110,700,130,25);
        // showing window
        this.add(label);
        this.add(panel);
        this.add(back);
        this.setLayout(null);
        this.setVisible(true);
    }
}
