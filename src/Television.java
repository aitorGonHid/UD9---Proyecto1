
public class Television extends Electrodomestico{

	// Atributos
	private double resolucion; // resolucion en pulgadas
	private boolean sintonizador; // sintonizador TDT
	
	// Constructores
	public Television() {
		this(100, "BLANCO", 'F', 5, 20, false);
	}
	
	public Television(double precio, double peso) {
		this(precio, "BLANCO", 'F', peso, 20, false);
	}
	
	public Television(double precio, String color, char consumo, double peso, double resolucion, boolean sintonizador) {
		super(precio, color, consumo, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}
	
	// Getters & setters
	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}

	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}
	// Métodos de la clase
	
	/**
	 * Devuelve el precio final del televisor
	 * Debe sobreescribir precioFinal() de Electrodomestico para
	 * aplicar el incremento relativo segun la resolucion antes
	 * de los incrementos absolutos segun peso, eficiencia energetica y sintonizador
	 * @return
	 */
	@Override 
	public double precioFinal() {
		
		double precioFinal = 0;
		// Incremento porcentual segun la resolucion
		if (getResolucion() > 40) precioFinal = getPrecioBase()*1.3;
		// Incrementos de la super clase Electrodomestico
		precioFinal+=extraPrecioConsumo();
		precioFinal+=extraPrecioPeso();
		// Incremento si tiene sintonizador
		precioFinal+=extraPrecioSintonizador();
		
		return precioFinal;
	}
	
	private double extraPrecioSintonizador() {
		
		double extraSintonizador = (isSintonizador()) ? 50 : 0;
		return extraSintonizador;
	}
	@Override
	public String toString() {
		return "Lavadora [precioBase=" + super.getPrecioBase() + ", precioFinal=" + super.getPrecioFinal() + ", color=" + super.getColor() + ", consumo=" + super.getConsumo() + ", peso="
				+ super.getPeso()+", resolucion=" + resolucion + ", Sintonizador TDT " + sintonizador + "]";
	}
	
}
