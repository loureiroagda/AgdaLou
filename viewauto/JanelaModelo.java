package viewauto;

import controleauto.ControleJanelaModelo;

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

public class JanelaModelo extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextField textModelo;
    private ControleJanelaModelo cjm = new ControleJanelaModelo();
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
            	
            	try {
            		
            		JanelaModelo frame = new JanelaModelo();
            		frame.setVisible(true);	
            	}catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    
    
    public JanelaModelo()
    {
    	
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblCadastroDeModelo = new JLabel("Cadastro do Modelo");
        lblCadastroDeModelo.setFont(new Font("Arial", Font.BOLD, 14));
        lblCadastroDeModelo.setBounds(40, 11, 198, 24);
        contentPane.add(lblCadastroDeModelo);
        
        JLabel lblModelo = new JLabel("Modelo:");
        lblModelo.setFont(new Font("Arial", Font.BOLD, 12));
        lblModelo.setBounds(10, 50, 45, 14);
        contentPane.add(lblModelo); 
        
        
        textModelo = new JTextField();
        textModelo.setBounds(55, 46, 46, 20);
        textModelo.setColumns(10);
        textModelo.setSize(150, 20);
        contentPane.add(textModelo);
        
        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(90,280,100,25);
        
        
        btnCadastrar.addActionListener(new ActionListener() 
        {
        	
        	public void actionPerformed(ActionEvent e) 
        	{
        		String modelo = textModelo.getText();
        		
        		
        		cjm.incluirModelo(modelo);
        		
        		JOptionPane.showMessageDialog(null,
                        "Automóvel cadastrado com sucesso!");
        		
        		textModelo.setText("");
        		
        	}
        });
        	
            
        contentPane.add(btnCadastrar);
        
    }

}
