package Laboratorio02;

public class pacientes {
	private String nombre;
	private String paterno;
	private String dni;
	private char sexo;
	private String fechaNacimiento;
	
	public pacientes(String nomb,String pater,String Dni,char sex,String nacimientoF) {
		this.nombre=nomb;
		this.paterno=pater;
		this.dni=Dni;
		this.sexo=sex;
		this.fechaNacimiento=nacimientoF;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "pacientes [nombre=" + nombre + ", paterno=" + paterno + ", dni=" + dni + ", sexo=" + sexo
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
}
