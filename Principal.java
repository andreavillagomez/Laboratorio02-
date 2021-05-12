package Laboratorio02;
import java.util.*;
import java.io.*;
public class Principal {
	private static ArrayList<enfermedades> lista_enfermedades=new ArrayList<enfermedades>();
	private static ArrayList<pacientes> lista_pacientes=new ArrayList<pacientes>();
	private static ArrayList<casos_recetas> lista_casos=new ArrayList<casos_recetas>();
	static Scanner sc= new Scanner(System.in);


			
	public static void main(String[] args) throws FileNotFoundException {
				// TODO Auto-generated method stub
				int resp=0;
				do {
				System.out.println("DIGITE LA OPCION QUE QUIERA REALIZAR");
				System.out.println("1: PACIENTES");
				System.out.println("2: ENFERMEDADES");
				System.out.println("3: CASOS");
				System.out.println(("5: CREAR ARCHIVO TXT"));
				System.out.println("6: SALIR");
				resp=sc.nextInt();
				
				switch (resp) {
				case 1: {
					int res;
					System.out.println("1: Añadir Nuevo Paciente");
					System.out.println("2: Ver Pacientes");
					System.out.println("3: Actualizar Datos de un Paciente");
					System.out.println("4: Eliminar Paciente");
					res=sc.nextInt();
					if(res==1) {
						añadirPaciente();
					}else if(res==2) {
						verPacientes();
					}else if(res==3) {
						actualizarDatos();
					}else if(res==4) {
						eliminarPaciente();
					}
					
				}break;
				case 2: {
					verEnfermedades();
				}break;
				case 3: {
					casos();
				}break;
				case 4: {
					System.out.println("PROGRAMA FINALIZO");
				}break;
				case 5: {
					crearArchivoTxt();
				}
				}
				}while(resp!=4);
			}
				
			
			
			public static void verEnfermedades() {
				System.out.println("TOTAL EFERMEDADES REGISTRADAS "+lista_enfermedades.size());
				for(enfermedades a: lista_enfermedades) {
					System.out.println(a.toString());
				}
			}
			
			public static void verPacientes() {
				System.out.println("TOTAL PACIENTES REGISTRADOS "+lista_pacientes.size());
				for(pacientes a: lista_pacientes) {
					System.out.println(a.toString());
				}
			}
			
