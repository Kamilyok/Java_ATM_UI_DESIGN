import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Atm extends JFrame {
     // Class Variables
	private JLabel messageLabel;
   private JRadioButton checking;
   private JRadioButton savings;
   private JTextField amount;
   private ButtonGroup radioButtonGroup;
	private JPanel panel;
	private final int WIDTH = 500;
	private final int HEIGHT = 125;
   void showMenu() {
		setTitle("MY ATM");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Create the buttons.
		/*deposit = new JButton("Deposit");
		withdraw = new JButton("Withdraw");
		prev_transaction = new JButton("Previous Transaction");
		calc_interest = new JButton("Interest rate");
      balance = */
		// Create a event listener with all buttons.
		//deposit.addActionListener(new DepositButtonListener());
		//withdraw.addActionLister(new WithdrawButtonListener());
		//prev_transaction.addActionListener(new PrevTransButtonListener());
		//calc_interest.addActionListener(new CalcInterestButtonListener());;
		//Create a panel and add the components to it.
		setLayout(new BorderLayout());
      
      JButton balance = new JButton("View account");
      JButton deposit = new JButton("Deposit");
      JButton withdraw = new JButton("Withdraw");
      JButton prev_transaction = new JButton("View Previous transaction");
      JButton calc_interest = new JButton("View interest rate");
      
      // Add the buttons to the content pane.
      add(withdraw, BorderLayout.EAST);
      add(balance, BorderLayout.CENTER);
      add(calc_interest, BorderLayout.SOUTH);
      add(deposit, BorderLayout.WEST);
      add(prev_transaction, BorderLayout.NORTH);
      // Display the window.
      setVisible(true);
	    }
      public void deposit(){
       // Create a label.
      setTitle("MY ATM");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      buildPanel();
      add(panel);
      setVisible(true);
       }
       private void buildPanel()
       {
       messageLabel = new JLabel("Enter the amount to checking");
       amount = new JTextField(10);
       checking = new JRadioButton("Checking account");
       savings = new JRadioButton("Savings account");
       
       // Group the radio buttons.
       radioButtonGroup = new ButtonGroup();
       radioButtonGroup.add(checking);
       radioButtonGroup.add(savings);
       // Create a panel and add the components to it
       panel = new JPanel();
       panel.add(messageLabel);
       panel.add(amount);
       panel.add(checking);
       panel.add(savings);
       
       }
   }