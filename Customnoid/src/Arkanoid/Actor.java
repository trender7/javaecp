package Arkanoid;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.List;

import Arkanoid.soundUtils.PlaySound;

public class Actor {
	protected int x,y;
	protected int width, height;
	protected String[] spriteNames;
	protected int currentFrame;
	protected int frameSpeed;
	protected int t;
	public int lives;
	private int markedForRemoval;
	public int lid;

	
	public Actor() {
		lives=0;
		currentFrame = 0;
		frameSpeed = 1;
		t=0;
	}
	
	public void paint(Graphics2D g){
		g.drawImage( SpriteCache.getInstance().getSprite(spriteNames[currentFrame]), x,y, null );
	}
	
	public int getX()  { return x; }
	public void setX(int i) {	x = i; }

	public int getY() {	return y; }
	public void setY(int i) { y = i; }
	
	public int getFrameSpeed() {return frameSpeed;	}
	public void setFrameSpeed(int i) {frameSpeed = i;	}
	
	
	public void setSpriteNames(String[] names) { 
		spriteNames = names;
		height = 0;
		width = 0;
		for (int i = 0; i < names.length; i++ ) {
			BufferedImage image = SpriteCache.getInstance().getSprite(spriteNames[i]);
	  		height = Math.max(height,image.getHeight());
	  		width = Math.max(width,image.getWidth());
	  		
		}
	}			
	
	public int getHeight() { return height; }
	public int getWidth() {	return width;	}
	public void setHeight(int i) {height = i;	}
	public void setWidth(int i) {	width = i;	}

	public void act() {
		t++;
		if (t % frameSpeed == 0){
			t=0;
			currentFrame = (currentFrame + 1) % spriteNames.length;
			markedForRemoval++;
		}
		// Endurecemos los ladrillos por la pildora
		if(this instanceof Brick) {
			if(Arkanoid.harderBricks) {
				this.lid=4;
				this.lives=2;
				this.setSpriteNames( new String[] {"lamarillo.png","lamarillo-glossy.png"});
			}
		}
	}
	
	public int getMarkedForRemoval() {
		return markedForRemoval;
	}
	
	//Detector de Colisiones
     public Rectangle getBounds() {
    	 return new Rectangle(x,y,width,height);
     }
		 
     public int getLid() {
    	 return lid;
     }
     public void removeActor(List<Actor> actors, int i) {
		      
	}
     public void removeActor(List<Actor> actors, int i, Player player) {
	      
	}
}