			public static void añadirPaciente() {
				String dni,nombre,apellido,fechaNacimiento;
				int hora,saturacion,tamaño=0;
				double temperatura;
				char sexo;
				String enfermedad,fechaIntervercion,domicilio;
				String[]medicamentos;
				System.out.print("DIGITE EL NUMERO DNI: ");
				dni=sc.next();
				//for(int i=0;i<lista_pacientes.size();i++) {
					//if(lista_pacientes.get(i).getDni().equalsIgnoreCase(dni)) {
						//System.out.println("PACIENTE YA REGISTRADO");
					//}else {
						System.out.print("NOMBRE: ");
						nombre=sc.next();
						System.out.print("APELLIDO: ");
						apellido=sc.next();
						System.out.print("SEXO: ");
						sexo=sc.next().charAt(0);
						System.out.print("FECHA DE NACIMIENTO: ");
						fechaNacimiento=sc.next();
						System.out.print("ENFERMEDAD: ");
						enfermedad=sc.next();
						System.out.print("FECHA DE INTERVENCION: ");
						fechaIntervercion=sc.next();
						System.out.print("HORA (horario de 24 horas): ");
						hora=sc.nextInt();
						System.out.print("CANTIDAD DE MEDICAMENTOS : ");
						tamaño=sc.nextInt();
						medicamentos=new String[tamaño];
						for(int j=0;j<medicamentos.length;j++) {
							System.out.print("MEDICAMENTO "+j+": ");
							medicamentos[j]=sc.next();
						}
						System.out.print("TEMPERATURA: ");
						temperatura=sc.nextDouble();
						System.out.print("SATURACION: ");
						saturacion=sc.nextInt();
						System.out.print("DOMICILIO: ");
						domicilio=sc.next();
						enfermedades new_enfermedad= new enfermedades(enfermedad);
						pacientes new_pacientes= new pacientes(nombre,apellido,dni,sexo,fechaNacimiento);
						casos_recetas new_casos= new casos_recetas(enfermedad,nombre,apellido,fechaIntervercion,hora,medicamentos,temperatura,saturacion,domicilio);
						lista_enfermedades.add(new_enfermedad);
						lista_pacientes.add(new_pacientes);
						lista_casos.add(new_casos);
						System.out.println("REGISTRADO");
					//}
				//}
				
				
			}
			public static void actualizarDatos() {
				String dni;
				int resp;
				int aux=0;
				System.out.println("INGRESE DNI DEL PACIENTE");
				dni=sc.next();
				
				for(int i=0;i<lista_pacientes.size();i++) {
					if(lista_pacientes.get(i).getDni().equals(dni)) {
						aux=i;
						System.out.println("ACTUALIZAR DATOS DEL PACIENTE :"+lista_pacientes.get(aux).getNombre()+" "+lista_pacientes.get(aux).getPaterno());
						System.out.println("(1) TEMPERATURA");
						System.out.println("(2) SATURACION");
						System.out.println("(3) ENFERMEDAD");
						resp=sc.nextInt();
						if(resp==1) {
						System.out.println("INGRESE NUEVA TEMPERATURA ");
						double temperatura=sc.nextDouble();
						lista_casos.get(aux).setTemperatura(temperatura);
						System.out.println("SE ACTUALIZO");
						}
						else if(resp==2) {
							System.out.println("INGRESE NUEVA SATURACION ");
							int saturacion=sc.nextInt();
							lista_casos.get(aux).setSaturacion(saturacion);
							System.out.println("SE ACTUALIZO");
							}
						else if(resp==2) {
							System.out.println("INGRESE NUEVA ENFERMEDAD ");
							String enfermedad=sc.next();
							lista_casos.get(aux).setEnfermedad(enfermedad);
							System.out.println("SE ACTUALIZO");
							}
						
					}else {
						System.out.println("DNI NO ENCONTRADO");
					}
				}
			}
			public static void eliminarPaciente() {
				String dni;
				int aux;
				System.out.println("INGRESE DNI DEL PACIENTE");
				dni=sc.next();
				for(int i=0;i<lista_pacientes.size();i++) {
					if(lista_pacientes.get(i).getDni().equals(dni)) {
						aux=i;
						lista_pacientes.remove(aux);
						lista_casos.remove(aux);
						System.out.println("PACIENTE ELIMINADO CON EXITO");
						
					}else {
						System.out.println("DNI NO ENCONTRADO/DNI MAL DIGITADO");
					}
				}
			}
			public static void casos() {
				System.out.println("TOTAL DE CASOS REGISTRADOS "+lista_casos.size());
				for(casos_recetas a: lista_casos) {
					System.out.println(a.toString());
				}
			}
			public static void crearArchivoTxt() throws FileNotFoundException {
				PrintWriter archivo=new PrintWriter("FP2-P_A_LAB_02_reporte.txt");
				for(casos_recetas a:lista_casos) {
					archivo.println("NOMBRE: "+a.getNombre()+" APELLIDO: "+a.getApellido()+" EFERMEDAD: "+a.getEnfermedad()+" FECHA DE INTERVENCION: "+a.getFechaIntervencio()+" HORA: "+a.getHora()+" RECETAS: "+a.getRecetas()+" TEMPERATURA: "+a.getTemperatura()+" SATURACION: "+a.getSaturacion()+" DOMICILIO: "+a.getDomicilio());
				}
				archivo.close();
				System.out.println("TU ARCHIVO YA SE A GENERADO");
			}	

	}


