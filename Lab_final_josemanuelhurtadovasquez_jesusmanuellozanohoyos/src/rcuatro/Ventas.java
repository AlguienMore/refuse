package rcuatro;

public class Ventas extends Mainclass{

	public void uno(){
		System.out.println("Datos de las Ventas.\n");
		do{
			boolean seg = true;
			for (i=0;i<n;i++){
				for (a=0; a<n; a++){	
					System.out.print("CODIGO DEL VENDEDOR:\n>");
					v[i][a]= sc.nextInt();
					System.out.print("\nCODIGO DEL COMPRADOR:\n>");
					v[i][a]= sc.nextInt();
					System.out.print("\nCODIGO DEL PRODUCTO:\n>");
					v[i][a]= sc.nextInt();
					System.out.print("\nPRECIO POR UNIDAD:\n>");
					v[i][a]= sc.nextInt();
					System.out.print("\nCANTIDAD VENDIDA:\n>");
					v[i][a]= sc.nextInt();
				}
			}
			System.out.print("\n¿DESEA REGISTRAR OTRA VENTA?:\n>");
			while(seg){
			terven = sc.nextLine();
			if (terven.equalsIgnoreCase("si")||terven.equalsIgnoreCase("no")){
				seg = false;
			}else if(!terven.equalsIgnoreCase("")) {System.out.println("Por favor, digite una respuesta valida. \n>");}
			}
		}while (terven.equalsIgnoreCase("si"));
					this.sum += v[i][i+4];
			vendordatos[i][i+1] = this.sum;
		
		
	}
	
	public void dos(){
		System.out.println("Registro de ventas por vendedor.\n");
		for(i = 0; i < n; i++){
			for(a=0; a< n; a++){
				System.out.println(v[i][a]);
			}
			
		}
		System.out.println(this.v[0][4]);
		System.out.println(sum);
		try{sel.menu();}catch(NullPointerException e){}
	}
}
