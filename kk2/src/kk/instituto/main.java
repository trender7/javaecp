package kk.instituto;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String menu = "Creacion de alumnos"
				+ "\n\n1.- Persona no documentada"
				+ "\n2.- Persona documentada";
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		
		if (opcion > 0 && opcion < 3) {
			persona alumno=null;
			
			switch (opcion) {
			case 1: 
				alumno = new personaND();
				personaND alumnodesc=(personaND) alumno;
				alumnodesc.setDescripcion(JOptionPane.showInputDialog("Descricion de la persona no documentada: "));
				break;
			case 2:
				alumno = new personaD();
				personaD alumnodocu=(personaD) alumno;
				alumnodocu.setDNI(JOptionPane.showInputDialog("DNI de la persona: "));
				break;
			}
		
		alumno.setNombre(JOptionPane.showInputDialog("Nombre de la persona: "));
		alumno.setApellidos(JOptionPane.showInputDialog("Apellido de la persona: "));
		alumno.setFechaNaci(JOptionPane.showInputDialog("Fecha de la persona: "));
		System.out.println(alumno);
		}
	}
}
