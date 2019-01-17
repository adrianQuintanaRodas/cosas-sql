package sql.java;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Choice;
import java.awt.List;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;

public class Eleccion extends JPanel {

	/**
	 * Create the panel.
	 */
	public Eleccion() {
		setLayout(null);
		
		JButton btnLineas = new JButton("LINEAS");
		btnLineas.setBounds(27, 39, 89, 23);
		add(btnLineas);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Origen"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(46, 87, 70, 20);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Destino"}));
		comboBox_1.setBounds(46, 165, 70, 20);
		add(comboBox_1);
		
		JRadioButton rdbtnIda = new JRadioButton("IDA");
		rdbtnIda.setSelected(true);
		rdbtnIda.setBounds(46, 211, 109, 23);
		add(rdbtnIda);
		
		JRadioButton rdbtnIdaYVuelta = new JRadioButton("IDA Y VUELTA");
		rdbtnIdaYVuelta.setBounds(46, 249, 109, 23);
		add(rdbtnIdaYVuelta);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(240, 11, 184, 153);
		add(calendar);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(279, 226, 95, 20);
		add(dateChooser);

	}
}
