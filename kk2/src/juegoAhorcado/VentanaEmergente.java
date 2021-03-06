package juegoAhorcado;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaEmergente {

	/**
	 * El m�todo simplemente muestra en pantalla un mensaje con la posibilidad
	 * de personalizar los botones.
	 * @param mensaje
	 */
	public static void muestraVentanaEmergente (String mensaje) {
		// Array con las opciones a mostrar en la ventana emergente
		String[] opciones = {"Continuar", "Abandonar el juego"};
		int opcionElegida=0;
		// La ventana emergente devuelve un valor entero, correspondiente
		// con la opci�n elegida por el usuario
		System.out.println(Ventana.getVentana().getTextoFinal());
		if(jugador.getJugador().getNumintentos()>=1 && jugador.getJugador().getCambiotemporada()==0) {
			opcionElegida = JOptionPane.showOptionDialog(null, // Componente "padre" de la ventana emergente, de momento utiliza siempre "null"
					mensaje, // Mensaje a mostrar en la ventana
					"Enhorabuena", // T�tulo de la ventana
					JOptionPane.YES_NO_CANCEL_OPTION, // Tipo de ventana emergente 
					JOptionPane.INFORMATION_MESSAGE, // Tipo de mensaje a mostrar
					new ImageIcon(CacheImagenes.getCache().getIconoFinJuego()), // Icono personalizado para la ventana
					opciones, // Array de elementos a mostrar en forma de bot�n 
					0); // Bot�n "por defecto"
		}else if(jugador.getJugador().getNumintentos()<1){
			System.out.println("entro en has muert");
			opcionElegida = JOptionPane.showOptionDialog(null, // Componente "padre" de la ventana emergente, de momento utiliza siempre "null"
					mensaje, // Mensaje a mostrar en la ventana
					"Fin del juego", // T�tulo de la ventana
					JOptionPane.YES_NO_CANCEL_OPTION, // Tipo de ventana emergente 
					JOptionPane.INFORMATION_MESSAGE, // Tipo de mensaje a mostrar
					new ImageIcon(CacheImagenes.getCache().getIconoFinJuegoDerrota()), // Icono personalizado para la ventana
					opciones, // Array de elementos a mostrar en forma de bot�n 
					0); // Bot�n "por defecto"
					jugador.getJugador().setRondas(1);
		}else  if(jugador.getJugador().getCambiotemporada()==1 && jugador.getJugador().getNumintentos()>=1){
			System.out.println("entro en cambio estacion");
			opcionElegida = JOptionPane.showOptionDialog(null, // Componente "padre" de la ventana emergente, de momento utiliza siempre "null"
					mensaje, // Mensaje a mostrar en la ventana
					"Cambio de Temporada", // T�tulo de la ventana
					JOptionPane.YES_NO_CANCEL_OPTION, // Tipo de ventana emergente 
					JOptionPane.INFORMATION_MESSAGE, // Tipo de mensaje a mostrar
					new ImageIcon(CacheImagenes.getCache().getIconoCambioTemporada()), // Icono personalizado para la ventana
					opciones, // Array de elementos a mostrar en forma de bot�n 
					0); // Bot�n "por defecto"
		}
			
		// Comprobación de la opci�n elegida por el usuario
		if (opcionElegida == 1) { // Si la opci�n elegida es la de �ndice "1", salimos
			System.exit(0);
		}else {
			jugador.getJugador().setRondas(jugador.getJugador().getRondas()+1);
			//damos 3 vidas extra por ronda
			jugador.getJugador().setNumintentos(jugador.getJugador().getNumintentos()+4);
			//reiniciamos letras fallidas
			jugador.getJugador().setPalabrasFallidas("");
			// Si el juego acaba por cambio de temporada, cambiamos para que no gane como si hubiera finalizado la ronda
			if(jugador.getJugador().getCambiotemporada()==1) {
				jugador.getJugador().setNumintentos(jugador.getJugador().getNumintentos()-4);
				jugador.getJugador().setRondas(1);
				Ventana.setTitle(("El Ahorcado HD by Trillo - Ronda "+jugador.getJugador().getRondas()));
				jugador.getJugador().setCambiotemporada(0);
				jugador.getJugador().setNumintentos(6);
			}
			//Vuelve a comenzar el juego
			baseMuneco.getJuego().cargaJuego();
			baseMuneco.getJuego().iniciaJugada();
		}
		
		
	}
}
