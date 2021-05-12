package Laboratorio02;
import java.util.*;
public class casos_recetas {
	 private String nombre; 
	   private String apellido;
	   private String enfermedad; 
	   private String fechaIntervencio;
	   private int hora;
	   private String []recetas;
	   private double temperatura; 
	   private int saturacion;
	   private String domicilio;
	   
	   public casos_recetas(String enfermedad,String nombre,String apellido,String fechaIntervencio,int hora,String []recetas,double temperatura,int saturacion,String domicilio) {
		   this.nombre=nombre;
		   this.apellido=apellido;
		   this.enfermedad=enfermedad;
		   this.fechaIntervencio=fechaIntervencio;
		   this.hora=hora;
		   this.recetas=recetas;
		   this.temperatura=temperatura;
		   this.saturacion=saturacion;
		   this.domicilio=domicilio;
	   }
	   

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEnfermedad() {
		return enfermedad;
	}


	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}


	public String getFechaIntervencio() {
		return fechaIntervencio;
	}


	public void setFechaIntervencio(String fechaIntervencio) {
		this.fechaIntervencio = fechaIntervencio;
	}


	public int getHora() {
		return hora;
	}


	public void setHora(int hora) {
		this.hora = hora;
	}


	public String[] getRecetas() {
		return recetas;
	}


	public void setRecetas(String[] recetas) {
		this.recetas = recetas;
	}


	public double getTemperatura() {
		return temperatura;
	}


	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}


	public int getSaturacion() {
		return saturacion;
	}


	public void setSaturacion(int saturacion) {
		this.saturacion = saturacion;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	@Override
	public String toString() {
		return "casos_recetas [nombre=" + nombre + ", apellido=" + apellido + ", enfermedad=" + enfermedad
				+ ", fechaIntervencio=" + fechaIntervencio + ", hora=" + hora + ", recetas=" + Arrays.toString(recetas)
				+ ", temperatura=" + temperatura + ", saturacion=" + saturacion + ", domicilio=" + domicilio + "]";
	}
}
