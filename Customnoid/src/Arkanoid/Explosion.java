package Arkanoid;

import java.util.List;

import Arkanoid.soundUtils.PlaySound;

public class Explosion extends Actor {
	protected int vx;
	private int lives;
	private int animRepeat=3;
	
	public Explosion() {
		super();
		setSpriteNames( new String[] {"explosion0.png","explosion1.png","explosion2.png","explosion3.png","explosion4.png","explosion5.png","explosion6.png","explosion7.png"});
		setFrameSpeed(7);
	}

	/**
	 * @return the animRepeat
	 */
	public int getAnimRepeat() {
		return animRepeat;
	}

	/**
	 * @param animRepeat the animRepeat to set
	 */
	public void setAnimRepeat(int animRepeat) {
		this.animRepeat = animRepeat;
	}
	
}
