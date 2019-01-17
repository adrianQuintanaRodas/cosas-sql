package sql.java;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Resumen extends JPanel {
	private JTextField txtResumen;

	/**
	 * Create the panel.
	 */
	public Resumen() {
		setLayout(null);
		
		txtResumen = new JTextField();
		txtResumen.setText("RESUMEN");
		txtResumen.setBounds(185, 33, 55, 20);
		add(txtResumen);
		txtResumen.setColumns(10);
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setBounds(49, 80, 46, 14);
		add(lblOrigen);
		
		JLabel lblNewLabel = new JLabel("Destino");
		lblNewLabel.setBounds(49, 113, 46, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Precio");
		lblNewLabel_1.setBounds(49, 148, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hora");
		lblNewLabel_2.setBounds(49, 186, 46, 14);
		add(lblNewLabel_2);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.setBounds(322, 234, 89, 23);
		add(btnPagar);

	}
}
