package it.arellantium.gui.client;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGUI extends JFrame {
	private static final long serialVersionUID = -6265857949300343996L;

	private static final String titolo = "Alessandro Arellano 12345";
	
	// Panello Nord
    
	private static final JLabel serverLabel = new JLabel("Server Address");
	private static final JTextField serverText = new JTextField(20);
	private static final JLabel portLabel = new JLabel("Port");
	private static final JTextField portText = new JTextField(20);
	private static final JButton connectButton = new JButton("Connect");
	private static final JButton disconnectButton = new JButton("Disconnect");
	
	private static final JPanel nordPanel =  new JPanel();
	
    // Panello Centrale
	private static final JLabel consoleLabel = new JLabel("Console");
	private static final JTextArea consoleTextArea = new JTextArea("");
	
	private static final JPanel centerPanel =  new JPanel();
	
    // Panello Sud
	private static final JLabel commandLabel = new JLabel("Command");
	private static final JTextField commandText = new JTextField(20);
	private static final JButton ExcuteButton = new JButton("Execute");
	private static final JButton InterruptButton = new JButton("Interrupt");
	
	private static final JPanel southPanel =  new JPanel();
	
	public ClientGUI() {
		super(titolo);
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        // Nord
        nordPanel.setLayout(new FlowLayout());
        nordPanel.add(serverLabel);
        nordPanel.add(serverText);
        nordPanel.add(portLabel);
        nordPanel.add(portText);
        nordPanel.add(connectButton);
        nordPanel.add(disconnectButton);
       
        disconnectButton.setEnabled(false);
        
        // Center
        centerPanel.setLayout(new BorderLayout());
        centerPanel.add(consoleLabel, BorderLayout.NORTH);
        centerPanel.add(consoleTextArea, BorderLayout.CENTER);
        
        // South
        southPanel.setLayout(new FlowLayout());
        
        southPanel.add(commandLabel);
        southPanel.add(commandText);
        southPanel.add(ExcuteButton);
        southPanel.add(InterruptButton);
        
        commandText.setEnabled(false);
        ExcuteButton.setEnabled(false);
        InterruptButton.setEnabled(false);
        
        //
        this.add(nordPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(southPanel, BorderLayout.SOUTH);
        
        // Imposta le dimensioni della finestra e rendila visibile
        
        this.setSize(1000, 600);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH); FULLSCREEN
        
     // Centra la finestra nello schermo
        this.setLocationRelativeTo(null);
        
        this.setVisible(true);
	}

}
