import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

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
	
	String cabezaT []={"Test ID", "Test Name","Disc %"};
	String cuerpoT [][] = new String[1][2];
	
	
	JPanel panel1 = new JPanel();

	panel1.setBackground(Color.WHITE);
	Border bordejpanel = new TitledBorder(new EtchedBorder());
	panel1.setBorder(bordejpanel);
	panel1.setBounds(1, 30, 873, 200);
	
	JLabel id = new JLabel("ID de pasiente");
	panel1.add(id);
	
	JTextField idT = new JTextField(5);
	panel1.add(idT);
	
	JLabel date = new JLabel("                Fecha	    	");
	panel1.add(date);
	
	String []x = {"00/00/0000"}; 
	JComboBox<String> fecha = new JComboBox<String>(x);
	panel1.add(fecha);
	
	JLabel time = new JLabel("  *Hora (hh:mm)");
	panel1.add(time);
	
	JTextField h = new JTextField("0",1);
	JTextField m = new JTextField("0",1);
	JLabel pd = new JLabel(":");
	
	panel1.add(h);
	panel1.add(pd);
	panel1.add(m);
	
	JLabel labN = new JLabel("  No. Lab");
	JTextField nlab = new JTextField(5);
	JLabel zero = new JLabel("                                                                                  .");
	
	panel1.add(labN);
	panel1.add(nlab);
	panel1.add(zero);
	
	
	registro.add(panel1);
	
	
	JLabel name = new JLabel("Nombre     ");
	String []y = {"MR."}; 
	JComboBox<String> mr = new JComboBox<String>(y);
	JTextField mrT = new JTextField(7);
	JLabel zero2 = new JLabel("                                                                                                                                                                                                                      .");
	
	
	
	panel1.add(name);
	panel1.add(mr);
	panel1.add(mrT);
	panel1.add(zero2);
	
	JLabel sex = new JLabel("Sexo          ");
	String []z = {"Mujer","Hombre"}; 
	JComboBox<String> s = new JComboBox<String>(z);
	JLabel age = new JLabel("Edad");
	JLabel monts = new JLabel("  Meses");
	JLabel days = new JLabel("  Dias");
	JLabel sample = new JLabel("     Muestra de");
	JTextField ageT = new JTextField(2);
	JTextField montsT = new JTextField(2);
	JTextField daysT = new JTextField(2);
	JTextField sampleT = new JTextField(7);
	JLabel zero3 = new JLabel("                                                                                                            .");
	
	
	panel1.add(sex);
	panel1.add(s);
	panel1.add(age);
	panel1.add(ageT);
	panel1.add(monts);
	panel1.add(montsT);
	panel1.add(days);
	panel1.add(daysT);
	panel1.add(sample);
	panel1.add(sampleT);
	panel1.add(zero3);
	
	JLabel referente = new JLabel("Referente a:");
	JTextField referenteT = new JTextField(5);
	JTextField solovino = new JTextField(15);
	JLabel panelCode = new JLabel("  Codigo del panel");
	JTextField panelT = new JTextField(7);
	JLabel zero4 = new JLabel("                                                                                                               .");
	
	panel1.add(referente);
	panel1.add(referenteT);
	panel1.add(solovino);
	panel1.add(panelCode);
	panel1.add(panelT);
	panel1.add(zero4);
	
	JLabel panelID = new JLabel(".                                                                                                                       ID de Panel");
	JTextField panelIDT = new JTextField(7);
	
	
	
	
	JLabel email = new JLabel("e-mail");
	JTextField emailT = new JTextField(7);
	
	panel1.add(panelID);
	panel1.add(panelIDT);
	
	panel1.add(new JLabel("                                                                                                         ."));
	
	panel1.add(email);
	panel1.add(emailT);
	
	
	
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
