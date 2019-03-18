package Kalkulator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class Kalkulator {

	public JFrame frame2;
	private JTextField txtPrikaz;
	double prviBroj;
	double drugiBroj;
	double rezultat;
	String odgovor;
	String operacije;
	
	//Nebitno, samo primer izmene
	//Kao nesto menjamo itd itd

	/**
	 * Create the application.
	 */
	public Kalkulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame2 = new JFrame();
		frame2.getContentPane().setBackground(Color.BLACK);
		frame2.setBounds(100, 100, 279, 513);
		frame2.setLocationRelativeTo(null);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		frame2.setResizable(false);

		txtPrikaz = new JTextField();
		txtPrikaz.setBackground(Color.WHITE);
		txtPrikaz.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char slovo = e.getKeyChar();
				if(((slovo < '0') || slovo > '9') && (slovo != KeyEvent.VK_BACK_SPACE) && slovo != '.') {	
					e.consume();	
				}
				else if(txtPrikaz.getText().length() > 10) {
					e.consume();
				}		
				if(slovo == '+') {
					prviBroj = Double.parseDouble(txtPrikaz.getText());
					txtPrikaz.setText("");
					operacije = "+";
				}
				else if(slovo == '-') {
					prviBroj = Double.parseDouble(txtPrikaz.getText());
					txtPrikaz.setText("");
					operacije = "-";
				}
				else if(slovo == '/') {
					prviBroj = Double.parseDouble(txtPrikaz.getText());
					txtPrikaz.setText("");
					operacije = "/";
				}
				else if(slovo == '*') {
					prviBroj = Double.parseDouble(txtPrikaz.getText());
					txtPrikaz.setText("");
					operacije = "*";
				}
				else if(slovo == KeyEvent.VK_ENTER){
					drugiBroj = Double.parseDouble(txtPrikaz.getText());
					if(operacije == "+") {
						rezultat = prviBroj + drugiBroj;
						odgovor = String.format("%.2f", rezultat);
						txtPrikaz.setText(odgovor);
					}
					else if(operacije == "-") {
						rezultat = prviBroj - drugiBroj;
						odgovor = String.format("%.2f", rezultat);
						txtPrikaz.setText(odgovor);
					}
					else if(operacije == "*") {
						rezultat = prviBroj * drugiBroj;
						odgovor = String.format("%.2f", rezultat);
						txtPrikaz.setText(odgovor);
					}
					else if(operacije == "/") {
						rezultat = prviBroj / drugiBroj;
						odgovor = String.format("%.2f", rezultat);
						txtPrikaz.setText(odgovor);
					}
				}
			}			
		});
		txtPrikaz.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtPrikaz.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPrikaz.setBounds(10, 23, 253, 72);
		frame2.getContentPane().add(txtPrikaz);
		txtPrikaz.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(255, 255, 255));
		btn7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unosBroja = txtPrikaz.getText() + btn7.getText();
				txtPrikaz.setText(unosBroja);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn7.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn7.setBounds(13, 190, 55, 59);
		frame2.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(255, 255, 255));
		btn8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unosBroja = txtPrikaz.getText() + btn8.getText();
				txtPrikaz.setText(unosBroja);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn8.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn8.setBounds(78, 190, 55, 59);
		frame2.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(255, 255, 255));
		btn9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unosBroja = txtPrikaz.getText() + btn9.getText();
				txtPrikaz.setText(unosBroja);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn9.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn9.setBounds(143, 190, 55, 59);
		frame2.getContentPane().add(btn9);

		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(255, 255, 255));
		btn4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unosBroja = txtPrikaz.getText() + btn4.getText();
				txtPrikaz.setText(unosBroja);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn4.setBounds(13, 260, 55, 59);
		frame2.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(255, 255, 255));
		btn5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unosBroja = txtPrikaz.getText() + btn5.getText();
				txtPrikaz.setText(unosBroja);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn5.setBounds(78, 260, 55, 59);
		frame2.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(255, 255, 255));
		btn6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unosBroja = txtPrikaz.getText() + btn6.getText();
				txtPrikaz.setText(unosBroja);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn6.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn6.setBounds(143, 260, 55, 59);
		frame2.getContentPane().add(btn6);

		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(255, 255, 255));
		btn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unosBroja = txtPrikaz.getText() + btn1.getText();
				txtPrikaz.setText(unosBroja);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn1.setBounds(13, 330, 55, 59);
		frame2.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(255, 255, 255));
		btn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unosBroja = txtPrikaz.getText() + btn2.getText();
				txtPrikaz.setText(unosBroja);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn2.setBounds(78, 330, 55, 59);
		frame2.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(255, 255, 255));
		btn3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unosBroja = txtPrikaz.getText() + btn3.getText();
				txtPrikaz.setText(unosBroja);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn3.setBounds(143, 330, 55, 59);
		frame2.getContentPane().add(btn3);

		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(255, 255, 255));
		btn0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unosBroja = txtPrikaz.getText() + btn0.getText();
				txtPrikaz.setText(unosBroja);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 28));
		btn0.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn0.setBounds(13, 400, 55, 59);
		frame2.getContentPane().add(btn0);

		JButton btnZarez = new JButton(".");
		btnZarez.setBackground(new Color(255, 255, 255));
		btnZarez.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnZarez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String unosBroja = txtPrikaz.getText() + btnZarez.getText();
				txtPrikaz.setText(unosBroja);
			}
		});
		btnZarez.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnZarez.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnZarez.setBounds(78, 400, 55, 59);
		frame2.getContentPane().add(btnZarez);

		JButton btnJednako = new JButton("=");
		btnJednako.setBackground(new Color(255, 255, 255));
		btnJednako.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnJednako.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drugiBroj = Double.parseDouble(txtPrikaz.getText());
				if(operacije == "+") {
					rezultat = prviBroj + drugiBroj;
					odgovor =  String.format("%.2f" , rezultat);
					txtPrikaz.setText(odgovor);
				}
				else if(operacije == "-") {
					rezultat = prviBroj - drugiBroj;
					odgovor =  String.format("%.2f" , rezultat);
					txtPrikaz.setText(odgovor);
				}
				else if(operacije == "*") {
					rezultat = prviBroj * drugiBroj;
					odgovor =  String.format("%.2f" , rezultat);
					txtPrikaz.setText(odgovor);
				}
				else if(operacije == "/") {
					rezultat = prviBroj / drugiBroj;
					odgovor = String.format("%.2f", rezultat);
					txtPrikaz.setText(odgovor);
				}
			}
		});
		btnJednako.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnJednako.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnJednako.setBounds(208, 330, 55, 129);
		frame2.getContentPane().add(btnJednako);

		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(new Color(255, 255, 255));
		btnPlus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prviBroj = Double.parseDouble(txtPrikaz.getText());
				txtPrikaz.setText("");
				operacije = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnPlus.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnPlus.setBounds(208, 260, 55, 59);
		frame2.getContentPane().add(btnPlus);

		JButton btnBrisi = new JButton("C");
		btnBrisi.setBackground(new Color(255, 255, 255));
		btnBrisi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPrikaz.setText(null);
			}
		});
		btnBrisi.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnBrisi.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBrisi.setBounds(78, 120, 55, 59);
		frame2.getContentPane().add(btnBrisi);

		JButton btnPodeljeno = new JButton("/");
		btnPodeljeno.setBackground(new Color(255, 255, 255));
		btnPodeljeno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

			}
		});
		btnPodeljeno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPodeljeno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prviBroj = Double.parseDouble(txtPrikaz.getText());
				txtPrikaz.setText("");
				operacije = "/";
			}
		});
		btnPodeljeno.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnPodeljeno.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnPodeljeno.setBounds(143, 120, 55, 59);
		frame2.getContentPane().add(btnPodeljeno);

		JButton btnPuta = new JButton("*");
		btnPuta.setBackground(new Color(255, 255, 255));
		btnPuta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prviBroj = Double.parseDouble(txtPrikaz.getText());
				txtPrikaz.setText("");
				operacije = "*";
			}
		});
		btnPuta.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnPuta.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnPuta.setBounds(208, 120, 55, 59);
		frame2.getContentPane().add(btnPuta);

		JButton btnMinus = new JButton("-");
		btnMinus.setBackground(new Color(255, 255, 255));
		btnMinus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prviBroj = Double.parseDouble(txtPrikaz.getText());
				txtPrikaz.setText("");
				operacije = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnMinus.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnMinus.setBounds(208, 190, 55, 59);
		frame2.getContentPane().add(btnMinus);

		JButton btnZnak = new JButton("+-");
		btnZnak.setBackground(new Color(255, 255, 255));
		btnZnak.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnZnak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double znak = Double.parseDouble(String.valueOf(txtPrikaz.getText()));
				znak = znak * (-1);
				txtPrikaz.setText(String.valueOf(znak));
			}
		});
		btnZnak.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnZnak.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnZnak.setBounds(143, 400, 55, 59);
		frame2.getContentPane().add(btnZnak);

		JButton btnBrisiJedan = new JButton("CE");
		btnBrisiJedan.setBackground(new Color(255, 255, 255));
		btnBrisiJedan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBrisiJedan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String brisanje = null;
				if(txtPrikaz.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtPrikaz.getText());
					strB.deleteCharAt(txtPrikaz.getText().length() - 1);
					brisanje = strB.toString();
					txtPrikaz.setText(brisanje);
				}
			}
		});
		btnBrisiJedan.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnBrisiJedan.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBrisiJedan.setBounds(13, 120, 55, 59);
		frame2.getContentPane().add(btnBrisiJedan);
	}
}
