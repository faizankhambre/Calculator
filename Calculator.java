package com.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setForeground(Color.BLACK);
		frmCalculator.setFont(new Font("Arial Black", Font.BOLD, 15));
		frmCalculator.setTitle("Calculator");
		frmCalculator.setForeground(Color.WHITE);
		frmCalculator.setBackground(Color.WHITE);
		frmCalculator.setBounds(100, 100, 258, 370);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 10, 220, 35);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		// -------------- ROW ONE -----------------
		JButton btnBack = new JButton("B");
		btnBack.setBackground(Color.BLUE);
		btnBack.setForeground(Color.WHITE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String backspace = null;
				
				if(textField.getText().length() > 0)
				{
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1 );
					backspace = strB.toString();
					textField.setText(backspace);
				}	
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(10, 54, 50, 50);
		frmCalculator.getContentPane().add(btnBack);
				
		JButton btnClear = new JButton("C");
		btnClear.setBackground(Color.RED);
		btnClear.setForeground(Color.WHITE);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(65, 54, 50, 50);
		frmCalculator.getContentPane().add(btnClear);
				
		JButton btnPer = new JButton("%");
		btnPer.setForeground(Color.WHITE);
		btnPer.setBackground(Color.DARK_GRAY);
		btnPer.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) 
			{
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPer.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPer.setBounds(120, 54, 58, 50);
		frmCalculator.getContentPane().add(btnPer);
				
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(Color.ORANGE);
		btnPlus.setForeground(Color.WHITE);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(183, 54, 50, 50);
		frmCalculator.getContentPane().add(btnPlus);
		
		// -------------- ROW TWO -----------------
		JButton btn7 = new JButton("7");
		btn7.setForeground(Color.WHITE);
		btn7.setBackground(Color.DARK_GRAY);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String enterNumber = textField.getText() + btn7.getText();
				textField.setText(enterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 110, 50, 50);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(Color.WHITE);
		btn8.setBackground(Color.DARK_GRAY);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String enterNumber = textField.getText() + btn8.getText();
				textField.setText(enterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(65, 110, 50, 50);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(Color.WHITE);
		btn9.setBackground(Color.DARK_GRAY);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String enterNumber = textField.getText() + btn9.getText();
				textField.setText(enterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(120, 110, 58, 50);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.setBackground(Color.ORANGE);
		btnSub.setForeground(Color.WHITE);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(183, 110, 50, 50);
		frmCalculator.getContentPane().add(btnSub);
		
		// -------------- ROW THREE -----------------
		JButton btn4 = new JButton("4");
		btn4.setForeground(Color.WHITE);
		btn4.setBackground(Color.DARK_GRAY);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String enterNumber = textField.getText() + btn4.getText();
				textField.setText(enterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 165, 50, 50);
		frmCalculator.getContentPane().add(btn4);
				
		JButton btn5 = new JButton("5");
		btn5.setForeground(Color.WHITE);
		btn5.setBackground(Color.DARK_GRAY);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String enterNumber = textField.getText() + btn5.getText();
				textField.setText(enterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(65, 165, 50, 50);
		frmCalculator.getContentPane().add(btn5);
				
		JButton btn6 = new JButton("6");
		btn6.setForeground(Color.WHITE);
		btn6.setBackground(Color.DARK_GRAY);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String enterNumber = textField.getText() + btn6.getText();
				textField.setText(enterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(120, 165, 58, 50);
		frmCalculator.getContentPane().add(btn6);
				
		JButton btnMult = new JButton("*");
		btnMult.setBackground(Color.ORANGE);
		btnMult.setForeground(Color.WHITE);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMult.setBounds(183, 165, 50, 50);
		frmCalculator.getContentPane().add(btnMult);
		
		// -------------- ROW FOUR -----------------
		JButton btn1 = new JButton("1");
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.DARK_GRAY);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String enterNumber = textField.getText() + btn1.getText();
				textField.setText(enterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 220, 50, 50);
		frmCalculator.getContentPane().add(btn1);
				
		JButton btn2 = new JButton("2");
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(Color.DARK_GRAY);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String enterNumber = textField.getText() + btn2.getText();
				textField.setText(enterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(65, 220, 50, 50);
		frmCalculator.getContentPane().add(btn2);
				
		JButton btn3 = new JButton("3");
		btn3.setForeground(Color.WHITE);
		btn3.setBackground(Color.DARK_GRAY);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String enterNumber = textField.getText() + btn3.getText();
				textField.setText(enterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(120, 220, 58, 50);
		frmCalculator.getContentPane().add(btn3);
				
		JButton btnDiv = new JButton("/");
		btnDiv.setBackground(Color.ORANGE);
		btnDiv.setForeground(Color.WHITE);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(183, 220, 50, 50);
		frmCalculator.getContentPane().add(btnDiv);
		
		// -------------- ROW FIVE -----------------
		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.WHITE);
		btn0.setBackground(Color.DARK_GRAY);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String enterNumber = textField.getText() + btn0.getText();
				textField.setText(enterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 275, 50, 50);
		frmCalculator.getContentPane().add(btn0);
				
		JButton btnDot = new JButton(".");
		btnDot.setForeground(Color.WHITE);
		btnDot.setBackground(Color.DARK_GRAY);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(! textField.getText().contains("."))
		          {
					textField.setText(textField.getText() + btnDot.getText());
		          }
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(65, 275, 50, 50);
		frmCalculator.getContentPane().add(btnDot);
				
		JButton btnPM = new JButton("+-");
		btnPM.setForeground(Color.WHITE);
		btnPM.setBackground(Color.DARK_GRAY);
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPM.setBounds(120, 275, 58, 50);
		frmCalculator.getContentPane().add(btnPM);
				
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(Color.ORANGE);
		btnEqual.setForeground(Color.WHITE);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if(operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(183, 275, 50, 50);
		frmCalculator.getContentPane().add(btnEqual);
	}
}
