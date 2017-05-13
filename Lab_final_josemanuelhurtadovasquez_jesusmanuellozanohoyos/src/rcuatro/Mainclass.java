package rcuatro;
import java.util.*;

public class Mainclass {
	static int menu = 6;
	static Scanner sc = new Scanner(System.in);
	String terven= "";
	boolean seg = true;
	int i = 0, sum =0, n= 0;
	int v [][] = new int[100][100];
	int vendor[] = new int[100];
	int vendordatos[][] = new int [100][100];
	String[] args = null;
	public int[][] ventas(){
		System.out.println("Datos de las Ventas.\n");
		do{
			seg = true;
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
			i++;
			System.out.print("\n¿DESEA REGISTRAR OTRA VENTA?:\n>");
			while(seg){
			terven = sc.nextLine();
			if (terven.equalsIgnoreCase("si")||terven.equalsIgnoreCase("no")){
				seg = false;
			}else if(!terven.equalsIgnoreCase("")) {System.out.println("Por favor, digite una respuesta valida. \n>");}
			}
		}while (terven.equalsIgnoreCase("si"));
		
		return v;
	}
	
	public void registro(){
		System.out.println("Registro de ventas por vendedor.\n");
		for(i = 0; i < n; i++){
			sum += v[i][i+4];
		}
		System.out.print(sum);
		Mainclass.main(args);
	}
	
	public void sueldo(){
		System.out.print("sueldo");
		Mainclass.main(args);
	}
	
	public void visual(){
		System.out.print("visualizacion");
		Mainclass.main(args);
	}
	
	public void consultas(){
		System.out.print("consultas");
		Mainclass.main(args);
	}
	
	public void ingreso(){
		System.out.print("ingreso");
		Mainclass.main(args);
	}
		
	public void despido(){
		System.out.print("despido");
		Mainclass.main(args);
	}
	
	public void salir(){
		System.out.print("salir");
		Mainclass.main(args);
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
