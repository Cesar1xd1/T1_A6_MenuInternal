import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

class VentanaLab extends JFrame{
	
	JMenuBar menuBar;
	JMenu masters,booking,testPerform,transaction,labReport,setings,windows,hep;
	JMenuItem menuItem;
	JToolBar barraTareas;
	
	JInternalFrame registro;
	
	public VentanaLab() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(900,700);
		setLocationRelativeTo(null);
		setTitle("INTERNALFRAMES");
		setVisible(true);
		
		menuBar = new JMenuBar();
			masters = new JMenu("Maestros");
				menuItem = new JMenuItem("Registro");
				menuItem.setIcon(new ImageIcon());
			masters.add(menuItem);
				
				
				menuItem.addActionListener(new ActionListener() {
				
					@Override
					public void actionPerformed(ActionEvent e) {
						registro.setVisible(true);
						
						
					}
				});
		
	menuBar.add(masters);
	setJMenuBar(menuBar);
	
	JDesktopPane dp = new JDesktopPane();
				
	
	registro = new JInternalFrame();
	registro.getContentPane().setLayout(null);
	registro.setDefaultCloseOperation(HIDE_ON_CLOSE);
	registro.setSize(885, 640);
	registro.setTitle("Registro");
	//registro.setVisible(true);
	
	
	
	
	
	JLabel x = new JLabel("xd");
	x.setBounds(10,10,20,10);
	registro.add(x);
	
	dp.add(registro);
	dp.setBounds(0, 0, 900, 700);
	add(dp);
	
	}
	
}


public class PruebaMenusInternalFrames {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaLab();
			}
		});	
		

	}

}
