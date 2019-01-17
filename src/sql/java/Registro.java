package sql.java;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Registro extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Registro() {
		setLayout(null);
		
		JLabel lblRegistrarse = new JLabel("REGISTRARSE");
		lblRegistrarse.setBounds(184, 33, 77, 14);
		add(lblRegistrarse);
		
		JLabel lblNewLabel = new JLabel("DNI:");
		lblNewLabel.setBounds(48, 92, 46, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TEL:");
		lblNewLabel_1.setBounds(48, 128, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_2.setBounds(48, 172, 63, 14);
		add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(121, 89, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(121, 125, 86, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(121, 169, 86, 20);
		add(textField_2);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(165, 231, 89, 23);
		add(btnRegistrarse);

	}

}
