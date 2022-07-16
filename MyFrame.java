import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JPanel;
public class MyFrame extends JFrame {
    private JPanel panel;
    MyFrame() {
        // JFrame is a GUI window to add components to
        this.setTitle("MY ATM APP");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setResizable(false);
        this.setSize(600,600);
        buildPanel();
        this.add(panel);
        //this.setVisible(true);
    
        // Changing logo
        ImageIcon image = new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(154,211,183)); //  Change color of background

        JLabel label = new JLabel("Welcome! Log in to your account.");
        ImageIcon image1 = new ImageIcon("main.png");
        label.setIcon(image1);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        // Style font
        label.setForeground(Color.white);
        label.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 20));
        // Set position
        label.setVerticalAlignment(JLabel.TOP); // set vertical position
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(40, 0, 350, 250);
        panel.setBounds(50,170,250,60);
        panel.setBackground(new Color(154,211,183));
        // Submit button
        JButton submit = new JButton("Submit");
        submit.setBounds(110,238,130,25);
        this.add(label);
        this.add(submit);
        this.setLayout(null);
        this.setVisible(true);
    }
    void buildPanel()
       {
       JLabel username = new JLabel("Enter your username");
       JTextField login = new JTextField(10);
       JLabel password = new JLabel("Enter your password");
       JTextField passw = new JTextField(10);
       // Create a panel and add the components to it
       panel = new JPanel();
       panel.add(username);
       panel.add(login);
       panel.add(password);
       panel.add(passw);
       }
}
