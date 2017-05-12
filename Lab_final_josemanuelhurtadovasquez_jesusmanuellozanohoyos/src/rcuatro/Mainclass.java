package rcuatro;
import java.util.*;

public class Mainclass {
	static Scanner sc = new Scanner(System.in);
	int [][][] DatosVentas = new int[100][100][100];
	
	public void ventas(){
		
		
	}
	
	public void registro(){}
	
	public void sueldo(){}
	
	public void visual(){}
	
	public void consultas(){}
	
	public void ingreso(){}
		
	public void despido(){}
	
	public void salir(){}
	
	public static void main(String[] args) {
		Mainclass sel = new Mainclass();
		int menu=6;
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
