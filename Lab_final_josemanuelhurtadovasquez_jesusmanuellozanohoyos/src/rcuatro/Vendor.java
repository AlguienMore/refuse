package rcuatro;

public class Vendor extends Mainclass {

	int w;
	public void ingreso(){
		System.out.print("");
		if(pvez== true){
		for(w = 0; w < n; w++){
			
			System.out.print("\nIngrese el código del vendedor n°"+(w+1)+":\n>");
			cod = sc.nextInt();
			for(int r=0; r<n; r++){	
				if(cod == vendor[r]){
					System.out.print("\nEste código de vendedor ya ha sido registrado.\nPor favor, digite un código diferente:\n>");
					System.out.print(cod);
				}else{
					vendor[w] = cod;
					vendordatos[w][w] = vendor[w];
				}
			}
			
			
		} 

		}else if (pvez==false){
			w=n;
			n=n+1;
			System.out.print("\nIngrese el código del nuevo vendedor (n°"+(w+1)+"):\n>");
			cod = sc.nextInt();
		}
		}
	
}
