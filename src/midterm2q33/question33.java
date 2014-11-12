package midterm2q33;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class question33 {
	public class password{
		private static final String password = "bugaboo";	
			
			public void main(String[] args){
				JFrame frame = new JFrame("Password");
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(400,100);
				
				JLabel label = new JLabel("Enter password");
				JPanel panel = new JPanel();
				frame.getContentPane().add(panel);
				
				JPasswordField pass = new JPasswordField(10);
				pass.setEchoChar('*');
				pass.addActionListener(new AL());
			panel.add(label,BorderLayout.WEST);
			panel.add(pass,BorderLayout.EAST);
			}
			
			public class AL implements ActionListener{
				public void actionPerformed(ActionEvent e){
				JPasswordField input = (JPasswordField)e.getSource();
				char[] passy = input.getPassword();
				String p = new String(passy);
				
				if(p.equals(password)){
					JOptionPane.showMessageDialog(null,"Correct");
				}
				else
					JOptionPane.showMessageDialog(null, "Incorrect");
				}
			}
}
}