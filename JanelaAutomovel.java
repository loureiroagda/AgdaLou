package viewauto;

import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controleauto.ControleJanelaAutomovel;

public class JanelaAutomovel extends JFrame 
{
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextField textChassi;
    private JTextField textPlaca;
    private JTextField textRenavam;
    private JTextField textAno;
    private JTextField textComb;
    private JTextField textKm;
    private JTextField textQntPorta;
    private JTextField textCor;
    private JTextField textValorLoc;
    private ControleJanelaAutomovel cja =
            new ControleJanelaAutomovel();
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
            	
            	try {
            		
            		JanelaAutomovel frame = new JanelaAutomovel();
            		frame.setVisible(true);	
            	}catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    
    
    /**
     * Criando Frame
     * */
    
    public JanelaAutomovel()
    {
    	
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblCadastroDeAuto = new JLabel("Cadastro do Automóvel");
        lblCadastroDeAuto.setFont(new Font("Arial", Font.BOLD, 14));
        lblCadastroDeAuto.setBounds(40, 11, 198, 24);
        contentPane.add(lblCadastroDeAuto);
        
        JLabel lblChassi = new JLabel("Chassi:");
        lblChassi.setFont(new Font("Arial", Font.BOLD, 12));
        lblChassi.setBounds(10, 50, 45, 14);
        contentPane.add(lblChassi); 
        
        JLabel lblPlaca = new JLabel("Placa:");
        lblPlaca.setFont(new Font("Arial", Font.BOLD, 12));
        lblPlaca.setBounds(10, 75, 60, 14);
        contentPane.add(lblPlaca); 
        
        JLabel lblRenavam = new JLabel("Renavam:");
        lblRenavam.setFont(new Font("Arial", Font.BOLD, 12));
        lblRenavam.setBounds(10, 100, 75, 14);
        contentPane.add(lblRenavam);
        
        JLabel lblAno = new JLabel("Ano:");
        lblAno.setFont(new Font("Arial", Font.BOLD, 12));
        lblAno.setBounds(10,125,90,14);
        contentPane.add(lblAno);
        
        JLabel lblCombustivel = new JLabel("Combustível:");
        lblCombustivel.setFont(new Font("Arial", Font.BOLD, 12));
        lblCombustivel.setBounds(10,150,105,14);
        contentPane.add(lblCombustivel);
        
        JLabel lblKm = new JLabel("Km:");
        lblKm.setFont(new Font("Arial", Font.BOLD, 12));
        lblKm.setBounds(10,175,120,14);
        contentPane.add(lblKm);
        
        JLabel lblQntPorta = new JLabel("Qnt. Portas:");
        lblQntPorta.setFont(new Font("Arial", Font.BOLD, 12));
        lblQntPorta.setBounds(10,200,135,14);
        contentPane.add(lblQntPorta);
        
        JLabel lblCor = new JLabel("Cor:");
        lblCor.setFont(new Font("Arial", Font.BOLD, 12));
        lblCor.setBounds(10,225,150,14);
        contentPane.add(lblCor);
        
        JLabel lblValorLoc = new JLabel("Valor da Locação:");
        lblValorLoc.setFont(new Font("Arial",Font.BOLD, 12));
        lblValorLoc.setBounds(10,250,165,14);
        contentPane.add(lblValorLoc);
        
        textChassi = new JTextField();
        textChassi.setBounds(55, 46, 46, 20);
        textChassi.setColumns(10);
        textChassi.setSize(150, 20);
        contentPane.add(textChassi);  
        
        textPlaca = new JTextField();
        textPlaca.setBounds(50,73,73,20);
        textPlaca.setColumns(10);
        textPlaca.setSize(60,20);
        contentPane.add(textPlaca);
        
        textRenavam = new JTextField();
        textRenavam.setBounds(70, 96, 96, 20);
        textRenavam.setColumns(10);
        textRenavam.setSize(90,20);
        contentPane.add(textRenavam);
        
        textAno = new JTextField();
        textAno.setBounds(40,122,122,20);
        textAno.setColumns(10);
        textAno.setSize(50,20);
        contentPane.add(textAno);
        
        textComb = new JTextField();
        textComb.setBounds(87,148,148,20);
        textComb.setColumns(10);
        textComb.setSize(90,20);
        contentPane.add(textComb);
        
        textKm = new JTextField();
        textKm.setBounds(40,173,173,20);
        textKm.setColumns(10);
        textKm.setSize(80,20);
        contentPane.add(textKm);
        
        textQntPorta = new JTextField();
        textQntPorta.setBounds(80,198,198,20);
        textQntPorta.setColumns(10);
        textQntPorta.setSize(80,20);
        contentPane.add(textQntPorta);
        
        textCor = new JTextField();
        textCor.setBounds(38,222,222,20);
        textCor.setColumns(10);
        textCor.setSize(100,20);
        contentPane.add(textCor);
        
        textValorLoc = new JTextField();
        textValorLoc.setBounds(115,247,247,20);
        textValorLoc.setColumns(10);
        textValorLoc.setSize(70,20);
        contentPane.add(textValorLoc);
        
        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(90,280,100,25);
        
        btnCadastrar.addActionListener(new ActionListener() 
        {
        	
        	public void actionPerformed(ActionEvent e) 
        	{
        		String chassi = textChassi.getText();
        		int ano = Integer.parseInt(textAno.getText());
        		int km = Integer.parseInt(textKm.getText());
        		int qntPorta = Integer.parseInt(textQntPorta.getText());
        		String placa = textPlaca.getText();
        		int renavam = Integer.parseInt(textRenavam.getText());
        		String combustivel = textComb.getText();
        		String cor = textCor.getText();
        		double valorLoc = Double.parseDouble(textValorLoc.getText());
        		
        		cja.incluirAuto(renavam, chassi, placa, ano, combustivel, km, qntPorta, cor, valorLoc);
        		
        		JOptionPane.showMessageDialog(null,
                        "Automóvel cadastrado com sucesso!");
        		
        		textChassi.setText("");
        		textAno.setText("");
        		textKm.setText("");
        		textQntPorta.setText("");
        		textPlaca.setText("");
        		textRenavam.setText("");
        		textComb.setText("");
        		textCor.setText("");
        		textValorLoc.setText("");
        	}
        });
        	
            
        contentPane.add(btnCadastrar);
       
    }

}
