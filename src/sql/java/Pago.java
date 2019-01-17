package sql.java;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Pago extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public Pago() {
		setLayout(null);
		
		JLabel lblPagar = new JLabel("PAGAR");
		lblPagar.setBounds(187, 26, 46, 14);
		add(lblPagar);
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar:");
		lblTotalAPagar.setBounds(29, 76, 68, 14);
		add(lblTotalAPagar);
		
		JLabel lblIntroducir = new JLabel("Introducir:");
		lblIntroducir.setBounds(29, 106, 68, 14);
		add(lblIntroducir);
		
		JLabel lblTotalADevolver = new JLabel("Total a devolver:");
		lblTotalADevolver.setBounds(29, 135, 91, 14);
		add(lblTotalADevolver);
		
		JLabel lblFaltaPorPagar = new JLabel("Falta por pagar:");
		lblFaltaPorPagar.setBounds(29, 167, 79, 14);
		add(lblFaltaPorPagar);
		
		textField = new JTextField();
		textField.setBounds(118, 73, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(118, 103, 86, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(118, 132, 86, 20);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(118, 164, 86, 20);
		add(textField_3);
		
		JLabel lblImprimiendoBilleteEspere = new JLabel("Imprimiendo Billete espere 5 segundos");
		lblImprimiendoBilleteEspere.setBounds(159, 225, 189, 14);
		add(lblImprimiendoBilleteEspere);

	}

}
