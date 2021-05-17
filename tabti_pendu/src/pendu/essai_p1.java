package pendu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class essai_p1 {
 private String[] mots;
	private JFrame frame;
	private JTextField textField_essai;
	private float choix;
	private String str;
	private String a;
	private int vraifin;
	private int taille;
	protected int faux;
	protected int vrai;
	private String b;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					essai_p1 window = new essai_p1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

	/**
	 * Create the application.
	 */
	public essai_p1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		choix_motp2 mot = new choix_motp2();
		a = choix_motp2.lemot();
		
		choix_motp1 jnom1 = new choix_motp1();
		b = choix_motp1.lemot();
		
		 taille=0;
	       
	       mots = a.split("");
	      taille =  mots.length;
	      
	      int pos=183;
	      
	
	      
	      
		frame = new JFrame();
		frame.setBounds(100, 100, 867, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		choix = 8;
		str = String.valueOf(choix);
		
		
		ArrayList<String> liste = new ArrayList<String>();
		
		JLabel lettremot = new JLabel(mots[0]);
		lettremot.setBounds(205, 250, 57, 26);
		frame.getContentPane().add(lettremot);
		
		  for (int i = 0; i < taille; i++) {
	    	  
		  		JSeparator lettree = new JSeparator();
				lettree.setForeground(Color.BLACK);
				lettree.setBounds(pos, 276, 57, 26);
				frame.getContentPane().add(lettree);
				pos = pos+70;
		           
		        }
		  

		JLabel lblessaiaffiche = new JLabel("Joueur 2 : Essayer de deviner le mot !");
		lblessaiaffiche.setFont(lblessaiaffiche.getFont().deriveFont(lblessaiaffiche.getFont().getStyle() | Font.BOLD, lblessaiaffiche.getFont().getSize() + 6f));
		lblessaiaffiche.setBounds(218, 11, 362, 60);
		frame.getContentPane().add(lblessaiaffiche);
		
		textField_essai = new JTextField();
		textField_essai.setBounds(283, 327, 241, 29);
		frame.getContentPane().add(textField_essai);
		textField_essai.setColumns(10);
		
		JLabel lblessai = new JLabel("Entrer les lettres puis le mot de fin pour gagner");
		lblessai.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblessai.setBounds(249, 298, 345, 29);
		frame.getContentPane().add(lblessai);
		
		
		
		
		JLabel lblNombrechoix = new JLabel("nombres de choix restant : "+str);
		lblNombrechoix.setBounds(28, 313, 211, 29);
		frame.getContentPane().add(lblNombrechoix);
		lblNombrechoix.repaint();
		frame.repaint();
		
		 
		
		JButton btnValideressai = new JButton("Valider votre choix");
		btnValideressai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String essai2 = textField_essai.getText();
				if(choix > 1 ) {
				if(essai2.equals("")) {
					JLabel lblNewLabel = new JLabel("Erreur : champ vide");
					lblNewLabel.setForeground(Color.RED);
					lblNewLabel.setBounds(281, 367, 243, 19);
					frame.getContentPane().add(lblNewLabel);
					frame.repaint();
				}
				else {
					int poss = 205;
					vrai=0;
					 liste.add(essai2);  System.out.println(liste);
				    vraifin = 0;
					for (String value : mots) {
						
						faux=0;
			           if(value.equals(essai2)) {
			        	   JLabel lettremot = new JLabel(value);
			       		lettremot.setBounds(poss, 250, 57, 26);
			       		frame.getContentPane().add(lettremot);
			       		System.out.println("dad"+poss);
			       		vrai = 1;
			       		faux=0;
			        	  
			           }
			           
			          
			           
			           poss= poss+70;
			           vraifin= vraifin +1 ;
			          
			         		           
			           }
					 if(vrai !=1 ) {faux = 1; vrai=0; } 
					
					if(faux ==1) {
					
					choix = choix-1;
					String str = String.valueOf(choix);
					System.out.println(choix);
					str = String.valueOf(choix);
					lblNombrechoix.setText("nombres de choix restant : "+str); 
					
				
					if(choix < 3) {
						JSeparator corps = new JSeparator();
						corps.setOrientation(SwingConstants.VERTICAL);
						corps.setForeground(Color.RED);
						corps.setBounds(383, 125, 57, 60);
						frame.getContentPane().add(corps);
						}

						if(choix < 2) {
						JSeparator jambe = new JSeparator();
						jambe.setForeground(Color.RED);
						jambe.setBounds(333, 187, 105, 49);
						frame.getContentPane().add(jambe);
						}
						if(choix < 1) {
						JSeparator bras = new JSeparator();
						bras.setForeground(Color.RED);
						bras.setBounds(333, 125, 105, 49);
						frame.getContentPane().add(bras);
						}
						if(choix < 8) {
						JSeparator barrebas = new JSeparator();
						barrebas.setForeground(Color.RED);
						barrebas.setBounds(179, 187, 96, 49);
						frame.getContentPane().add(barrebas);
						}
						if(choix < 7) {
						JSeparator barremilieu = new JSeparator();
						barremilieu.setForeground(Color.RED);
						barremilieu.setOrientation(SwingConstants.VERTICAL);
						barremilieu.setBounds(218, 63, 112, 123);
						frame.getContentPane().add(barremilieu);
						}
						if(choix < 6) {
						JSeparator barrehaut = new JSeparator();
						barrehaut.setForeground(Color.RED);
						barrehaut.setBounds(218, 61, 197, 60);
						frame.getContentPane().add(barrehaut);
						}
						if(choix < 5) {
						JSeparator chaine = new JSeparator();
						chaine.setOrientation(SwingConstants.VERTICAL);
						chaine.setForeground(Color.RED);
						chaine.setBounds(383, 63, 68, 29);
						frame.getContentPane().add(chaine);
						}
						if(choix < 4) {
						JRadioButton rdbtntete = new JRadioButton("");
						rdbtntete.setForeground(Color.BLACK);
						rdbtntete.setBounds(373, 92, 21, 29);
						frame.getContentPane().add(rdbtntete);
						}
					frame.repaint();
				}
					frame.repaint();
				}
				
			}
				 if (essai2.equals(a)){
		        	   System.out.println("azdazfe"+vraifin);
		        	   
		        	   System.out.println("victoire");
						victoirefin g=new victoirefin();
		                g.run1();
		                frame.setVisible(false);
		                this.dispose();
		        	   
		        	   
		           }
				if (choix == 0) {
			
				System.out.println("looser");
				defaite g=new defaite();
              g.run1();
              frame.setVisible(false);
              this.dispose();
			}
			
			
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnValideressai.setBounds(283, 392, 241, 49);
		frame.getContentPane().add(btnValideressai);
		
		
		
		
	

		
	
		
	
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Liste des essaies :"}));
		comboBox.setBounds(588, 219, 161, 88);
		frame.getContentPane().add(comboBox);
		
		 comboBox.addItem(liste);
		
	

	}
}
