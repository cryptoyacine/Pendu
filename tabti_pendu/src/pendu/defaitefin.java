package pendu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class defaitefin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
			public void run1() {
				try {
					defaitefin window = new defaitefin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		

	/**
	 * Create the application.
	 */
	public defaitefin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 332, 256);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vous avez perdu cette manche!");
		lblNewLabel.setBounds(105, 27, 227, 62);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Continuer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frame.dispose();
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setBounds(53, 100, 186, 21);
		frame.getContentPane().add(btnNewButton);
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}


}
