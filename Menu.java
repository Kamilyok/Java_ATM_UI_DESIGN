import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JPanel;

public class Menu extends JFrame {
    ImageIcon depositIcon;
    ImageIcon withdrawIcon;
    ImageIcon viewAccIcon;
    Menu(){
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
        JLabel label = new JLabel("Choose the option");
        ImageIcon image1 = new ImageIcon("menu.png");
        label.setIcon(image1);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        // Style font
        label.setForeground(new Color(6,36,130));
        label.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 30));
        // Set position
        label.setVerticalAlignment(JLabel.TOP); // set vertical position
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(180, 30, 350, 250);
        // Create deposit panel
        JPanel depositPanel = new JPanel();
        depositPanel.setBackground((new Color(154,211,183)));
        depositPanel.setBounds(50,220,180,120);
        depositIcon = new ImageIcon("deposit1.png");
        JLabel depositLabel = new JLabel("Deposit");
        depositLabel.setBounds(100,340,100,50);
        // Create withdraw panel
        JPanel withdrawPanel = new JPanel();
        withdrawPanel.setBackground((new Color(154,211,183)));
        withdrawPanel.setBounds(230,220,180,120);
        withdrawIcon = new ImageIcon("withdraw1.jpg");
        JLabel withdrawLabel = new JLabel("Withdrawal");
        withdrawLabel.setBounds(280,340,100,50);
        // Create viewAccount panel
        JPanel viewAccountPanel = new JPanel();
        viewAccountPanel.setBackground((new Color(154,211,183)));
        viewAccountPanel.setBounds(410,220,200,120);
        viewAccIcon = new ImageIcon("account1.jpg");
        JLabel viewAccLabel = new JLabel("View Account");
        viewAccLabel.setBounds(470,340,100,50);
        // Create radiobutton
        JRadioButton depositButton = new JRadioButton();
        JRadioButton withdrawButton = new JRadioButton();
        JRadioButton viewAccountButton = new JRadioButton();
        // Group buttons so only one can be clicked
        ButtonGroup group = new ButtonGroup();
        group.add(depositButton);
        group.add(withdrawButton);
        group.add(viewAccountButton);
        // Add buttons to panels
        depositPanel.add(depositButton);
        withdrawPanel.add(withdrawButton);
        viewAccountPanel.add(viewAccountButton);
        // Add icons to button
        depositButton.setIcon(depositIcon);
        withdrawButton.setIcon(withdrawIcon);
        viewAccountButton.setIcon(viewAccIcon);
        // showing window
        this.add(label);
        this.add(depositPanel);
        this.add(withdrawPanel);
        this.add(viewAccountPanel);
        this.add(depositLabel);
        this.add(withdrawLabel);
        this.add(viewAccLabel);
        this.setLayout(null);
        this.setVisible(true);
    }
}
