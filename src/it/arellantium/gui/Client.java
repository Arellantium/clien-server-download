package it.arellantium.gui;

import javax.swing.SwingUtilities;

import it.arellantium.gui.client.ClientGUI;

public class Client {


	public static void main(String[] args) {
		// Professore
		//ClientGUI client = new ClientGUI();
		
		// Best practice
		
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ClientGUI();
            }
        });
        
	}
}
