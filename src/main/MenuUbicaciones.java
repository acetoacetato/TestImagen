package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class MenuUbicaciones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuUbicaciones frame = new MenuUbicaciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public MenuUbicaciones() throws IOException {
		setBackground(Color.PINK);
		setTitle("Aplicaci\u00F3n culi\u00E1");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1302, 808);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMapa = new JPanel();
		panelMapa.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panelMapa.setBounds(807, 60, 412, 299);
		panelMapa.setLayout(null);
		JLabel label = new JLabel(MapHandler.cargaMapa());
		label.setBounds(0, 0, 412, 299);
		panelMapa.add( label );
		contentPane.add(panelMapa);
	}
}
