package Arkanoid.LevelSystem;

import java.awt.Color;

import Arkanoid.Brick;

/**
 * Clase que implementa la primera fase del juego
 * @author R
 *
 */
public class Fase01 extends Fase {
	public static String levelBackground="background1.jpg";
	// Propiedades est�ticas de la fase
	public static final int[][]  arraymap={	{0,0,0,4,5,6,6,6,6,4,5,0,0},
											{0,2,3,4,1,2,3,5,5,5,0,0,0},
											{0,2,3,4,5,6,2,3,4,5,6,0,0},
											{0,0,0,0,5,2,1,2,3,5,6,0,0},
											{0,0,0,4,0,0,0,0,0,0,4,0,0},
											{0,0,3,0,0,0,0,0,2,0,2,5,6}};
	
	/**
	 * Inicializaci�n de la fase, es la implementaci�n de un m�todo abstracto en el supertipo
	 */
	@Override
	public void inicializaFase() {
		maxPills=1;
		for (int i = 0; i < 1; i++){
		  Brick l = new Brick(4);
		  l.setX(195+(i * 58) );
		  l.setY(210);
		  l.setVx((int) (Math.random() * 20-10)); // velocidad de movimiento
		  actors.add(l);
		}
	}
	
}
