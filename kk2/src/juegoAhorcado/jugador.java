package juegoAhorcado;

public class jugador {
	private String nombreJugador;
	private String palabraJugador;
	private int numintentos=0;
	private static jugador elJugador = null;
	private String palabrasFallidas="";
	private int hint=0;
	private int godmodeStatus=0;
	
	
	/**
	 * 
	 */
	public jugador() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the numintentos
	 */
	public int getNumintentos() {
		return numintentos;
	}


	/**
	 * @param numintentos the numintentos to set
	 */
	public void setNumintentos(int numintentos) {
		this.numintentos = numintentos;
	}


	/**
	 * @param nombreJugador
	 * @param palabraJugador
	 */
	public jugador(String nombreJugador, String palabraJugador) {
		super();
		this.nombreJugador = nombreJugador;
		this.palabraJugador = palabraJugador;
	}


	/**
	 * @return the nombreJugador
	 */
	public String getNombreJugador() {
		return nombreJugador;
	}




	/**
	 * @return the hint
	 */
	public int getHint() {
		return hint;
	}


	/**
	 * @param hint the hint to set
	 */
	public void setHint(int hint) {
		this.hint = hint;
	}


	/**
	 * @param nombreJugador the nombreJugador to set
	 */
	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	/**
	 * @return the palabraJugador
	 */
	public String getPalabraJugador() {
		return palabraJugador;
	}


	/**
	 * @param palabraJugador the palabraJugador to set
	 */
	public void setPalabraJugador(String palabraJugador) {
		this.palabraJugador = palabraJugador;
	}
	
	/**
	 * @return the palabrasFallidas
	 */
	public String getPalabrasFallidas() {
		return palabrasFallidas;
	}


	/**
	 * @param palabrasFallidas the palabrasFallidas to set
	 */
	public void setPalabrasFallidas(String palabrasFallidas) {
		this.palabrasFallidas = palabrasFallidas;
	}


	public int getGodmodeStatus() {
		return godmodeStatus;
	}


	public void setGodmodeStatus(int godmodeStatus) {
		this.godmodeStatus = godmodeStatus;
	}


	//singleton
	public static jugador getJugador() {
		if (elJugador == null) {
			elJugador = new jugador();
		}
		return elJugador;
	}
	
	
}
