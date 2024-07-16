package modelo.metodoak;

import javax.swing.WindowConstants;

import vista.LoginV;

public class CreacionJFrames {

	public static void loginJframe() {
		LoginV loginMenu = new LoginV();
		loginMenu.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		loginMenu.setVisible(true);
		
	}
	
}
