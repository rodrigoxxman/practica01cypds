package prueba1.app;

import javax.swing.JOptionPane;

public class AsocRD {
	public void req() {
	String [] nombreprenda = {"test1","test2","test3","test4","test5","test6"};
	String [] descripcion = {"testdescrip1","testdescrip2","testdescrip3","testdescrip4",
			"testdescrip5","testdescrip6"};
	char [] talla = {2,3,5,6,7,8};
	Double [] precio = {20.5, 35.5 ,15.8, 60.7, 12.3, 10.3};
	JOptionPane.showMessageDialog(null, "La prenda: "+nombreprenda[0]+",su descripcion es: "+descripcion[0]+" y la talla es: "+talla[0]+"y el precio es: "+precio[0]+"\r"
			+"La prenda: "+nombreprenda[1]+",su descripcion es: "+descripcion[1]+", la talla es: "+talla[1]+"y el precio es: "+precio[1]+"\r"
			+"La prenda: "+nombreprenda[2]+",su descripcion es: "+descripcion[2]+", la talla es: "+talla[2]+"y el precio es: "+precio[2]+"\r"
			+"La prenda: "+nombreprenda[3]+",su descripcion es: "+descripcion[3]+", la talla es: "+talla[3]+"y el precio es: "+precio[3]+"\r"
			+"La prenda: "+nombreprenda[4]+",su descripcion es: "+descripcion[4]+", la talla es: "+talla[4]+"y el precio es: "+precio[4]+"\r"
			+"La prenda: "+nombreprenda[5]+",su descripcion es: "+descripcion[5]+", la talla es: "+talla[5]+"y el precio es: "+precio[5]+"\r"
						);
	}
	
}
