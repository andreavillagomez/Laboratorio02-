package Laboratorio02;

public class enfermedades {
		
	private String enfermedad;
	
	public enfermedades(String enfer) {
		this.enfermedad=enfer;
		
	}
	
	public String getEnfermedad() {
		return enfermedad;
	}
	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	@Override
	public String toString() {
		return "enfermedades [enfermedad=" + enfermedad + "]";
	}
	
}