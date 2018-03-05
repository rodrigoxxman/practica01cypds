package prueba1.app;

import javax.swing.JOptionPane;

public class AsocRB {
	public void req() {
String [] nombreprenda = {"test1","test2","test3","test4","test5","test6"};
String [] descripcion = {"test1","test2","test3","test4","test5","test6"};
int [] talla = {2,3,5,6,7,8};
	JOptionPane.showMessageDialog(null, "La prenda: "+nombreprenda[0]+",su descripcion es: "+descripcion[0]+" y la talla es: "+talla[0]+"\r"
+"La prenda: "+nombreprenda[1]+",su descripcion es: "+descripcion[1]+" y la talla es: "+talla[1]+"\r"
+"La prenda: "+nombreprenda[2]+",su descripcion es: "+descripcion[2]+" y la talla es: "+talla[2]+"\r"
+"La prenda: "+nombreprenda[3]+",su descripcion es: "+descripcion[3]+" y la talla es: "+talla[3]+"\r"
+"La prenda: "+nombreprenda[4]+",su descripcion es: "+descripcion[4]+" y la talla es: "+talla[4]+"\r"
+"La prenda: "+nombreprenda[5]+",su descripcion es: "+descripcion[5]+" y la talla es: "+talla[5]+"\r"
			);
	}
}
