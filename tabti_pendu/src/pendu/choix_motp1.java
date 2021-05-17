package pendu;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class choix_motp1 {

	private JFrame frame;
	private JTextField textFieldmot;
	protected static String mot1;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					choix_motp1 window = new choix_motp1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	

	/**
	 * Create the application.
	 */
	public choix_motp1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 715, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblchoix1 = new JLabel("Joueur 1 : Entrer le mot \u00E0 faire deviner");
		lblchoix1.setFont(lblchoix1.getFont().deriveFont(lblchoix1.getFont().getStyle() | Font.BOLD, lblchoix1.getFont().getSize() + 5f));
		lblchoix1.setBounds(142, 32, 385, 37);
		frame.getContentPane().add(lblchoix1);
		
		textFieldmot = new JTextField();
		textFieldmot.setBounds(142, 104, 385, 37);
		frame.getContentPane().add(textFieldmot);
		textFieldmot.setColumns(10);
		
		  
		
		
		JButton btnValidermot = new JButton("Valider");
		btnValidermot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 mot1 = textFieldmot.getText();
				if(mot1.equals("")) {
					JLabel lblerreurmot = new JLabel("Erreur : Veuillez entrer un mot");
					lblerreurmot.setFont(new Font("Tahoma", Font.PLAIN, 15));
					lblerreurmot.setForeground(Color.RED);
					lblerreurmot.setBounds(142, 195, 385, 37);
					frame.getContentPane().add(lblerreurmot);
					frame.repaint();
				}
				else {
					
				      model models = new model();
					
					models.setMot_p1(mot1);
					
					essai_p2 g=new essai_p2();
					g.run();
					frame.setVisible(false);
					this.dispose();
				}
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnValidermot.setBounds(142, 272, 385, 44);
		frame.getContentPane().add(btnValidermot);
		

	}

	public Window getFrame() {
		// TODO Auto-generated method stub
		return null;
	}
	public static String lemot(){
		return mot1;
	}

}
