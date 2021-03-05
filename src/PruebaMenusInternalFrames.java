import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

class VentanaLab extends JFrame{
	
	JMenuBar menuBar;
	JMenu masters,booking,testPerform,transaction,labReport,setings,windows,hep;
	JMenuItem menuItem;
	JToolBar barraH;
	
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
	
	
	
	
	JButton plus = new JButton("Add", new ImageIcon("Iconos/page-blank.png"));
	JButton edit = new JButton("Edit", new ImageIcon("Iconos/editar.png"));
	JButton back = new JButton("Back", new ImageIcon("Iconos/back.png"));
	JButton next = new JButton("Next", new ImageIcon("Iconos/next.png"));
	JButton list = new JButton("List", new ImageIcon("Iconos/list.png"));
	JButton save = new JButton("Save", new ImageIcon("Iconos/save.png"));
	JButton print = new JButton("Print", new ImageIcon("Iconos/print.png"));
	JButton test = new JButton("Test", new ImageIcon("Iconos/test.png"));
	JButton cancel = new JButton("Cancel", new ImageIcon("Iconos/cancel.png"));
	JButton settings = new JButton("Settings", new ImageIcon("Iconos/settings.png"));
	JButton delete = new JButton("Delete", new ImageIcon("Iconos/delete.png"));
	JButton exit = new JButton("Exit", new ImageIcon("Iconos/exit.png"));
	
	
	barraH = new JToolBar(JToolBar.HORIZONTAL);	
	barraH.setBounds(0, 0, 950, 30);
	barraH.add(plus);
	barraH.add(edit);
	barraH.add(back);
	barraH.add(next);
	barraH.add(list);
	barraH.add(save);
	barraH.add(print);
	barraH.add(test);
	barraH.add(cancel);
	barraH.add(settings);
	barraH.add(delete);
	barraH.add(exit);
	
	
	registro.add(barraH);
	
	
	
	
	
	
	
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
