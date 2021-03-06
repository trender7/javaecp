package formula1;

public abstract class Obstaculo {
	private int accion=0;
	private int posicion=0;
	private int pisado=0;

	public Obstaculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	abstract void inicializa();

	public int getAccion() {
		return accion;
	}

	public void setAccion(int accion) {
		this.accion = accion;
	}
	
	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public int getPisado() {
		return pisado;
	}

	public void setPisado(int pisado) {
		this.pisado = pisado;
	}

	@Override
	public String toString() {
		return "Obstaculo [accion=" + accion + ", posicion=" + posicion + "]";
	}


	
	
	
}

