package pruebaJPA01Def.parteGráfica;

import java.awt.Toolkit;		
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import javax.swing.JTabbedPane;

import pruebaJPA01Def.utils.CacheImagenes;


public class Menu extends JMenuBar {

	public Menu() {
		
		//Menú Archivo de la aplicación
		JMenu menuGestion = new JMenu("Gestión");
		
		String titulos[] = new String [] {"Concesionario", "Fabricante", "Cliente", "Coche", "Ventas"};
		
		for(int i = 0; i < titulos.length; i++) {
			final int iFinal = i;
			JMenuItem item = new JMenuItem(titulos[i]);
			item.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					VentanaPrincipal.jTabbedPane.setSelectedIndex(iFinal);
				}
			});
			menuGestion.add(item);
		}
		this.add(menuGestion);
	}


}
