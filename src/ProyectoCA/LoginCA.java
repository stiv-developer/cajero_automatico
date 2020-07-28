package ProyectoCA;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class LoginCA extends JDialog implements ActionListener, KeyListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnSalir;
	private JTextField txtNroTarjeta;
	private JButton btnNewButton;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JTextField txtNroTarjeta02;
	private JTextField txtNroTarjeta03;
	private JLabel label;
	private JLabel label_1;
	private JButton btnEliminarTexto;
	private JButton btn0;
	private JPasswordField txtClave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LoginCA dialog = new LoginCA();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			dialog.setLocationRelativeTo(null);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LoginCA() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginCA.class.getResource("/img/pngocean.com.png")));
		setResizable(false);

		this.setLocationRelativeTo(null);
		setUndecorated(true);

		setBounds(100, 100, 384, 704);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 384, 704);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);

		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(LoginCA.class.getResource("/img/baseline_close_white_18dp.png")));
		btnSalir.setForeground(new Color(255, 255, 255));
		btnSalir.setBackground(new Color(0, 0, 0));
		btnSalir.addActionListener(this);
		btnSalir.setBounds(323, 11, 52, 45);
		panel_1.add(btnSalir);

		JLabel lblBienvenido = new JLabel("BIENVENIDO a");
		lblBienvenido.setFont(new Font("DialogInput", Font.PLAIN, 23));
		lblBienvenido.setBounds(77, 11, 240, 50);
		panel_1.add(lblBienvenido);

		JLabel lblCajeroAutomatico = new JLabel("CAJERO AUTOMATICO");
		lblCajeroAutomatico.setFont(new Font("DialogInput", Font.PLAIN, 23));
		lblCajeroAutomatico.setBounds(59, 54, 316, 50);
		panel_1.add(lblCajeroAutomatico);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 130, 365, 2);
		panel_1.add(separator);

		JLabel lblIngrese = new JLabel("Numero de Targeta");
		lblIngrese.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblIngrese.setBounds(59, 173, 192, 23);
		panel_1.add(lblIngrese);

		JLabel lblClaveDeTargeta = new JLabel("Clave de Targeta");
		lblClaveDeTargeta.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblClaveDeTargeta.setBounds(59, 262, 192, 23);
		panel_1.add(lblClaveDeTargeta);

		txtNroTarjeta = new JTextField();
		txtNroTarjeta.addKeyListener(this);
		txtNroTarjeta.setBounds(59, 207, 75, 32);
		panel_1.add(txtNroTarjeta);
		txtNroTarjeta.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(59, 356, 269, 242);
		panel_1.add(panel);
		panel.setLayout(null);

		btn1 = new JButton("1");
		btn1.addActionListener(this);
		btn1.setBackground(new Color(255, 255, 255));
		btn1.setFont(new Font("Dialog", Font.BOLD, 13));
		btn1.setBounds(10, 11, 66, 46);
		panel.add(btn1);

		btn2 = new JButton("2");
		btn2.addActionListener(this);
		btn2.setBackground(new Color(255, 255, 255));
		btn2.setFont(new Font("Dialog", Font.BOLD, 13));
		btn2.setBounds(103, 11, 66, 46);
		panel.add(btn2);

		btn3 = new JButton("3");
		btn3.addActionListener(this);
		btn3.setBackground(new Color(255, 255, 255));
		btn3.setFont(new Font("Dialog", Font.BOLD, 13));
		btn3.setBounds(193, 11, 66, 46);
		panel.add(btn3);

		btn4 = new JButton("4");
		btn4.addActionListener(this);
		btn4.setBackground(new Color(255, 255, 255));
		btn4.setFont(new Font("Dialog", Font.BOLD, 13));
		btn4.setBounds(10, 68, 66, 46);
		panel.add(btn4);

		btn5 = new JButton("5");
		btn5.addActionListener(this);
		btn5.setBackground(new Color(255, 255, 255));
		btn5.setFont(new Font("Dialog", Font.BOLD, 13));
		btn5.setBounds(103, 68, 66, 46);
		panel.add(btn5);

		btn6 = new JButton("6");
		btn6.addActionListener(this);
		btn6.setBackground(new Color(255, 255, 255));
		btn6.setFont(new Font("Dialog", Font.BOLD, 13));
		btn6.setBounds(193, 68, 66, 46);
		panel.add(btn6);

		btn7 = new JButton("7");
		btn7.addActionListener(this);
		btn7.setBackground(new Color(255, 255, 255));
		btn7.setFont(new Font("Dialog", Font.BOLD, 13));
		btn7.setBounds(10, 125, 66, 46);
		panel.add(btn7);

		btn8 = new JButton("8");
		btn8.addActionListener(this);
		btn8.setBackground(new Color(255, 255, 255));
		btn8.setFont(new Font("Dialog", Font.BOLD, 13));
		btn8.setBounds(103, 125, 66, 46);
		panel.add(btn8);

		btn9 = new JButton("9");
		btn9.addActionListener(this);
		btn9.setBackground(new Color(255, 255, 255));
		btn9.setFont(new Font("Dialog", Font.BOLD, 13));
		btn9.setBounds(193, 125, 66, 46);
		panel.add(btn9);

		btnEliminarTexto = new JButton("Borrar");
		btnEliminarTexto.addActionListener(this);
		btnEliminarTexto.setForeground(new Color(255, 255, 255));
		btnEliminarTexto.setFont(new Font("Dialog", Font.BOLD, 13));
		btnEliminarTexto.setBackground(new Color(255, 0, 0));
		btnEliminarTexto.setBounds(100, 182, 159, 46);
		panel.add(btnEliminarTexto);

		btn0 = new JButton("0");
		btn0.addActionListener(this);
		btn0.setFont(new Font("Dialog", Font.BOLD, 13));
		btn0.setBackground(Color.WHITE);
		btn0.setBounds(10, 182, 66, 46);
		panel.add(btn0);

		btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(this);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 17));
		btnNewButton.setBounds(24, 635, 331, 50);
		panel_1.add(btnNewButton);

		txtNroTarjeta02 = new JTextField();
		txtNroTarjeta02.addKeyListener(this);
		txtNroTarjeta02.setColumns(10);
		txtNroTarjeta02.setBounds(165, 207, 75, 32);
		panel_1.add(txtNroTarjeta02);

		txtNroTarjeta03 = new JTextField();
		txtNroTarjeta03.addKeyListener(this);
		txtNroTarjeta03.setColumns(10);
		txtNroTarjeta03.setBounds(269, 207, 75, 32);
		panel_1.add(txtNroTarjeta03);

		label = new JLabel("-");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(131, 207, 35, 32);
		panel_1.add(label);

		label_1 = new JLabel("-");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(238, 207, 35, 32);
		panel_1.add(label_1);

		txtClave = new JPasswordField();
		txtClave.setEditable(false);
		txtClave.setBounds(59, 296, 269, 32);
		panel_1.add(txtClave);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(LoginCA.class.getResource("/img/baseline_security_black_24dp.png")));
		lblNewLabel.setBounds(10, 11, 61, 50);
		panel_1.add(lblNewLabel);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEliminarTexto) {
			actionPerformedBtnEliminarTexto(arg0);
		}
		if (arg0.getSource() == btn0) {
			actionPerformedBtn0(arg0);
		}
		if (arg0.getSource() == btn9) {
			actionPerformedBtn9(arg0);
		}
		if (arg0.getSource() == btn8) {
			actionPerformedBtn8(arg0);
		}
		if (arg0.getSource() == btn7) {
			actionPerformedBtn7(arg0);
		}
		if (arg0.getSource() == btn6) {
			actionPerformedBtn6(arg0);
		}
		if (arg0.getSource() == btn5) {
			actionPerformedBtn5(arg0);
		}
		if (arg0.getSource() == btn4) {
			actionPerformedBtn4(arg0);
		}
		if (arg0.getSource() == btn3) {
			actionPerformedBtn3(arg0);
		}
		if (arg0.getSource() == btn2) {
			actionPerformedBtn2(arg0);
		}
		if (arg0.getSource() == btn1) {
			actionPerformedBtn1(arg0);
		}
		if (arg0.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(arg0);
		}
		if (arg0.getSource() == btnSalir) {
			actionPerformedBtnSalir(arg0);
		}
	}

	protected void actionPerformedBtnSalir(ActionEvent arg0) {
		dispose();
	}

	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
		String nro, nro2, nro3, clave;

		nro = txtNroTarjeta.getText();
		nro2 = txtNroTarjeta02.getText();
		nro3 = txtNroTarjeta03.getText();
		clave = txtClave.getText();

		if (nro.equals("1234") && nro2.equals("5678") && nro3.equals("9123") && clave.equals("12345678910")) {
			Menu MnGlobal = new Menu();
			MnGlobal.setLocationRelativeTo(this);
			MnGlobal.setVisible(true);
			dispose();
		} else {
			JOptionPane.showMessageDialog(null, "Numero de targeta o Clave Incorrecto");
		}

	}

	protected void actionPerformedBtn1(ActionEvent arg0) {
		this.txtClave.setText(this.txtClave.getText() + "1");
	}

	protected void actionPerformedBtn2(ActionEvent arg0) {
		this.txtClave.setText(this.txtClave.getText() + "2");
	}

	protected void actionPerformedBtn3(ActionEvent arg0) {
		this.txtClave.setText(this.txtClave.getText() + "3");
	}

	protected void actionPerformedBtn4(ActionEvent arg0) {
		this.txtClave.setText(this.txtClave.getText() + "4");
	}

	protected void actionPerformedBtn5(ActionEvent arg0) {
		this.txtClave.setText(this.txtClave.getText() + "5");
	}

	protected void actionPerformedBtn6(ActionEvent arg0) {
		this.txtClave.setText(this.txtClave.getText() + "6");
	}

	protected void actionPerformedBtn7(ActionEvent arg0) {
		this.txtClave.setText(this.txtClave.getText() + "7");
	}

	protected void actionPerformedBtn8(ActionEvent arg0) {
		this.txtClave.setText(this.txtClave.getText() + "8");
	}

	protected void actionPerformedBtn9(ActionEvent arg0) {
		this.txtClave.setText(this.txtClave.getText() + "9");
	}

	protected void actionPerformedBtn0(ActionEvent arg0) {
		this.txtClave.setText(this.txtClave.getText() + "0");
	}

	protected void actionPerformedBtnEliminarTexto(ActionEvent arg0) {
		txtClave.setText("");
	}

	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent arg0) {
	}
	public void keyTyped(KeyEvent arg0) {
		if (arg0.getSource() == txtNroTarjeta03) {
			keyTypedTxtNroTarjeta03(arg0);
		}
		if (arg0.getSource() == txtNroTarjeta02) {
			keyTypedTxtNroTarjeta02(arg0);
		}
		if (arg0.getSource() == txtNroTarjeta) {
			keyTypedTxtNroTarjeta(arg0);
		}
	}
	protected void keyTypedTxtNroTarjeta(KeyEvent arg0) {
		char car = arg0.getKeyChar();
        if((car<'0' || car>'9')) arg0.consume();
	}
	protected void keyTypedTxtNroTarjeta02(KeyEvent arg0) {
		char car = arg0.getKeyChar();
        if((car<'0' || car>'9')) arg0.consume();
	}
	protected void keyTypedTxtNroTarjeta03(KeyEvent arg0) {
		char car = arg0.getKeyChar();
        if((car<'0' || car>'9')) arg0.consume();
	}
}
