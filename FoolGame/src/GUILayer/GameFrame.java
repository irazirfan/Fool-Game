package GUILayer;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame {

	private JLabel lblText,lblResult;
	private JButton btnYes,btnNo,btnRetry,btnExit;
	private JPanel panel;
	Random rand;
	
	public GameFrame() {
		
		super("Fool Game");
		this.setSize(600,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.CYAN);
		
		lblText = new JLabel("Are you a fool ?");
		lblText.setFont(new Font("sherif",Font.BOLD+Font.ITALIC, 50));
		lblText.setForeground(Color.BLUE);
		lblText.setBounds(110, 120, 400, 70);
		panel.add(lblText);
		
		lblResult = new JLabel();
		lblResult.setFont(new Font("sherif",Font.BOLD+Font.ITALIC, 40));
		lblResult.setForeground(Color.MAGENTA);
		lblResult.setBounds(110, 250, 430, 70);
		lblResult.setVisible(false);
		panel.add(lblResult);
		
		btnYes = new JButton("Yes");
		btnYes.setFont(new Font("sherif",Font.BOLD+Font.ITALIC, 15));
		btnYes.setBackground(Color.GREEN);
		btnYes.setForeground(Color.BLUE);
		btnYes.setBounds(210, 210, 70, 40);
		btnYes.addKeyListener(new GameHandler());
		btnYes.addMouseListener(new GameHandler());
		panel.add(btnYes);
		
		btnNo = new JButton("No");
		btnNo.setFont(new Font("sherif",Font.BOLD+Font.ITALIC, 15));
		btnNo.setBackground(Color.MAGENTA);
		btnNo.setForeground(Color.BLUE);
		btnNo.setBounds(290, 210, 70, 40);
		btnNo.addKeyListener(new GameHandler());
		btnNo.addMouseListener(new GameHandler());
		panel.add(btnNo);
		
		btnRetry = new JButton("Retry");
		btnRetry.setFont(new Font("sherif",Font.BOLD+Font.ITALIC, 15));
		btnRetry.setBackground(Color.GREEN);
		btnRetry.setForeground(Color.BLUE);
		btnRetry.setBounds(180, 360, 100, 50);
		btnRetry.addActionListener(new GameHandler());
		btnRetry.addKeyListener(new GameHandler());
		panel.add(btnRetry);
		btnRetry.setVisible(false);
		
		btnExit = new JButton("Exit");
		btnExit.setFont(new Font("sherif",Font.BOLD+Font.ITALIC, 15));
		btnExit.setBackground(Color.GREEN);
		btnExit.setForeground(Color.BLUE);
		btnExit.setBounds(310, 360, 100, 50);
		btnExit.addActionListener(new GameHandler());
		btnExit.addKeyListener(new GameHandler());
		panel.add(btnExit);
		btnExit.setVisible(false);
		
		this.add(panel);
		
		this.rand = new Random();
	}
	
	private class GameHandler implements ActionListener, MouseListener, KeyListener {

		
		public void actionPerformed(ActionEvent ae) {
			
			if (ae.getSource()==btnRetry) {
				
				btnYes.setVisible(true);
				btnNo.setVisible(true);
				btnNo.setBounds(290, 210, 70, 40);
				lblResult.setVisible(false);
				btnRetry.setVisible(false);
				btnExit.setVisible(false);
			}
		
			else if (ae.getSource()==btnExit) {
			
				System.exit(0);
			}
			else {}
		}
		
		public void mouseClicked(MouseEvent me) {
			
			if(me.getSource()==btnYes) {
		
				lblResult.setText("Yes, You are a Fool");
				lblResult.setVisible(true);
				btnRetry.setVisible(true);
				btnExit.setVisible(true);
				btnYes.setVisible(false);
				btnNo.setVisible(false);
			}
			
			else {}
		}

		public void mouseEntered(MouseEvent me) {
			
			if (me.getSource()==btnNo) {
				
				int x = btnNo.getX();
				int y = btnNo.getY();
				
				int x1 = rand.nextInt(500);
				int y1 = rand.nextInt(400);
						
				btnNo.setBounds(x1, y1, 70, 40);
			}
			else {}
		}

		public void mouseExited(MouseEvent me) {
						
		}

		public void mousePressed(MouseEvent me) {
							
		}

		public void mouseReleased(MouseEvent me) {
			
		}

		public void keyPressed(KeyEvent ke) {
			
		}

		public void keyReleased(KeyEvent ke) {
			
		}

		public void keyTyped(KeyEvent ke) {
			
			if(ke.getSource()==btnYes) {
				
				lblResult.setText("Yes, You are a Fool");
				lblResult.setVisible(true);
				btnRetry.setVisible(true);
				btnExit.setVisible(true);
				btnYes.setVisible(false);
				btnNo.setVisible(false);
			}
			else if (ke.getSource()==btnNo) {
				
				lblResult.setText("You are Not a Fool");
				lblResult.setVisible(true);
				btnRetry.setVisible(true);
				btnExit.setVisible(true);
				btnYes.setVisible(false);
				btnNo.setVisible(false);
			}
			else if (ke.getSource()==btnRetry) {
				
				btnYes.setVisible(true);
				btnNo.setVisible(true);
				btnNo.setBounds(290, 210, 70, 40);
				lblResult.setVisible(false);
				btnRetry.setVisible(false);
				btnExit.setVisible(false);
			}
		
			else if (ke.getSource()==btnExit) {
			
				System.exit(0);
			}
			else {}
		}		
		
	}
}
