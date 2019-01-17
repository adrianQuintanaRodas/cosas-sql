package sql.java;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Lineas extends JPanel {
	private JTextField txtLineas;

	/**
	 * Create the panel.
	 */
	public Lineas() {
		setLayout(null);
		
		JButton btnLineaBilbaomungia = new JButton("Linea Bilbao-Mungia");
		btnLineaBilbaomungia.setBounds(28, 90, 135, 23);
		add(btnLineaBilbaomungia);
		
		JButton btnLineaBilbaogernika = new JButton("Linea Bilbao-Gernika");
		btnLineaBilbaogernika.setBounds(28, 135, 135, 23);
		add(btnLineaBilbaogernika);
		
		JButton btnLineaBibaogetxo = new JButton("Linea Bilbao-Donosti");
		btnLineaBibaogetxo.setBounds(28, 186, 135, 23);
		add(btnLineaBibaogetxo);
		
		txtLineas = new JTextField();
		txtLineas.setText("                                                       LINEAS");
		txtLineas.setBounds(54, 29, 351, 20);
		add(txtLineas);
		txtLineas.setColumns(10);

	}

}
