
public class Lavadora extends Electrodomestico {

	
	// Constantes
	private final int CARGA_STANDARD = 5; // No seria necesario declararla por la forma en que se asigna el valor de carga en los constructores
	// Atributos
	private int carga;
	
	// Constructores
	// El constructor con más parametros llama al constructor de la SUPERCLASE y AÑADE el setter de CARGA
	// Los dos constructores con 2 o 0 parametros llaman al constructor "completo"
	public Lavadora() {
		this(100, "BLANCO",'F',5,5);
	}

	public Lavadora(double precio, double peso) {
		this(precio, "BLANCO",'F',peso,5);
	}

	public Lavadora(double precio, String color, char consumo, double peso, int carga) {
		super(precio, color, consumo, peso);
		this.carga = carga;
	}
	// Getters & setters

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	@Override
	public double precioFinal() {
		
		double incremento = (getCarga() > 30) ? 50 : 0;
		return  super.precioFinal()+incremento;
	}
	@Override
	public String toString() {
		return "Lavadora [precioBase=" + super.getPrecioBase() + ", precioFinal=" + super.getPrecioFinal() + ", color=" + super.getColor() + ", consumo=" + super.getConsumo() + ", peso="
				+ super.getPeso()+", carga=" + carga + "]";
	}
	
	
}
