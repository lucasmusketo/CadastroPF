package aula;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CadastroPF extends JFrame{
	
	JLabel  lblNome   = new JLabel ("Nome");
	JTextField txtNome = new JTextField();
	
	JLabel  lblEnd   = new JLabel ("Endereço");
	JTextField txtEnd = new JTextField();
	
	JLabel  lblBairro   = new JLabel ("Bairro");
	JTextField txtBairro = new JTextField();
	
	JLabel  lblCEP   = new JLabel ("CEP");
	JTextField txtCEP = new JTextField();
	
	JLabel  lblCid   = new JLabel ("Cidade");
	JTextField txtCid = new JTextField();
	
	JLabel  lblEst   = new JLabel ("Estado");
	JTextField txtEst = new JTextField();
	
	JLabel  lblTel   = new JLabel ("Telefone");
	JTextField txtTel = new JTextField();
	
	JLabel  lblCel   = new JLabel ("Celular");
	JTextField txtCel = new JTextField();
	
	JLabel  lblSex   = new JLabel ("Sexo");
	JTextField txtSex = new JTextField();
	
	JLabel  lblRg   = new JLabel ("RG");
	JTextField txtRg = new JTextField();
	
	JLabel  lblCPF   = new JLabel ("CPF");
	JTextField txtCPF = new JTextField();
	
	private JRadioButton masculino,feminino;
	
	public CadastroPF(){
		super("Cadastro de Pesssoa Fisica");
		
		 Container paine = this.getContentPane();
		 this.setLayout(null); 
		 
		 paine.add(lblNome);
		 lblNome.setBounds(20,20,245,40);
		 paine.add(txtNome);
		 txtNome.setBounds(80,25,150,25);
		 
		 paine.add(lblEnd);
		 lblEnd.setBounds(20,70,245,40);
		 paine.add(txtEnd);
		 txtEnd.setBounds(80,75,150,25);
		 
		 paine.add(lblBairro);
		 lblBairro.setBounds(20,125,245,40);
		 paine.add(txtBairro);
		 txtBairro.setBounds(80,130,150,25);
		 
		 paine.add(lblCEP);
		 lblCEP.setBounds(20,175,245,40);
		 paine.add(txtCEP);
		 txtCEP.setBounds(80,180,150,25);
		 
		 paine.add(lblCid);
		 lblCid.setBounds(20,225,245,40);
		 paine.add(txtCid);
		 txtCid.setBounds(80,230,150,25);
		 
		 paine.add(lblEst);
		 lblEst.setBounds(20,275,245,40);
		 paine.add(txtEst);
		 txtEst.setBounds(80,275,150,25);
		 
		 paine.add(lblTel);
		 lblTel.setBounds(20,325,245,40);
		 paine.add(txtTel);
		 txtTel.setBounds(80,330,150,25);
		 
		 paine.add(lblCel);
		 lblCel.setBounds(20,375,245,40);
		 paine.add(txtCel);
		 txtCel.setBounds(80,380,150,25);
		 
		 paine.add(lblSex);
		 lblSex.setBounds(20,425,245,40);
		 paine.add(txtSex);
		 masculino = new JRadioButton("Masculino", false);
		 feminino = new JRadioButton("Feminino", false);
		 paine.add(masculino);
		 masculino.setBounds(80,430,120,25);
		 paine.add(feminino);
		 feminino.setBounds(200,430,300,25);
		 
		 paine.add(lblRg);
		 lblRg.setBounds(20,470,245,40);
		 paine.add(txtRg);
		 txtRg.setBounds(80,475,150,25);
		 
		
	
		 this.setVisible(true); 
		 this.setSize(600,800);
		 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main (String args[]){
		CadastroPF CadPF = new CadastroPF();
	}
}