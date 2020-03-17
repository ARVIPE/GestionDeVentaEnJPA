package pruebaJPA01Def.parteGr�fica;

import java.awt.BorderLayout;	
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import pruebaJPA01Def.utils.CacheImagenes;



public class JTabbedPaneGestion extends JTabbedPane {


	/**
	 * 
	 * @return
	 */
	public JTabbedPaneGestion (){
	
		ImageIcon icono = CacheImagenes.getCacheImagenes().getIcono("duke1-32x32.png");
		
		this.addTab("Concesionario", icono, new PanelGestionConcesionario(), "Concesionario");
		this.setSelectedIndex(0);
		this.addTab("Fabricante", icono, new PanelGestionFabricante(), "Fabricante");
		this.setSelectedIndex(1);
	}	
}
