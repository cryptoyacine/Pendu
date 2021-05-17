package pendu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class choix_nom extends attribut{

	private JFrame frame;
	private JTextField textFieldp1;
	private JTextField textFieldp2;
	protected static String jnom1;
	protected static String jnom2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					choix_nom window = new choix_nom();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public choix_nom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 727, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblp1 = new JLabel("Entrer le nom du joueur 1 :");
		lblp1.setBounds(122, 125, 164, 36);
		frame.getContentPane().add(lblp1);
		
		JLabel lblp2 = new JLabel("Entrer le nom du joueur 2 : ");
		lblp2.setBounds(421, 125, 181, 36);
		frame.getContentPane().add(lblp2);
		
		textFieldp1 = new JTextField();
		textFieldp1.setBounds(122, 177, 201, 44);
		frame.getContentPane().add(textFieldp1);
		textFieldp1.setColumns(10);
		
		textFieldp2 = new JTextField();
		textFieldp2.setBounds(421, 175, 181, 48);
		frame.getContentPane().add(textFieldp2);
		textFieldp2.setColumns(10);
	
		model models = new model();
		
		JButton lblvalidernom = new JButton("Valider");
		lblvalidernom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nomp1 = textFieldp1.getText();
				String nomp2 = textFieldp2.getText();

				if (nomp1.equals("") || nomp2.equals("")) {
					JLabel lblerreur = new JLabel("Veuillez entrer des noms pour les deux joueurs");
					lblerreur.setForeground(Color.RED);
					lblerreur.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblerreur.setBounds(237, 232, 279, 31);
					frame.getContentPane().add(lblerreur);
					frame.repaint();


				}
				else {
					
				
			
					choix_motp1 g=new choix_motp1();
					g.run();
					frame.setVisible(false);
					this.dispose();
				}
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		lblvalidernom.setBounds(291, 274, 164, 36);
		frame.getContentPane().add(lblvalidernom);
		
		JLabel lblNewLabel = new JLabel("Bienvenue dans le jeu du pendu");
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getStyle() | Font.BOLD, lblNewLabel.getFont().getSize() + 6f));
		lblNewLabel.setBounds(222, 22, 334, 75);
		frame.getContentPane().add(lblNewLabel);
		
		
		
	}
	public static String jnom1(){
		return jnom1();
	}
	
	public static String jnom2(){
		return jnom2();
	}
}

