package vista;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.sql.Conexión;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;

public class LoginV extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textUsuario;
	private JTextField textContraseña;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public LoginV() {
		setFont(new Font("Dialog", Font.PLAIN, 18));
		setTitle("Login");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 906, 594);	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Sistema de exámenes");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(21, 23, 365, 55);
		contentPane.add(lblTitulo);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuario.setBounds(254, 127, 113, 30);
		contentPane.add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContraseña.setBounds(254, 194, 113, 30);
		contentPane.add(lblContraseña);
		
		JLabel lblTipoDeUsuario = new JLabel("Tipo de Usuario:");
		lblTipoDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTipoDeUsuario.setBounds(254, 270, 162, 30);
		contentPane.add(lblTipoDeUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textUsuario.setBounds(426, 129, 166, 30);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		textContraseña = new JTextField();
		textContraseña.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textContraseña.setColumns(10);
		textContraseña.setBounds(426, 196, 166, 30);
		contentPane.add(textContraseña);
		
		JComboBox comboBoxTipo = new JComboBox();
		comboBoxTipo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxTipo.setBounds(426, 271, 166, 30);
		contentPane.add(comboBoxTipo);
		
		comboBoxTipo.addItem("Estudiante");
		comboBoxTipo.addItem("Administrador");
		
		JButton btnContinuar = new JButton("Iniciar sesión");
		btnContinuar.setForeground(new Color(0, 128, 0));
		btnContinuar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnContinuar.setBounds(349, 389, 189, 35);
		contentPane.add(btnContinuar);
		
		JButton btnRegistro = new JButton("Registrar");
		btnRegistro.setForeground(new Color(255, 0, 0));
		btnRegistro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRegistro.setBounds(691, 23, 189, 35);
		contentPane.add(btnRegistro);
	}
	
	private void Login() {
		
		Conexión.conexion();
		
		
	}
}
