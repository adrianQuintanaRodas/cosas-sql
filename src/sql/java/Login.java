package sql.java;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(199, 33, 46, 14);
		add(lblLogin);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(85, 81, 46, 14);
		add(lblDni);
		
		textField = new JTextField();
		textField.setBounds(159, 78, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(85, 112, 69, 14);
		add(lblContrasea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(159, 109, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnRegistrase = new JButton("Registrase");
		btnRegistrase.setBounds(242, 197, 89, 23);
		add(btnRegistrase);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(96, 197, 89, 23);
		add(btnLogin);

	}

}
