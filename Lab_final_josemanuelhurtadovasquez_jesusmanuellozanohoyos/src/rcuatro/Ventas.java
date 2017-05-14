package rcuatro;

public class Ventas extends Mainclass{

	public void uno(){
		System.out.println("Datos de las Ventas.\n");
		do{
			boolean seg = true;
			System.out.print("CODIGO DEL VENDEDOR:\n>");
			v[i][i]= sc.nextInt();
			System.out.print("\nCODIGO DEL COMPRADOR:\n>");
			v[i][i+1]= sc.nextInt();
			System.out.print("\nCODIGO DEL PRODUCTO:\n>");
			v[i][i+2]= sc.nextInt();
			System.out.print("\nPRECIO POR UNIDAD:\n>");
			v[i][i+3]= sc.nextInt();
			System.out.print("\nCANTIDAD VENDIDA:\n>");
			v[i][i+4]= sc.nextInt();
			i++;
			System.out.print("\n¿DESEA REGISTRAR OTRA VENTA?:\n>");
			while(seg){
			terven = sc.nextLine();
			if (terven.equalsIgnoreCase("si")||terven.equalsIgnoreCase("no")){
				seg = false;
			}else if(!terven.equalsIgnoreCase("")) {System.out.println("Por favor, digite una respuesta valida. \n>");}
			}
		}while (terven.equalsIgnoreCase("si"));
		
	}
	
	public void dos(int n, int lel){
		System.out.println("Registro de ventas por vendedor.\n");
		for(i = 0; i < n; i++){
			this.sum += lel;
			
			System.out.println(i);
			System.out.println(n);
		}
		System.out.println(this.v[0][4]);
		System.out.println(sum);
		Mainclass.main(args);
	}
}
