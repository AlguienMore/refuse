package rcuatro;
import java.io.*;
import java.util.*;
import rcuatro.Ventas;
import rcuatro.Vendor;

public class Mainclass {
	boolean pvez= true;
	static int menu = 0;
	static Scanner sc = new Scanner(System.in);
	String terven= "";
	boolean seg = true;
	int i = 0, a=0,sum =0, cod=0; static int n= 0;
	int v [][] = new int[100][100];
	int vendor[] = new int[100];
	int vendordatos[][] = new int [100][100];
	Mainclass sel;
	Vendor vnr;
	static Mainclass sel1;
	
	public void menu(){
		sel = new Mainclass();
		Ventas ven = new Ventas();
		vnr = new Vendor();
		for(int x = 0; x <= 100; x++){
			System.out.print("-");
		}do{
		System.out.print("\n¡Bienvenido, usuario!\n"); System.out.print("Accesories' R4\n");
		if (pvez == false){
		System.out.print("\nElija un opción:\n1)Registrar nueva venta.\n2)Registro de cada vendedor.\n3)Visualización de pago de sueldo.\n4)Visualización de trabajadores destacados del día y los menos productivos.\n");
		System.out.print("5)Ingreso de nuevo vendedor.\n6)Despido de un vendedor existente.\n>");
		menu = sc.nextInt();
		} else {
			System.out.print("\nHemos detectado que es la primera vez que corre este programa\nPor tanto, necesitamos de una configuraciones iniciales\n");
			System.out.print("\nSiga paso a paso las instrucciones que se le indicarán.\nDigite número de empleados actuales:\n>");
			n = sc.nextInt();
			System.out.print("\n¡Excelente!, ahora lo redirijiremos a la sección de Ingreso de Vendedores.");
			pvez = false;
			vnr.ingreso();
			
			
		}
		switch(menu){
		case 1:
			ven.uno();
			System.out.println("");
			break;
		case 2:
			ven.dos();
			break;
		case 3:
			sel.sueldo();
			break;
		case 4:
			sel.visual();
			break;
		case 5:
			sel.consultas();
			break;
		case 6:
			try{vnr.ingreso();}catch(NullPointerException e){}
			break;
		case 7:
			sel.despido();
			break;
		case 8:
			sel.salir();
			break;
		}
		}while (menu != 9);
		
		
			
	}
	public void sueldo(){
		System.out.print("sueldo");
		try{sel.menu();}catch(NullPointerException e){}
	}
	
	public void visual(){
		System.out.print("visualizacion");
		try{sel.menu();}catch(NullPointerException e){}
	}
	
	public void consultas(){
		System.out.print("consultas");
		try{sel.menu();}catch(NullPointerException e){}
	}
	
	public void despido(){
		System.out.print("despido");
		try{sel.menu();}catch(NullPointerException e){}
		}
	
	public void salir(){
		System.out.print("\n¡Que tenga un buen día!\nHasta luego\nPresione cualquier tecla para iniciar...");
		try{
			System.in.read();
		}catch(IOException e){}
		try{sel.menu();}catch(NullPointerException e){}
	}
	
	public static void main(String[] args) {
		sel1 = new Mainclass();
		sel1.menu();
		
	}

}
