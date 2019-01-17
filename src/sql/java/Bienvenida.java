package sql.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Bienvenida extends JFrame {

	private JPanel contentPane;
	private JTextField txtBienvenidoALa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenida frame = new Bienvenida();
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
	public Bienvenida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnComprar = new JButton("COMPRAR");
		btnComprar.setBounds(164, 123, 89, 23);
		contentPane.add(btnComprar);
		
		txtBienvenidoALa = new JTextField();
		txtBienvenidoALa.setText("BIENVENIDO A LA MAQUINA DE BILLETES DE TERMIBUS");
		txtBienvenidoALa.setBounds(80, 28, 279, 28);
		contentPane.add(txtBienvenidoALa);
		txtBienvenidoALa.setColumns(10);
	}
}
