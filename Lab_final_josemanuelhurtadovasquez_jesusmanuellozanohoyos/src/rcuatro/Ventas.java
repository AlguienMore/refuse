package rcuatro;

public class Ventas extends Mainclass{

	public int[][] entas(int e){
		System.out.println("Datos de las Ventas.\n");
		do{
			boolean seg = true;
			System.out.print("CODIGO DEL VENDEDOR:\n>");
			v[i][i]= e;
			System.out.print("\nCODIGO DEL COMPRADOR:\n>");
			v[i][i+1]= e;
			System.out.print("\nCODIGO DEL PRODUCTO:\n>");
			v[i][i+2]= e;
			System.out.print("\nPRECIO POR UNIDAD:\n>");
			v[i][i+3]= e;
			System.out.print("\nCANTIDAD VENDIDA:\n>");
			v[i][i+4]= e;
			i++;/*
			System.out.print("\n¿DESEA REGISTRAR OTRA VENTA?:\n>");
			while(seg){
			terven = sc.nextLine();
			if (terven.equalsIgnoreCase("si")||terven.equalsIgnoreCase("no")){
				seg = false;
			}else if(!terven.equalsIgnoreCase("")) {System.out.println("Por favor, digite una respuesta valida. \n>");}
			}*/
		}while (terven.equalsIgnoreCase("si"));
		return v;
		
	}
	
}
