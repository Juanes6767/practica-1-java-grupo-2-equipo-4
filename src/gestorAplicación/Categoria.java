package gestorAplicación;

import java.util.ArrayList;



public enum Categoria{
	
	 ALIMENTO(1),
	 BEBIDA(2),
	 LIMPIEZA(3),
	 PERSONAL(4),
	 HOGAR(5),
	 ELECTRONICO(6);
	
public enum Edades{
	MENORES,
	ADULTOS;
	
}

public enum estadoProducto{
	VENCIDO,
	DEFECTUOSO,
	ACTIVO;
}

 private final int identificador;
 
 private Categoria(int identificador) {
	 this.identificador=identificador;
 }
 
 public int getIdentificador() {
	 return identificador;
 }
 
 public static Categoria resolverEnum(int decision) {
	 for (Categoria i:Categoria.values()) {
		 if (decision==i.identificador){
			 return i;
		 }
	 }
	return null;
 }
 


}
