package rcuatro;
import java.util.*;

public class Mainclass {
	static int menu = 6;
	static Scanner sc = new Scanner(System.in);
	String terven= null;
	int i = 0;
	int v [][] = new int[100][100];
	public void ventas(){
		System.out.println("Datos de las Ventas.\n");
		do{
			System.out.print("CODIGO DEL VENDEDOR:\n>");
			v[i][i]= sc.nextInt();
			System.out.print("\nCODIGO DEL COMPRADOR:\n>");
			v[i][i+1]= sc.nextInt();
			System.out.print("\nCODIGO DEL PRODUCTO:\n>");
			v[i][i+2]=sc.nextInt();
			System.out.print("\nPRECIO POR UNIDAD:\n>");
			v[i][i+3]=sc.nextInt();
			System.out.print("\nCANTIDAD VENDIDA:\n>");
			v[i][i+4]=sc.nextInt();
		}while (terven.equalsIgnoreCase("si"));
	}
	
	public void registro(){
		System.out.print("registro");
	}
	
	public void sueldo(){
		System.out.print("sueldo");
	}
	
	public void visual(){
		System.out.print("visualizacion");
	}
	
	public void consultas(){
		System.out.print("consultas");
	}
	
	public void ingreso(){
		System.out.print("ingreso");
		
	}
		
	public void despido(){
		System.out.print("despido");
	}
	
	public void salir(){
		System.out.print("salir");
	}
	
	public static void main(String[] args) {
		Mainclass sel = new Mainclass();
		System.out.print("¡Bienvenido, usuario!\n"); System.out.print("Accesories' R4\n");
		menu = sc.nextInt();
		switch(menu){
		case 1:
			sel.ventas();
			break;
		case 2:
			sel.registro();
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
			sel.ingreso();
			break;
		case 7:
			sel.despido();
			break;
		case 8:
			sel.salir();
			break;
		}
	}

}
