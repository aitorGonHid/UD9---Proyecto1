
public class Electrodomestico {
	
	// Constantes
	private final String COLOR_BLANCO = "BLANCO";
	private final String COLOR_NEGRO = "NEGRO";
	private final String COLOR_ROJO = "ROJO";
	private final String COLOR_AZUL = "AZUL";
	private final String COLOR_GRIS = "GRIS";
	
	private final char CONSUMO_A = 'A';
	private final char CONSUMO_B = 'B';
	private final char CONSUMO_C = 'C';
	private final char CONSUMO_D = 'D';
	private final char CONSUMO_E = 'D';
	private final char CONSUMO_F = 'E';
	
	// Atributos
	private double precioBase;
	private double precioFinal; // creado atributo precio final UD9
	private String color;
	private char consumo;
	private double peso;
	
	
	/*************************************
	 * Modificados los constructores para*
	 * llamar al de mas parametros       *
	 * ***********************************
	 */
	// Constructor por defecto
	public Electrodomestico() {
		this(100, "BLANCO", 'F',5);
	}
	// Constructor parametrizado con 2 atributos
	public Electrodomestico(double precio, double peso) {
		this(precio, "BLANCO",'F',peso);
	}
	// Constructor parametrizado con todos los atributos
	public Electrodomestico(double precio, String color, char consumo, double peso) {
		this.precioBase = precio;
		this.color = checkColor(color);
		this.consumo = checkConsumo(consumo);
		this.peso = peso;
	}
	// GETTERS & SETTERS
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPrecioFinal() {
		return precioFinal;
	}
	
	// Setea el valor final del producto (cuando se instancia es 0)
	public void setPrecioFinal() {
		this.precioFinal = precioFinal();
	}
	// Calcula y retorna el precio final
	public double precioFinal() {
		
		double precioFinal = 0;
		precioFinal = getPrecioBase();
		precioFinal+=extraPrecioConsumo();
		precioFinal+=extraPrecioPeso();
		
		return precioFinal;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = checkColor(color);
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = checkConsumo(consumo);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	// METODOS COMPROBACION VALORES
	// Metodo que comprueba que el color introducido es válido, en caso contratio devuelve COLOR_BLANCO
	private String checkColor(String color) {
		switch(color.toUpperCase()) {
		case ("NEGRO"):
			return COLOR_NEGRO;
		case ("ROJO"):
			return COLOR_ROJO;
		case ("AZUL"):
			return COLOR_AZUL;
		case ("GRIS"):
			return COLOR_GRIS;
		default:
			return COLOR_BLANCO;
		}
	}
	//Metodo que comprueba que el valor de consumo introducido sea válido, en caso contratio devuelve CONSUMO_F
	private char checkConsumo(char consumo) {
		switch(Character.toString(consumo).toUpperCase()) {
		case ("A"):
			return CONSUMO_A;
		case ("B"):
			return CONSUMO_B;
		case ("C"):
			return CONSUMO_C;
		case ("D"):
			return CONSUMO_D;
		case ("E"):
			return CONSUMO_E;
		default:
			return CONSUMO_F;
		}
	}
	// Devuelve el increment de precio segun el consumo
	protected double extraPrecioConsumo() {
		switch (getConsumo()) {
		case ('A'):
			return 100;
		case ('B'):
			return 80;
		case ('C'):
			return 60;
		case ('D'):
			return 50;
		case ('E'):
			return 30;
		default:
			return 10;
		}
	}
	// Devuelve el incremento de precio segun el peso
	protected double extraPrecioPeso() {
		if (getPeso() > 0 && getPeso() < 20) {
			return 10;
		} else if ((getPeso() >= 20 && getPeso() < 50)) {
			return 50;
		} else if (getPeso() >= 50 && getPeso() < 80) {
			return 80;
		} else {
			return 100;
		}
	}
	
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", precioFinal=" + precioFinal + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + "]";
	}
}
