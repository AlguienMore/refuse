package rcuatro;
import java.util.*;
import rcuatro.Ventas;

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
		
	public void registro(){
		System.out.println("Registro de ventas por vendedor.\n");
		for(i = 0; i < n; i++){
			this.sum += this.v[i][i+4];
		}
		System.out.println(this.sum);
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
		Ventas ven = new Ventas();
		System.out.print("¡Bienvenido, usuario!\n"); System.out.print("Accesories' R4\n");
		menu = sc.nextInt();
		switch(menu){
		case 1:
			int lel;
			lel = sc.nextInt();
			ven.entas(lel);
			Mainclass.main(args);
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
