package Kalkulator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.Cursor;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PocetniProzor {

	public JFrame frame1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PocetniProzor window = new PocetniProzor();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PocetniProzor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.setLocationRelativeTo(null);
		frame1.getContentPane().setBackground(Color.BLACK);
		frame1.getContentPane().setLayout(null);
		frame1.setResizable(false);

		JButton btnPokreni = new JButton("POKRENI");
		btnPokreni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kalkulator kalkJednostavni = new Kalkulator();
				kalkJednostavni.frame2.setVisible(true);
				frame1.dispose();
			}
		});
		btnPokreni.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPokreni.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnPokreni.setBackground(new Color(255, 255, 255));
		btnPokreni.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPokreni.setBounds(137, 189, 126, 66);
		frame1.getContentPane().add(btnPokreni);

		JButton btnPokreni2 = new JButton("POKRENI");
		btnPokreni2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kalkulator2 kalkNapredni = new Kalkulator2();
				kalkNapredni.frame3.setVisible(true);
				frame1.dispose();
			}
		});
		btnPokreni2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPokreni2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPokreni2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnPokreni2.setBackground(Color.WHITE);
		btnPokreni2.setBounds(137, 292, 126, 66);
		frame1.getContentPane().add(btnPokreni2);

		JLabel lblJednostavni = new JLabel("JEDNOSTAVNI:");
		lblJednostavni.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblJednostavni.setForeground(new Color(255, 255, 255));
		lblJednostavni.setBounds(10, 189, 253, 66);
		frame1.getContentPane().add(lblJednostavni);

		JLabel lblNapredni = new JLabel("NAPREDNI:");
		lblNapredni.setForeground(Color.WHITE);
		lblNapredni.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNapredni.setBounds(10, 292, 253, 66);
		frame1.getContentPane().add(lblNapredni);

		JLabel lblAdnanovKalkulator = new JLabel("Adnanov kalkulator");
		lblAdnanovKalkulator.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdnanovKalkulator.setFont(new Font("Playbill", Font.BOLD | Font.ITALIC, 40));
		lblAdnanovKalkulator.setForeground(new Color(255, 0, 0));
		lblAdnanovKalkulator.setBounds(0, 11, 273, 99);
		frame1.getContentPane().add(lblAdnanovKalkulator);

		JLabel lblOdaberiteKalkulator = new JLabel("Odaberite kalkulator:");
		lblOdaberiteKalkulator.setHorizontalAlignment(SwingConstants.CENTER);
		lblOdaberiteKalkulator.setForeground(Color.WHITE);
		lblOdaberiteKalkulator.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
		lblOdaberiteKalkulator.setBounds(0, 84, 273, 99);
		frame1.getContentPane().add(lblOdaberiteKalkulator);
		frame1.setBounds(100, 100, 279, 421);
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setResizable(false);
	}
}
