package tresenraya;

import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

public class CacheImagenes {
	
	// Patr�n Singleton
	private static CacheImagenes cache= null;
	
	// Variables con im�genes almacenadas
	private BufferedImage ahorcadoFondo= null;
	private BufferedImage ahorcadoFondoNavidad= null;
	private BufferedImage ahorcadoFondoVerano= null;
	private BufferedImage IconoFinJuego= null;
	private BufferedImage IconoCambioTemporada= null;
	private BufferedImage IconoFinJuegoDerrota= null;
	private BufferedImage fondoAsfalto=null;
	private BufferedImage imgRampa=null;
	private BufferedImage imgMancha=null;
	private BufferedImage imgPodium=null;
	private BufferedImage imgFondoRaya=null;


	
	/**
	 * El constructor busca los archivos en el sistema y los carga en memoria
	 */
	public CacheImagenes () {
		super();
	}
	
	
	/**
	 * Getter del patr�n Singleton
	 * @return
	 */
	public static CacheImagenes getCache() {
		if (cache == null) {
			cache = new CacheImagenes();
		}
		return cache;
	}
	
	
	/**
	 * M�todo que permite obtener una imagen del sistema de ficheros. No es necesario que 
	 * en este momento de tu aprendizaje entiendas el 100% del siguiente m�todo. Es 
	 * demasiado complejo. S�lo tienes que entender que est� m�todo te devuelve un objeto
	 * de tipo BufferedImage, que podr�s utilizar para poder pintar un archivo de imagen
	 * sobre tu ventana.
	 * @param nombre
	 * @return
	 */
	public BufferedImage getImagen(String nombre) {
		URL url=null;
		try {
			url = getClass().getResource("/tresenraya/assets/" + nombre);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}

	
	/**
	 * @return the ahorcadoFondo
	 */
	public BufferedImage getahorcadoFondo() {
		if (ahorcadoFondo == null) {
			ahorcadoFondo = getCache().getImagen("ahorcadoFondo.jpg");
		}
		return ahorcadoFondo;
	}
	/** PORQUE FLASHEA?
	public BufferedImage getahorcadoFondo() {
		if(Ventana.getVentana().getTemporada().equals("oeste")) {
			ahorcadoFondo = getCache().getImagen("ahorcadoFondo.jpg");
		}else if(Ventana.getVentana().getTemporada().equals("navidad")){
			ahorcadoFondo = getCache().getImagen("ahorcadoFondonavidad.jpg");
		}else if(Ventana.getVentana().getTemporada().equals("verano")) {
			ahorcadoFondo= getCache().getImagen("ahorcadoFondoVerano.jpg");
		}
	return ahorcadoFondo;
}
*/
	
	public BufferedImage getIconoFinJuego() {
		if (IconoFinJuego == null) {
			IconoFinJuego = getCache().getImagen("victoriamagistral.jpg");
		}
		return IconoFinJuego;
	}
	public BufferedImage getFondoRaya() {
		if (imgFondoRaya == null) {
			imgFondoRaya = getCache().getImagen("fondoRaya.png");
		}
		return imgFondoRaya;
	}
	public BufferedImage getIconoFinJuegoDerrota() {
		if (IconoFinJuegoDerrota == null) {
			IconoFinJuegoDerrota = getCache().getImagen("derrotamuere.jpg");
		}
		return IconoFinJuegoDerrota;
	}
	public BufferedImage getAsfalto() {
		if (fondoAsfalto == null) {
			fondoAsfalto = getCache().getImagen("asfalto.jpg");
		}
		return fondoAsfalto;
	}
	public BufferedImage getRampa() {
		if (imgRampa == null) {
			imgRampa = getCache().getImagen("rampa.png");
		}
		return imgRampa;
	}
	public BufferedImage getMancha() {
		if (imgMancha == null) {
			imgMancha = getCache().getImagen("mancha.png");
		}
		return imgMancha;
	}
	public BufferedImage getPodium() {
		if (imgPodium== null) {
			imgPodium = getCache().getImagen("podium.png");
		}
		return imgPodium;
	}
	public BufferedImage getIconoCambioTemporada() {
		if (IconoCambioTemporada == null) {
			IconoCambioTemporada = getCache().getImagen("cambioTemporada.png");
		}
		return IconoCambioTemporada;
	}
}
