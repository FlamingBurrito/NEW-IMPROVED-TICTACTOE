import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Board {

	int x;
	int y;
	int width;
	int height;
	ImageIcon sprite_1;
	ImageIcon sprite_2;{
	
	sprite_1 = new ImageIcon("X's.png");
	sprite_2 = new ImageIcon("O's.png");
}
	int spaces[] = new int[9];
	
	public Board() {
		x=100;
		y=500;
		width=50;
		height=50;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);									//sets the color of the graphics
		g.drawLine(620, 40, 620, 700);
		g.drawLine(850, 40, 850, 700);
		g.drawLine(1060, 500, 400, 500);
		g.drawLine(1060, 260, 400, 260);
		

		if(spaces[0] == 1) {
			g.drawString("X", 500, 150);
		}
		if(spaces[1] == 1) {
			g.drawString("X", 740, 150);
		}
		if(spaces[2] == 1) {
			g.drawString("X", 950, 150);
		}
		if(spaces[3] == 1) {
			g.drawString("X", 500, 410);
		}
		if(spaces[4] == 1) {
			g.drawString("X", 740, 410);
		}
		if(spaces[5] == 1) {
			g.drawString("X", 950, 410);
		}
		if(spaces[6] == 1) {
			g.drawString("X", 500, 600);
		}
		if(spaces[7] == 1) {
			g.drawString("X", 740, 600);
		}
		if(spaces[8] == 1) {
			g.drawString("X", 950, 600);
		}
		
		if (spaces[0] == 2) {
			g.drawString("O", 500, 150);
		}
		if (spaces[1] == 2) {
			g.drawString("O", 740, 150);
		}
		if (spaces[2] == 2) {
			g.drawString("O", 950, 150);
		}
		if (spaces[3] == 2) {
			g.drawString("O", 500, 410);
		}
		if (spaces[4] == 2) {
			g.drawString("O", 740, 410);
		}
		if (spaces[5] == 2) {
			g.drawString("O", 950, 400);
		}
		if (spaces[6] == 2) {
			g.drawString("O", 500, 600);
		}
		if (spaces[7] == 2) {
			g.drawString("O", 740, 600);
		}
		if (spaces[8] == 2) {
			g.drawString("O", 950, 600);
		}
	
	}
	
	public void Player_1(Graphics g) {
		x=100;
		y=500;
		width=150;
		height=150;
	}
	
	public void Player_2() {
		x=500;
		y=100;
		width=150;
		height=150;
	}
	public void setXY(int newX, int newY) {
		x=newX;
		y=newY;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void keyUpdate(KeyEvent e) {
	if(e.getKeyChar()=='q') {
		spaces[0]=2; 
	}
	if(e.getKeyChar()=='w') {
		spaces[1]=2; 
		e.getKeyChar();
	}
	if(e.getKeyChar()=='e') {
		spaces[2]=2; 
	}
	if(e.getKeyChar()=='r') {
		spaces[3]=2;
		}
	if(e.getKeyChar()=='t') {
		spaces[4]=2;
		}
	if(e.getKeyChar()=='y') {
		spaces[5]=2;
		}
	if(e.getKeyChar()=='u') {
		spaces[6]=2;
		}
	if(e.getKeyChar()=='i') {
		spaces[7]=2;
		}
	if(e.getKeyChar()=='o') {
		spaces[8]=2;
		}
	if(e.getKeyChar()=='1') {
		spaces[0]=1; 
	}
	if(e.getKeyChar()=='2') {
		spaces[1]=1; 
		e.getKeyChar();
	}
	if(e.getKeyChar()=='3') {
		spaces[2]=1; 
	}
	if(e.getKeyChar()=='4') {
		spaces[3]=1;
		}
	if(e.getKeyChar()=='5') {
		spaces[4]=1;
		}
	if(e.getKeyChar()=='6') {
		spaces[5]=1;
		}
	if(e.getKeyChar()=='7') {
		spaces[6]=1;
		}
	if(e.getKeyChar()=='8') {
		spaces[7]=1;
		}
	if(e.getKeyChar()=='9') {
		spaces[8]=1;
		}
	}
}