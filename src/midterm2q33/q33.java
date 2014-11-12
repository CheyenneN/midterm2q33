package midterm2q33;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.Arrays;

public class q33 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					q33 frame = new q33();
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
	public q33() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblEnterPassword = new JLabel("Enter Password");
		GridBagConstraints gbc_lblEnterPassword = new GridBagConstraints();
		gbc_lblEnterPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterPassword.anchor = GridBagConstraints.EAST;
		gbc_lblEnterPassword.gridx = 4;
		gbc_lblEnterPassword.gridy = 4;
		contentPane.add(lblEnterPassword, gbc_lblEnterPassword);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 5;
		gbc_textField.gridy = 4;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("Ok");
		GridBagConstraints gbc_btnOk = new GridBagConstraints();
		gbc_btnOk.insets = new Insets(0, 0, 5, 0);
		gbc_btnOk.gridx = 5;
		gbc_btnOk.gridy = 6;
		contentPane.add(btnOk, gbc_btnOk);
		
		JButton btnHelp = new JButton("Help");
		GridBagConstraints gbc_btnHelp = new GridBagConstraints();
		gbc_btnHelp.gridx = 5;
		gbc_btnHelp.gridy = 7;
		contentPane.add(btnHelp, gbc_btnHelp);
	}
	
	private static boolean isPasswordCorrect(char[] input) {
	    boolean isCorrect = true;
	    char[] correctPassword = { 'b', 'u', 'g', 'a', 'b', 'o', 'o' };

	    if (input.length != correctPassword.length) {
	        isCorrect = false;
	    } else {
	        isCorrect = Arrays.equals (input, correctPassword);
	    }

	    //Zero out the password.
	    Arrays.fill(correctPassword,'0');

	    return isCorrect;
	}
	
	public void actionPerformed(ActionEvent e) {
	    String cmd = e.getActionCommand();

	    if (OK.equals(cmd)) { 
	        JTextComponent passwordField;
			char[] input = passwordField.getPassword();
	        Component controllingFrame;
			if (isPasswordCorrect(input)) {
	            JOptionPane.showMessageDialog(controllingFrame,
	                "Success! You typed the right password.");
	        } else {
	            JOptionPane.showMessageDialog(controllingFrame,
	                "Invalid password. Try again.",
	                "Error Message",
	                JOptionPane.ERROR_MESSAGE);
	        }

	        Arrays.fill(input, '0');

	        passwordField.selectAll();
	        resetFocus();
	    } else {
	    	Component controllingFrame;
			JOptionPane.showMessageDialog(controllingFrame,
	                "Get right password.",
	                JOptionPane.ERROR_MESSAGE);
	    }
	}
}
