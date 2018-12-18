import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements KeyListener{

		Board board = new Board();
		int turn;
		int space;
		String Player;
		
		
		public GamePanel() {
			addKeyListener(this);
			setBackground(new Color(64, 64, 64));
			setFocusable(true);
			turn=1;
			
}

		
		public void gameManager(Graphics g) {
			
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.yellow);
			board.draw(g);
			gameManager(g);
	
		}

		@Override
		public void keyPressed(KeyEvent e) {
			board.keyUpdate(e);
			
			repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
}