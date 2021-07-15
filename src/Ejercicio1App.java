
public class Ejercicio1App {

	public static void main(String[] args) {
		
		Electrodomestico[] stock = new Electrodomestico[10];
		
		// instanciando con valores standard
		stock[0] = new Electrodomestico();
		stock[1] = new Lavadora();
		stock[2] = new Television();
		// instanciando con 2 parametros
		stock[3] = new Electrodomestico(300, 60);
		stock[4] = new Lavadora(300,60);
		stock[5] = new Television(300,60);
		// instanciando con todos los parametros
		stock[6] = new Electrodomestico();
		stock[7] = new Television();
		stock[8] = new Television();
		stock[9] = new Television();
		
	}

}
