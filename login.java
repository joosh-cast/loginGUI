import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passText;
	private static JButton button;
	private static JLabel success;
	private static JButton register; 
	private static JLabel welcome; 
	private static JLabel loginTime; 
	
	
	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("Username");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passText = new JPasswordField(20);
		passText.setBounds(100, 50, 165, 25);
		panel.add(passText);
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUI());
		panel.add(button);	
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		
		frame.setVisible(true);
		
	}
	
	public static void postLoginExecution() {
		String user = userText.getText();
		JPanel postLogin = new JPanel();
		
		JFrame postLogin_frame = new JFrame();
		postLogin_frame.setSize(1000, 700);
		postLogin_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		postLogin_frame.add(postLogin);
		
		welcome = new JLabel("Welcome to Graphical User Interface, " + user);
		welcome.setBounds(50, 20, 1000, 90);
		welcome.setFont (welcome.getFont().deriveFont (34.0f));
		postLogin.add(welcome);
		
		Date now = new Date();
        now.getTime();
		loginTime = new JLabel("Successfully logged in on " + now);
		loginTime.setBounds(50, 15, 1000, 200);
		loginTime.setFont(welcome.getFont().deriveFont(20.0f));
		postLogin.add(loginTime);
		
		postLogin.setLayout(null);
		postLogin_frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String user = userText.getText();
		String password = passText.getText();
		System.out.println(user + ", " + password);
		
		if(user.contentEquals("Chief Admin") && password.equals("pass")) {
			success.setText("Login Successful");
			postLoginExecution();
		}
		
		else {
			success.setText("Invalid Login Info");
		}
	}
}
