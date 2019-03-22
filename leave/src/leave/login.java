package leave;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Color;
import java.awt.Insets;
import java.awt.TextField;

import javax.swing.AbstractAction;
import javax.swing.Action;
import net.miginfocom.swing.MigLayout;
import javax.swing.JDesktopPane;
import java.awt.Font;
import javax.swing.SwingConstants;

public class login extends JFrame {
	private final Action action = new SwingAction();
	private JTextField textField;
	private JTextField TxtUserPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 329);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(135, 206, 250));
		getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		textField = new JTextField();
		textField.setBounds(126, 66, 152, 20);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		TxtUserPass = new JTextField();
		TxtUserPass.setBounds(126, 108, 152, 20);
		desktopPane.add(TxtUserPass);
		TxtUserPass.setColumns(10);
		
		JLabel TxtUser =new JLabel("USER NAME");
		TxtUser.setFont(new Font("Tahoma", Font.BOLD, 11));
		TxtUser.setForeground(Color.MAGENTA);
		TxtUser.setBackground(Color.MAGENTA);
		TxtUser.setBounds(24, 66, 81, 20);
		desktopPane.add(TxtUser);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setForeground(Color.MAGENTA);
		lblPassword.setBounds(24, 111, 68, 14);
		desktopPane.add(lblPassword);
		
		JButton BtnLogin = new JButton("LOGIN");
		BtnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
				{
					if(e.getSource()==BtnLogin)
					{
						String User_Id = TxtUser.getText().trim();
						String User_Pass = TxtUserPass.getText().trim();
			                        
			                        String userId="";
			                        String usertype="";
			                        String Fname = "";
			                        String Lname = "";
			                        System.out.print("WELCOME");
			             
	
			                
				}
				
			}
		}); 
		BtnLogin.setBounds(89, 159, 142, 23);
		desktopPane.add(BtnLogin);
		
		JLabel lblLeaveApplication = new JLabel("LEAVE APPLICATION");
		lblLeaveApplication.setFont(new Font("Yu Gothic Medium", Font.BOLD, 11));
		lblLeaveApplication.setForeground(Color.BLACK);
		lblLeaveApplication.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeaveApplication.setBackground(Color.BLUE);
		lblLeaveApplication.setBounds(10, 11, 289, 14);
		desktopPane.add(lblLeaveApplication);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnRegister.setBounds(89, 193, 142, 23);
		desktopPane.add(btnRegister);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
