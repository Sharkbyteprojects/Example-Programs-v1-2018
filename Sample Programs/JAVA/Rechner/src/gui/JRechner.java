package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class JRechner extends JFrame {

	private JPanel contentPane;
	private JTextField txtOperator;
	private JTextField textoerator;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRechner frame = new JRechner();
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
	public JRechner() {
		setType(Type.UTILITY);
		setIconImage(Toolkit.getDefaultToolkit().getImage(JRechner.class.getResource("/icon/Icon.ico")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.BLUE);
		setForeground(Color.BLUE);
		setTitle("Rechner");
		setResizable(false);
		setBounds(100, 100, 209, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[][][][grow][][][][][][]"));
		
		JLabel lblOperator = new JLabel("Operator 1");
		contentPane.add(lblOperator, "cell 0 0");
		
		txtOperator = new JTextField();
		txtOperator.setToolTipText("Operator 1");
		contentPane.add(txtOperator, "cell 0 1,grow");
		txtOperator.setColumns(10);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("+");
				double opera, operb, ergb;
				opera =  Double.parseDouble(txtOperator.getText());
				operb =  Double.parseDouble(textoerator.getText());
				ergb = opera + operb;
				textField.setText(String.valueOf(ergb));
			}
		});
		contentPane.add(plus, "flowx,cell 0 2,alignx center");
		
		JLabel lblOperator_1 = new JLabel("Operator 2");
		contentPane.add(lblOperator_1, "cell 0 3");
		
		textoerator = new JTextField();
		textoerator.setForeground(Color.BLACK);
		textoerator.setToolTipText("Operator 2");
		contentPane.add(textoerator, "cell 0 4,grow");
		textoerator.setColumns(10);
		
		JLabel lblErgebnis = new JLabel("Ergebnis:");
		lblErgebnis.setToolTipText("Ergebnis");
		lblErgebnis.setForeground(Color.BLUE);
		contentPane.add(lblErgebnis, "cell 0 5");
		
		textField = new JTextField();
		textField.setToolTipText("Ergebnis");
		textField.setForeground(Color.BLUE);
		contentPane.add(textField, "cell 0 6,growx,aligny center");
		textField.setColumns(10);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("-");
				double opera, operb, ergb;
				opera =  Double.parseDouble(txtOperator.getText());
				operb =  Double.parseDouble(textoerator.getText());
				ergb = opera - operb;
				textField.setText(String.valueOf(ergb));
			}
		});
		contentPane.add(minus, "cell 0 2,alignx center");
		
		JButton geteilt = new JButton("/");
		geteilt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("/");
				double opera, operb, ergb;
				opera =  Double.parseDouble(txtOperator.getText());
				operb =  Double.parseDouble(textoerator.getText());
				ergb = opera / operb;
				textField.setText(String.valueOf(ergb));
			}
		});
		contentPane.add(geteilt, "cell 0 2,alignx center,aligny center");
		
		JButton mal = new JButton("x");
		mal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("x");
				double opera, operb, ergb;
				opera =  Double.parseDouble(txtOperator.getText());
				operb =  Double.parseDouble(textoerator.getText());
				ergb = opera * operb;
				textField.setText(String.valueOf(ergb));
			}
		});
		contentPane.add(mal, "cell 0 2,alignx center");
		
		JButton btnBeenden_1 = new JButton("Beenden");
		btnBeenden_1.setForeground(Color.RED);
		btnBeenden_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Beendet");
				System.exit(0);
			}
		});
		contentPane.add(btnBeenden_1, "cell 0 7,alignx center,aligny center");
	}

}
