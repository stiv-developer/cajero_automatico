package ProyectoCA;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import rojerusan.RSPanelsSlider;
import rojerusan.RSPanelsSlider.DIRECT;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import com.toedter.calendar.JDateChooser;

import javax.swing.border.CompoundBorder;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Menu extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnConsultarSaldo;
	private JButton btnRetirarSaldo;
	private JButton btnDepositarSaldo;
	private JButton btnSalir;
	private JPanel panelPrincipal;
	private JPanel panelRetiraSaldo;
	private JPanel panelConsultaSaldo;

	private RSPanelsSlider panelsSlider;
	private JPanel panelDepositarSaldo;
	private JTextField txtRestarCantidad;
	public JTextField txtSaldoSoles;
	private JTextField textField_2;
	private static JLabel lblSaldo;

	public static int saldo = 0;

	DateFormat VariableFecha = DateFormat.getDateInstance();

	DefaultTableModel modelo = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/img/pngocean.com.png")));
		setTitle("CAJERO AUTOMATICO  | Principal");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1341, 686);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(0, 191, 255));
		panel.setBounds(0, 0, 1325, 87);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblBienvenido = new JLabel("Bienvenido...");
		lblBienvenido.setForeground(Color.WHITE);
		lblBienvenido.setFont(new Font("Dialog", Font.ITALIC, 36));
		lblBienvenido.setBounds(58, 11, 281, 65);
		panel.add(lblBienvenido);

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 87, 1325, 615);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblPorFavorEliga = new JLabel("Por favor eliga una opcion");
		lblPorFavorEliga.setFont(new Font("Dialog", Font.ITALIC, 17));
		lblPorFavorEliga.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorFavorEliga.setBounds(468, 11, 337, 49);
		panel_1.add(lblPorFavorEliga);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(468, 58, 349, 2);
		panel_1.add(separator);

		btnConsultarSaldo = new JButton("CONSULTA TU SALDO");
		btnConsultarSaldo.setIcon(new ImageIcon(Menu.class.getResource("/img/saldo.png")));
		btnConsultarSaldo.setBackground(new Color(0, 191, 255));
		btnConsultarSaldo.addActionListener(this);
		btnConsultarSaldo.setForeground(Color.WHITE);
		btnConsultarSaldo.setBounds(33, 111, 225, 129);
		panel_1.add(btnConsultarSaldo);

		btnRetirarSaldo = new JButton("RETIRAR");
		btnRetirarSaldo.setIcon(new ImageIcon(Menu.class.getResource("/img/icons8-atm-45.png")));
		btnRetirarSaldo.setForeground(Color.WHITE);
		btnRetirarSaldo.setBackground(new Color(0, 191, 255));
		btnRetirarSaldo.addActionListener(this);
		btnRetirarSaldo.setBounds(33, 395, 225, 129);
		panel_1.add(btnRetirarSaldo);

		btnDepositarSaldo = new JButton("DEPOSITAR ");
		btnDepositarSaldo.setIcon(new ImageIcon(Menu.class.getResource("/img/icons8-atm-45.png")));
		btnDepositarSaldo.setForeground(Color.WHITE);
		btnDepositarSaldo.setBackground(new Color(0, 191, 255));
		btnDepositarSaldo.addActionListener(this);
		btnDepositarSaldo.setBounds(1049, 111, 225, 123);
		panel_1.add(btnDepositarSaldo);

		btnSalir = new JButton("SALIR DEL SISTEMA");
		btnSalir.setIcon(new ImageIcon(Menu.class.getResource("/img/salir.png")));
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setBackground(new Color(0, 191, 255));
		btnSalir.addActionListener(this);
		btnSalir.setBounds(1049, 251, 225, 123);
		panel_1.add(btnSalir);

		panelsSlider = new RSPanelsSlider();
		panelsSlider.setBounds(268, 111, 774, 412);
		panel_1.add(panelsSlider);
		panelsSlider.setLayout(new CardLayout(0, 0));

		panelConsultaSaldo = new JPanel();
		panelConsultaSaldo.setBackground(Color.WHITE);
		panelConsultaSaldo.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)),
				"Consulta tu saldo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelsSlider.add(panelConsultaSaldo, "name_1732325071178");
		panelConsultaSaldo.setLayout(null);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(10, 40, 754, 63);
		panelConsultaSaldo.add(panel_4);
		panel_4.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_5.setBounds(0, 0, 51, 63);
		panel_4.add(panel_5);
		panel_5.setBackground(new Color(0, 204, 255));

		JLabel lblAorro = new JLabel("Ahorro Soles");
		lblAorro.setFont(new Font("Dialog", Font.BOLD, 15));
		lblAorro.setBounds(85, 0, 161, 52);
		panel_4.add(lblAorro);

		lblSaldo = new JLabel("");
		lblSaldo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSaldo.setBounds(647, 0, 107, 38);
		panel_4.add(lblSaldo);

		JLabel lblSaldoDisponible = new JLabel("Saldo disponible");
		lblSaldoDisponible.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaldoDisponible.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSaldoDisponible.setBounds(586, 31, 133, 32);
		panel_4.add(lblSaldoDisponible);

		panelDepositarSaldo = new JPanel();
		panelDepositarSaldo.setBackground(Color.WHITE);
		panelDepositarSaldo.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)),
				"Depositar Saldo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelsSlider.add(panelDepositarSaldo, "name_1732422727057");
		panelDepositarSaldo.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(new Color(0, 204, 255));
		panel_2.setBounds(10, 25, 754, 56);
		panelDepositarSaldo.add(panel_2);

		JLabel lblcuantoDeseaDepositar = new JLabel("\u00BFCuanto desea depositar?");
		lblcuantoDeseaDepositar.setHorizontalAlignment(SwingConstants.CENTER);
		lblcuantoDeseaDepositar.setForeground(Color.BLACK);
		lblcuantoDeseaDepositar.setFont(new Font("Dialog", Font.PLAIN, 19));
		lblcuantoDeseaDepositar.setBounds(10, 11, 734, 34);
		panel_2.add(lblcuantoDeseaDepositar);

		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(367, 92, 1, 309);
		panelDepositarSaldo.add(separator_4);

		JLabel lblNewLabel = new JLabel("Depositar Soles");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 93, 347, 26);
		panelDepositarSaldo.add(lblNewLabel);

		JLabel lblDepositarDolares = new JLabel("Depositar Dolares");
		lblDepositarDolares.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepositarDolares.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblDepositarDolares.setBounds(404, 92, 347, 26);
		panelDepositarSaldo.add(lblDepositarDolares);

		btnDepositarSoles = new JButton("Depositar");
		btnDepositarSoles.addActionListener(this);
		btnDepositarSoles.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDepositarSoles.setBounds(72, 210, 220, 44);
		panelDepositarSaldo.add(btnDepositarSoles);

		JButton btnCancelar1 = new JButton("Cancelar");
		btnCancelar1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancelar1.setBounds(72, 265, 220, 44);
		panelDepositarSaldo.add(btnCancelar1);

		JButton btnDepositarDolares = new JButton("Depositar");
		btnDepositarDolares.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDepositarDolares.setBounds(464, 210, 220, 44);
		panelDepositarSaldo.add(btnDepositarDolares);

		JButton btnCancelar2 = new JButton("Cancelar");
		btnCancelar2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancelar2.setBounds(464, 265, 220, 44);
		panelDepositarSaldo.add(btnCancelar2);

		txtSaldoSoles = new JTextField();
		txtSaldoSoles.setBounds(85, 156, 207, 30);
		panelDepositarSaldo.add(txtSaldoSoles);
		txtSaldoSoles.setColumns(10);

		JLabel lblS_2 = new JLabel("S/");
		lblS_2.setFont(new Font("Dialog", Font.BOLD, 19));
		lblS_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblS_2.setBounds(26, 159, 49, 27);
		panelDepositarSaldo.add(lblS_2);

		textField_2 = new JTextField();
		textField_2.setBounds(484, 156, 207, 30);
		panelDepositarSaldo.add(textField_2);
		textField_2.setColumns(10);

		JLabel label_3 = new JLabel("$/");
		label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		label_3.setFont(new Font("Dialog", Font.BOLD, 19));
		label_3.setBounds(425, 156, 49, 27);
		panelDepositarSaldo.add(label_3);

		panelRetiraSaldo = new JPanel();
		panelRetiraSaldo.setBackground(Color.WHITE);
		panelRetiraSaldo.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)),
				"Retira tu saldo", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelsSlider.add(panelRetiraSaldo, "name_1732452549055");
		panelRetiraSaldo.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(new Color(0, 204, 255));
		panel_3.setBounds(10, 25, 754, 56);
		panelRetiraSaldo.add(panel_3);

		JLabel label = new JLabel("\u00BFCuanto es el monto a retirar?");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Dialog", Font.PLAIN, 19));
		label.setBounds(10, 11, 734, 34);
		panel_3.add(label);

		btn100soles = new JButton("Aceptar");
		btn100soles.addActionListener(this);
		btn100soles.setBounds(20, 92, 89, 56);
		panelRetiraSaldo.add(btn100soles);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 159, 371, 2);
		panelRetiraSaldo.add(separator_1);

		btn500soles = new JButton("Aceptar");
		btn500soles.addActionListener(this);
		btn500soles.setBounds(20, 172, 89, 56);
		panelRetiraSaldo.add(btn500soles);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 239, 371, 2);
		panelRetiraSaldo.add(separator_2);

		btn900soles = new JButton("Aceptar");
		btn900soles.addActionListener(this);
		btn900soles.setBounds(20, 247, 89, 56);
		panelRetiraSaldo.add(btn900soles);

		JLabel lblSoles = new JLabel("S/ 100.00 ");
		lblSoles.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSoles.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoles.setBounds(135, 92, 99, 38);
		panelRetiraSaldo.add(lblSoles);

		JLabel lblS = new JLabel("S/ 500.00 ");
		lblS.setHorizontalAlignment(SwingConstants.CENTER);
		lblS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblS.setBounds(135, 172, 99, 38);
		panelRetiraSaldo.add(lblS);

		JLabel lblS_1 = new JLabel("S/ 900.00 ");
		lblS_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblS_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblS_1.setBounds(135, 252, 99, 38);
		panelRetiraSaldo.add(lblS_1);

		JLabel lblSoles_1 = new JLabel("Soles");
		lblSoles_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSoles_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoles_1.setBounds(135, 129, 99, 19);
		panelRetiraSaldo.add(lblSoles_1);

		JLabel label_1 = new JLabel("Soles");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(135, 209, 99, 19);
		panelRetiraSaldo.add(label_1);

		JLabel label_2 = new JLabel("Soles");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(135, 287, 99, 19);
		panelRetiraSaldo.add(label_2);

		btnRetirarMonto = new JButton("Aceptar");
		btnRetirarMonto.addActionListener(this);
		btnRetirarMonto.setBounds(271, 338, 89, 56);
		panelRetiraSaldo.add(btnRetirarMonto);

		JLabel lblOtrasTransacciones = new JLabel("Eligir cantidad  ");
		lblOtrasTransacciones.setHorizontalAlignment(SwingConstants.TRAILING);
		lblOtrasTransacciones.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblOtrasTransacciones.setBounds(77, 334, 143, 27);
		panelRetiraSaldo.add(lblOtrasTransacciones);

		txtRestarCantidad = new JTextField();
		txtRestarCantidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtRestarCantidad.setBounds(77, 367, 178, 27);
		panelRetiraSaldo.add(txtRestarCantidad);
		txtRestarCantidad.setColumns(10);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 321, 371, 2);
		panelRetiraSaldo.add(separator_3);

		JLabel lblS_3 = new JLabel("S/");
		lblS_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblS_3.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblS_3.setBounds(20, 366, 46, 28);
		panelRetiraSaldo.add(lblS_3);

		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(401, 92, 1, 309);
		panelRetiraSaldo.add(separator_5);

		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(412, 159, 352, 2);
		panelRetiraSaldo.add(separator_6);

		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(412, 239, 352, 2);
		panelRetiraSaldo.add(separator_7);

		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(412, 321, 352, 2);
		panelRetiraSaldo.add(separator_8);

		JButton btnNewButton_3 = new JButton("Aceptar");
		btnNewButton_3.setBounds(675, 92, 89, 56);
		panelRetiraSaldo.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Aceptar");
		btnNewButton_4.setBounds(675, 172, 89, 56);
		panelRetiraSaldo.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Aceptar");
		btnNewButton_5.setBounds(675, 249, 89, 56);
		panelRetiraSaldo.add(btnNewButton_5);

		JLabel label_4 = new JLabel("$/ 50.00 ");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setBounds(566, 92, 99, 38);
		panelRetiraSaldo.add(label_4);

		JLabel lblDolares = new JLabel("Dolares");
		lblDolares.setHorizontalAlignment(SwingConstants.CENTER);
		lblDolares.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDolares.setBounds(566, 129, 99, 19);
		panelRetiraSaldo.add(lblDolares);

		JLabel label_7 = new JLabel("$/ 100.00 ");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_7.setBounds(566, 172, 99, 38);
		panelRetiraSaldo.add(label_7);

		JLabel label_8 = new JLabel("Dolares");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(566, 209, 99, 19);
		panelRetiraSaldo.add(label_8);

		JLabel label_9 = new JLabel("$/ 500.00 ");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_9.setBounds(566, 249, 99, 38);
		panelRetiraSaldo.add(label_9);

		JLabel label_10 = new JLabel("Dolares");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_10.setBounds(566, 286, 99, 19);
		panelRetiraSaldo.add(label_10);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(675, 339, 89, 55);
		panelRetiraSaldo.add(btnAceptar);

		JLabel label_11 = new JLabel("Eligir cantidad  ");
		label_11.setHorizontalAlignment(SwingConstants.TRAILING);
		label_11.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_11.setBounds(479, 334, 143, 27);
		panelRetiraSaldo.add(label_11);

		JLabel label_12 = new JLabel("$/");
		label_12.setHorizontalAlignment(SwingConstants.TRAILING);
		label_12.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_12.setBounds(422, 366, 46, 28);
		panelRetiraSaldo.add(label_12);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(479, 367, 178, 27);
		panelRetiraSaldo.add(textField);

		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.WHITE);
		panelsSlider.add(panelPrincipal, "name_1732492008771");
		panelPrincipal
				.setBorder(new TitledBorder(null, "Principal", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPrincipal.setLayout(null);

		lblSaldo.setText("0");

		JLabel lblS_4 = new JLabel("S/");
		lblS_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblS_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblS_4.setBounds(586, 0, 51, 38);
		panel_4.add(lblS_4);

		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(10, 114, 754, 63);
		panelConsultaSaldo.add(panel_7);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_8.setBackground(new Color(50, 205, 50));
		panel_8.setBounds(0, 0, 51, 63);
		panel_7.add(panel_8);

		JLabel lblAhorroDolares = new JLabel("Ahorro Dolares");
		lblAhorroDolares.setFont(new Font("Dialog", Font.BOLD, 15));
		lblAhorroDolares.setBounds(85, 0, 161, 52);
		panel_7.add(lblAhorroDolares);

		JLabel label_5 = new JLabel("$/");
		label_5.setHorizontalAlignment(SwingConstants.TRAILING);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_5.setBounds(586, 0, 51, 38);
		panel_7.add(label_5);

		JLabel label_6 = new JLabel("0");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_6.setBounds(647, 0, 107, 38);
		panel_7.add(label_6);

		JLabel label_13 = new JLabel("Saldo disponible");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_13.setBounds(586, 31, 133, 32);
		panel_7.add(label_13);

		panelMovimientos = new JPanel();
		panelMovimientos.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)),
				"Movimientos de Saldo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelMovimientos.setBackground(Color.WHITE);
		panelsSlider.add(panelMovimientos, "name_20503816959620");
		panelMovimientos.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 27, 754, 374);
		panelMovimientos.add(scrollPane);

		tabla = new JTable();
		modelo.addColumn("Nro Operacion");
		modelo.addColumn("Fecha");
		modelo.addColumn("Monto");
		tabla.setModel(modelo);
		scrollPane.setViewportView(tabla);

		btnMovimientosSaldo = new JButton("MOVIMIENTOS");
		btnMovimientosSaldo.setIcon(new ImageIcon(Menu.class.getResource("/img/movimientos.png")));
		btnMovimientosSaldo.setBackground(new Color(0, 191, 255));
		btnMovimientosSaldo.setForeground(Color.WHITE);
		btnMovimientosSaldo.addActionListener(this);
		btnMovimientosSaldo.setBounds(33, 251, 225, 133);
		panel_1.add(btnMovimientosSaldo);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "Fecha",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(1110, 11, 205, 73);
		panel_1.add(panel_6);
		panel_6.setLayout(null);

		fecha = new JDateChooser();
		fecha.setBounds(32, 28, 119, 20);
		panel_6.add(fecha);

		txtNro = new JTextField();
		txtNro.setText("50001");
		txtNro.setBounds(33, 58, 86, 20);
		panel_1.add(txtNro);
		txtNro.setColumns(10);
		txtNro.setVisible(false);

		Calendar c2 = new GregorianCalendar();
		fecha.setCalendar(c2);

		// ---DISEÑO DE LA TABLA

		tabla.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
		tabla.getTableHeader().setOpaque(false);
		tabla.getTableHeader().setBackground(new Color(32, 136, 203));
		tabla.getTableHeader().setForeground(new Color(255, 255, 255));
		tabla.setRowHeight(25);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btn900soles) {
			actionPerformedBtn900soles(arg0);
		}
		if (arg0.getSource() == btn500soles) {
			actionPerformedBtn500soles(arg0);
		}
		if (arg0.getSource() == btn100soles) {
			actionPerformedBtn100soles(arg0);
		}
		if (arg0.getSource() == btnRetirarMonto) {
			actionPerformedBtnRetirarMonto(arg0);
		}
		if (arg0.getSource() == btnMovimientosSaldo) {
			actionPerformedBtnNewButton_3(arg0);
		}
		if (arg0.getSource() == btnDepositarSoles) {
			actionPerformedBtnDepositarSoles(arg0);
		}
		if (arg0.getSource() == btnSalir) {
			actionPerformedBtnSalir(arg0);
		}
		if (arg0.getSource() == btnDepositarSaldo) {
			actionPerformedBtnDepositarSaldo(arg0);
		}
		if (arg0.getSource() == btnRetirarSaldo) {
			actionPerformedBtnRetirarSaldo(arg0);
		}
		if (arg0.getSource() == btnConsultarSaldo) {
			actionPerformedBtnConsultarSaldo(arg0);
		}
	}

	private JButton btnDepositarSoles;
	private JPanel panelMovimientos;
	private JScrollPane scrollPane;
	private JTable tabla;
	private JButton btnMovimientosSaldo;
	private JTextField txtNro;
	private JDateChooser fecha;
	private JButton btnRetirarMonto;
	private JTextField textField;
	private JButton btn100soles;
	private JButton btn500soles;
	private JButton btn900soles;

	protected void actionPerformedBtnConsultarSaldo(ActionEvent arg0) {

		if (!this.btnConsultarSaldo.isSelected()) {
			panelConsultaSaldo.setName("panelConsultaSaldo");

			this.btnConsultarSaldo.setSelected(true);
			this.btnRetirarSaldo.setSelected(false);
			this.btnDepositarSaldo.setSelected(false);
			this.btnMovimientosSaldo.setSelected(false);

			panelsSlider.setPanelSlider(1, panelConsultaSaldo, DIRECT.RIGHT);

		}

	}

	protected void actionPerformedBtnRetirarSaldo(ActionEvent arg0) {
		if (!this.btnRetirarSaldo.isSelected()) {
			panelRetiraSaldo.setName("panelRetiraSaldo");

			this.btnConsultarSaldo.setSelected(false);
			this.btnRetirarSaldo.setSelected(true);
			this.btnDepositarSaldo.setSelected(false);
			this.btnMovimientosSaldo.setSelected(false);

			panelsSlider.setPanelSlider(1, panelRetiraSaldo, DIRECT.RIGHT);

		}
	}

	protected void actionPerformedBtnDepositarSaldo(ActionEvent arg0) {
		if (!this.btnDepositarSaldo.isSelected()) {
			panelDepositarSaldo.setName("panelDepositarSaldo");

			this.btnConsultarSaldo.setSelected(false);
			this.btnRetirarSaldo.setSelected(false);
			this.btnDepositarSaldo.setSelected(true);
			this.btnMovimientosSaldo.setSelected(false);

			panelsSlider.setPanelSlider(1, panelDepositarSaldo, DIRECT.RIGHT);

		}
	}

	protected void actionPerformedBtnSalir(ActionEvent arg0) {
		int ok = confirmacionDeSalida();	
		if (ok == 0)
			System.exit(0);
	}
	public int confirmacionDeSalida() {
		return JOptionPane.showConfirmDialog(this,
			   "¿ Desea salir del programa ?",
			   "Cajero Automatico", 0, 3, null);
	}

	protected void actionPerformedBtnNewButton_3(ActionEvent arg0) {

		if (!this.btnMovimientosSaldo.isSelected()) {
			panelMovimientos.setName("panelMovimientos");

			this.btnConsultarSaldo.setSelected(false);
			this.btnRetirarSaldo.setSelected(false);
			this.btnDepositarSaldo.setSelected(false);
			this.btnMovimientosSaldo.setSelected(true);

			panelsSlider.setPanelSlider(1, panelMovimientos, DIRECT.RIGHT);

		}
	}

	// --------------DEPOSITAR SOLES-----------------------
	protected void actionPerformedBtnDepositarSoles(ActionEvent arg0) {
		int ok = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
		if (ok == 0) {
			Resultado();
			txtNro.setText("" + CodigoCorrelativo());

		} else {
			JOptionPane.showMessageDialog(null, "Deposito cancelado");
			txtSaldoSoles.setText("");
		}

	}

	public void Resultado() {
		Object obj[] = new Object[3];
		obj[0] = txtNro.getText();
		obj[1] = VariableFecha.format(fecha.getDate());

		saldo = Integer.parseInt(txtSaldoSoles.getText());

		obj[2] = saldo;

		modelo.addRow(obj);
		limpiar();
		SumarColumna();
		JOptionPane.showMessageDialog(null, "Se a depositado S/ " + saldo);

	}

	private void SumarColumna() {
		int fila = 0;
		int n1 = 0;
		for (int i = 0; i < tabla.getRowCount(); i++) {
			fila = Integer.parseInt(tabla.getValueAt(i, 2).toString());
			n1 += fila;
		}
		lblSaldo.setText("" + n1);

	}

	public int CodigoCorrelativo() {
		int tamaño = Integer.parseInt(txtNro.getText());
		if (tamaño == 0)
			return 50001;
		else
			return tamaño + 1;
	}

	void limpiar() {
		txtSaldoSoles.setText("");
		txtRestarCantidad.setText("");
	}

	// ---------------------RETIRAR MONTO------------------
	protected void actionPerformedBtnRetirarMonto(ActionEvent arg0) {

		saldo = Integer.parseInt("-" + txtRestarCantidad.getText());
		int SaldoActual = Integer.parseInt("" + lblSaldo.getText());

		if (SaldoActual >= -saldo) {
			int ok = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
			if (ok == 0) {
				Resultado2();
				txtNro.setText("" + CodigoCorrelativo());
			} else {
				JOptionPane.showMessageDialog(null, "Deposito cancelado");
				txtRestarCantidad.setText("");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente");
		}
	}

	public void Resultado2() {
		Object obj[] = new Object[3];
		obj[0] = txtNro.getText();
		obj[1] = VariableFecha.format(fecha.getDate());

		saldo = Integer.parseInt("-" + txtRestarCantidad.getText());

		obj[2] = saldo;

		modelo.addRow(obj);
		limpiar();
		RestarColumna();
		JOptionPane.showMessageDialog(null, "Se a retirado S/ " + saldo);
	}

	private void RestarColumna() {

		int fila = 0;
		int nr1 = 0;
		for (int i = 0; i < tabla.getRowCount(); i++) {
			fila = Integer.parseInt(tabla.getValueAt(i, 2).toString());
			nr1 += fila;
		}
		lblSaldo.setText("" + nr1);
	}

	protected void actionPerformedBtn100soles(ActionEvent arg0) {

		int soles = -100;
		int SaldoActual = Integer.parseInt("" + lblSaldo.getText());

		if (SaldoActual >= -soles) {

			int ok = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
			if (ok == 0) {

				int n1;
				Object obj[] = new Object[3];
				obj[0] = txtNro.getText();
				obj[1] = VariableFecha.format(fecha.getDate());
				obj[2] = soles;

				modelo.addRow(obj);
				limpiar();
				RestarColumna();
				JOptionPane.showMessageDialog(null, "Se a retirado S/100.00");

			} else {

			}
		} else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente");
		}

		txtNro.setText("" + CodigoCorrelativo());
	}

	protected void actionPerformedBtn500soles(ActionEvent arg0) {

		int soles = -500;

		int SaldoActual = Integer.parseInt("" + lblSaldo.getText());

		if (SaldoActual >= -soles) {
			int ok = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
			if (ok == 0) {
				int n1;
				Object obj[] = new Object[3];
				obj[0] = txtNro.getText();
				obj[1] = VariableFecha.format(fecha.getDate());
				obj[2] = soles;

				modelo.addRow(obj);
				limpiar();
				RestarColumna();
				JOptionPane.showMessageDialog(null, "Se a retirado S/500.00");
			} else {

			}
		} else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente misio de Mierd@");
		}

		txtNro.setText("" + CodigoCorrelativo());

	}

	protected void actionPerformedBtn900soles(ActionEvent arg0) {

		int soles = -900;

		int SaldoActual = Integer.parseInt("" + lblSaldo.getText());

		if (SaldoActual >= -soles) {
			int ok = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
			if (ok == 0) {
				int n1;
				Object obj[] = new Object[3];
				obj[0] = txtNro.getText();
				obj[1] = VariableFecha.format(fecha.getDate());
				obj[2] = soles;

				modelo.addRow(obj);
				limpiar();
				RestarColumna();
				JOptionPane.showMessageDialog(null, "Se a retirado S/900.00");
			} else {

			}
		} else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente misio de Mierd@");
		}
		txtNro.setText("" + CodigoCorrelativo());
	}

}
