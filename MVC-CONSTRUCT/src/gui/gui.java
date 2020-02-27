package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.FileDiretorio;
import modelo.icone;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class gui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton acao;
	private JLabel lblNewLabel;
	private JTextField nome;
	private JLabel lblNewLabel_1;
	private JCheckBox jay;
	private JCheckBox boo;
	private JCheckBox ani;
	private JCheckBox fon;
	private JButton duvi;
	private JLabel lblTenhoXampp;
	private JCheckBox xam;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
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
	public gui() {
		
		icone icon = new icone();
		icon.InserirIcone(this);
		
		setTitle("MVC - Construct");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 0, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		acao = new JButton("CRIAR");
		acao.setFont(new Font("Tahoma", Font.BOLD, 13));
		acao.setForeground(SystemColor.text);
		acao.setBackground(SystemColor.textHighlight);
		acao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					do_acao_actionPerformed(e);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		acao.setBounds(264, 216, 89, 23);
		contentPane.add(acao);
		
		lblNewLabel = new JLabel("Nome do Projeto");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(26, 42, 137, 19);
		lblNewLabel.setBorder(null);
		lblNewLabel.setOpaque(false);
		contentPane.add(lblNewLabel);
		
		nome = new JTextField();
		nome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				try {
					do_nome_keyPressed(e);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		nome.setBounds(162, 43, 387, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Importar Bibliotecas");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(25, 74, 137, 14);
		contentPane.add(lblNewLabel_1);
		
		jay = new JCheckBox("JQuery");
		jay.setFont(new Font("Tahoma", Font.BOLD, 11));
		jay.setForeground(SystemColor.textHighlight);
		jay.setBackground(new Color(102, 0, 204));
		jay.setBounds(26, 107, 118, 23);
		contentPane.add(jay);
		
		boo = new JCheckBox("Bootstrap");
		boo.setFont(new Font("Tahoma", Font.BOLD, 11));
		boo.setForeground(SystemColor.textHighlight);
		boo.setBackground(new Color(102, 0, 204));
		boo.setBounds(26, 133, 118, 23);
		contentPane.add(boo);
		
		ani = new JCheckBox("Animate CSS");
		ani.setFont(new Font("Tahoma", Font.BOLD, 11));
		ani.setForeground(SystemColor.textHighlight);
		ani.setBackground(new Color(102, 0, 204));
		ani.setBounds(26, 159, 118, 23);
		contentPane.add(ani);
		
		fon = new JCheckBox("Font Awesome");
		fon.setFont(new Font("Tahoma", Font.BOLD, 11));
		fon.setForeground(SystemColor.textHighlight);
		fon.setBackground(new Color(102, 0, 204));
		fon.setBounds(26, 185, 118, 23);
		contentPane.add(fon);
		
		
		ImageIcon img1 = new ImageIcon(getClass().getResource("/lib/img.png"));
		duvi = new JButton(img1);
		duvi.setToolTipText("Ajuda");
		duvi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					do_duvi_actionPerformed(e);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		duvi.setBounds(507, 197, 49, 52);
		duvi.setMargin(new Insets(0, 0, 0, 0));
		duvi.setBorder(null);
		duvi.setOpaque(false);
		duvi.setContentAreaFilled(false);
		duvi.setBorderPainted(false);
		contentPane.add(duvi);
		
		lblTenhoXampp = new JLabel("Tenho XAMPP");
		lblTenhoXampp.setForeground(Color.WHITE);
		lblTenhoXampp.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTenhoXampp.setBounds(431, 74, 95, 14);
		contentPane.add(lblTenhoXampp);
		
		xam = new JCheckBox("");
		xam.setBackground(new Color(102, 0, 204));
		xam.setBounds(528, 70, 21, 23);
		contentPane.add(xam);
	}

		protected void do_acao_actionPerformed(ActionEvent e) throws IOException {
		criar();
		}
	
	
		protected void do_duvi_actionPerformed(ActionEvent e) throws IOException {
		 Runtime.getRuntime().exec("cmd.exe /C start iexplore.exe https://github.com/TavioBRMG/MVC-Construtc");
		}
		
		
		protected void do_nome_keyPressed(KeyEvent e) throws IOException {
		
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_ENTER) { 
			Toolkit.getDefaultToolkit().beep();
			if (nome.getText() != "") {
				criar();
			}
		}	
		
	}
	
	public void criar() throws IOException {
		
		FileDiretorio f = new FileDiretorio();
		String n = nome.getText();
		if (!n.equals("")) {

		 boolean X = xam.isSelected();

		 boolean J = jay.isSelected();
		 boolean B = boo.isSelected();
		 boolean A = ani.isSelected();
		 boolean F = fon.isSelected();

		 if (J == true) {
		  f.J1 = 1;
		 }
		 if (B == true) {
		  f.B1 = 1;
		 }
		 if (A == true) {
		  f.A1 = 1;
		 }
		 if (F == true) {
		  f.F1 = 1;
		 }
		 if (X == true) {
		  f.XA = 1;
		 }

		 f.getNome(n);

		 if (X == true) {
		File dir = new File("C:/xampp/htdocs");	
		if(!dir.exists()) {
			JOptionPane.showMessageDialog(null, "Diretório Xampp não encontrado!");
		}else {	 
		  File check = new File("C:/xampp/htdocs/", n);
		  if (check.exists()) {
		   JOptionPane.showMessageDialog(null, "Projeto já existe!");
		  } else {
		   f.exec();
		   JOptionPane.showMessageDialog(null, "Criado com sucesso em Htdocs");
		   nome.setText("");
		  }
		 }}else {
		  File check2 = new File(n);
		  if (check2.exists()) {
		   JOptionPane.showMessageDialog(null, "Projeto já existe!");
		  } else {
		   f.exec();

		   JOptionPane.showMessageDialog(null, "Criado com sucesso no Desktop");
		   nome.setText("");
		  }
		 }
		} else {
		 JOptionPane.showMessageDialog(null, "Campo vázio!");
		}

	}
}
