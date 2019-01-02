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
import javax.swing.JSeparator;

public class Kalkulator2 {

	public JFrame frame3;
	private JTextField txtPrikaz;
	double prviBroj;
	double drugiBroj;
	double rezultat;
	String odgovor;
	String operacije;


	/**
	 * Create the application.
	 */
	public Kalkulator2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame3 = new JFrame();
		frame3.getContentPane().setBackground(Color.BLACK);
		frame3.setBounds(100, 100, 504, 516);
		frame3.setLocationRelativeTo(null);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		frame3.setResizable(false);

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
		txtPrikaz.setBounds(10, 23, 478, 72);
		frame3.getContentPane().add(txtPrikaz);
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
		btn7.setBounds(238, 192, 55, 59);
		frame3.getContentPane().add(btn7);

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
		btn8.setBounds(303, 192, 55, 59);
		frame3.getContentPane().add(btn8);

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
		btn9.setBounds(368, 192, 55, 59);
		frame3.getContentPane().add(btn9);

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
		btn4.setBounds(238, 262, 55, 59);
		frame3.getContentPane().add(btn4);

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
		btn5.setBounds(303, 262, 55, 59);
		frame3.getContentPane().add(btn5);

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
		btn6.setBounds(368, 262, 55, 59);
		frame3.getContentPane().add(btn6);

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
		btn1.setBounds(238, 332, 55, 59);
		frame3.getContentPane().add(btn1);

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
		btn2.setBounds(303, 332, 55, 59);
		frame3.getContentPane().add(btn2);

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
		btn3.setBounds(368, 332, 55, 59);
		frame3.getContentPane().add(btn3);

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
		btn0.setBounds(238, 402, 55, 59);
		frame3.getContentPane().add(btn0);

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
		btnZarez.setBounds(303, 402, 55, 59);
		frame3.getContentPane().add(btnZarez);

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
				else if(operacije == "%") {
					rezultat = prviBroj % drugiBroj;
					odgovor = String.format("%.2f", rezultat);
					txtPrikaz.setText(odgovor);
				}
				else if(operacije == "^") {
					rezultat = Math.pow(prviBroj, drugiBroj);
					odgovor = String.format("%.2f", rezultat);
					txtPrikaz.setText(odgovor);
				}
			}
		});
		btnJednako.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnJednako.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnJednako.setBounds(433, 332, 55, 129);
		frame3.getContentPane().add(btnJednako);

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
		btnPlus.setBounds(433, 262, 55, 59);
		frame3.getContentPane().add(btnPlus);

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
		btnBrisi.setBounds(303, 122, 55, 59);
		frame3.getContentPane().add(btnBrisi);

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
		btnPodeljeno.setBounds(368, 122, 55, 59);
		frame3.getContentPane().add(btnPodeljeno);

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
		btnPuta.setBounds(433, 122, 55, 59);
		frame3.getContentPane().add(btnPuta);

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
		btnMinus.setBounds(433, 192, 55, 59);
		frame3.getContentPane().add(btnMinus);

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
		btnZnak.setBounds(368, 402, 55, 59);
		frame3.getContentPane().add(btnZnak);

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
		btnBrisiJedan.setBounds(238, 122, 55, 59);
		frame3.getContentPane().add(btnBrisiJedan);

		JButton btnProcenat = new JButton("MOD");
		btnProcenat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prviBroj = Double.parseDouble(txtPrikaz.getText());
				txtPrikaz.setText("");
				operacije = "%";
			}
		});
		btnProcenat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProcenat.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnProcenat.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnProcenat.setBackground(Color.WHITE);
		btnProcenat.setBounds(10, 192, 90, 59);
		frame3.getContentPane().add(btnProcenat);

		JButton btnKoren = new JButton("\u221A");
		btnKoren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double koren;
				prviBroj = Double.parseDouble(txtPrikaz.getText());
				koren = Math.sqrt(prviBroj);
				txtPrikaz.setText(String.valueOf(koren));
			}
		});
		btnKoren.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnKoren.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnKoren.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnKoren.setBackground(Color.WHITE);
		btnKoren.setBounds(110, 122, 85, 59);
		frame3.getContentPane().add(btnKoren);

		JButton btnKvadrat = new JButton("^2");
		btnKvadrat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double kvadrat;
				prviBroj = Double.parseDouble(txtPrikaz.getText());
				kvadrat = prviBroj * prviBroj;
				txtPrikaz.setText(String.valueOf(kvadrat));	
			}
		});
		btnKvadrat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnKvadrat.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnKvadrat.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnKvadrat.setBackground(Color.WHITE);
		btnKvadrat.setBounds(10, 122, 90, 59);
		frame3.getContentPane().add(btnKvadrat);

		JButton btnSin = new JButton("SIN");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double sinus;
				prviBroj = Double.parseDouble(txtPrikaz.getText());
				sinus = Math.sin(prviBroj);
				txtPrikaz.setText(String.format("%.4f",sinus));	
			}
		});
		btnSin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnSin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnSin.setBackground(Color.WHITE);
		btnSin.setBounds(110, 192, 85, 59);
		frame3.getContentPane().add(btnSin);

		JButton btnCos = new JButton("COS");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cosinus;
				prviBroj = Double.parseDouble(txtPrikaz.getText());
				cosinus = Math.cos(prviBroj);
				txtPrikaz.setText(String.format("%.4f",cosinus));	
			}
		});
		btnCos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnCos.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnCos.setBackground(Color.WHITE);
		btnCos.setBounds(110, 262, 85, 59);
		frame3.getContentPane().add(btnCos);

		JButton btnTan = new JButton("TAN");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tangens;
				prviBroj = Double.parseDouble(txtPrikaz.getText());
				tangens = Math.tan(prviBroj);
				txtPrikaz.setText(String.format("%.4f",tangens));	
			}
		});
		btnTan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnTan.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnTan.setBackground(Color.WHITE);
		btnTan.setBounds(110, 332, 85, 59);
		frame3.getContentPane().add(btnTan);

		JButton btnCtg = new JButton("CTG");
		btnCtg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cotangens;
				prviBroj = Double.parseDouble(txtPrikaz.getText());
				cotangens = 1.0 / Math.tan(prviBroj);
				txtPrikaz.setText(String.format("%.4f",cotangens));	
			}
		});
		btnCtg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCtg.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnCtg.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnCtg.setBackground(Color.WHITE);
		btnCtg.setBounds(110, 402, 85, 59);
		frame3.getContentPane().add(btnCtg);

		JButton btnExp = new JButton("^x");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prviBroj = Double.parseDouble(txtPrikaz.getText());
				txtPrikaz.setText("");
				operacije = "^";
			}
		});
		btnExp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExp.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnExp.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnExp.setBackground(Color.WHITE);
		btnExp.setBounds(10, 262, 90, 59);
		frame3.getContentPane().add(btnExp);

		JButton btnLog = new JButton("LOG");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double logaritam;
				prviBroj = Double.parseDouble(txtPrikaz.getText());
				logaritam = Math.log(prviBroj);
				txtPrikaz.setText(String.format("%.4f",logaritam));	
			}
		});
		btnLog.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnLog.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLog.setBackground(Color.WHITE);
		btnLog.setBounds(10, 332, 90, 59);
		frame3.getContentPane().add(btnLog);

		JButton btnNazad = new JButton("NAZAD");
		btnNazad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PocetniProzor pp = new PocetniProzor();
				pp.frame1.setVisible(true);
				frame3.dispose();
			}
		});
		btnNazad.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNazad.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNazad.setBackground(Color.WHITE);
		btnNazad.setBounds(10, 402, 90, 59);
		frame3.getContentPane().add(btnNazad);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(215, 122, 13, 340);
		frame3.getContentPane().add(separator);
	}
}
