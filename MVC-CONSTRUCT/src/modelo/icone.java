package modelo;

import java.awt.Toolkit;
import javax.swing.JFrame;

public class icone {
	
	public void InserirIcone(JFrame frm) {
		try {
			frm.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/lib/img2.png")));
		} catch(Exception ex) {	
			System.out.println(ex.toString());
		}
	}

}
