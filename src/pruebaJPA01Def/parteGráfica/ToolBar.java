package pruebaJPA01Def.parteGráfica;

import java.awt.Dimension;	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

import pruebaJPA01Def.utils.CacheImagenes;



public class ToolBar extends JToolBar {

	private static final long serialVersionUID = 1L;
	
	public ToolBar () {
        this.add(creaBoton(0, "", "conectado.png", "Concesionario"));
        this.add(creaBoton(1, "", "conectado.png", "Fabricante"));
        this.add(creaBoton(2, "", "conectado.png", "Cliente"));
        this.add(creaBoton(3, "", "conectado.png", "Coche"));
        this.add(creaBoton(4, "", "conectado.png", "Venta"));
	}

	
	/**
	 * 
	 * @param titulo
	 * @param icono
	 * @return
	 */
	private JButton creaBoton(int num, String titulo, String icono, String toolTip) {
        JButton jbt = new JButton();
        
        jbt.setText(titulo);
        jbt.setToolTipText(toolTip);
        
        jbt.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            	VentanaPrincipal.jTabbedPane.setSelectedIndex(num);
            	System.out.println("Has hecho clic en el botón: \"" + toolTip + "\"");
            }
        });
        
        try {
        	jbt.setIcon(CacheImagenes.getCacheImagenes().getIcono(icono));  
          } catch (Exception ex) {
        	  ex.printStackTrace();
          }
        return jbt;
	}
	
}
