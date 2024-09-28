package clearminds.cuentas;

public class Cuenta {
	/*CREACION ATRIBUTOS Y ENCAPSULAMIENTO*/
	private String id;
	private String tipo="A";
	private double saldo;
	
	/*AGREGANDO GET Y SET*/
	public String getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/*CREANDO CONSTRUCTORES*/
	public Cuenta(String id) {
		this.id=id;
		tipo="A";
	}
	public Cuenta(String id,String tipo,double saldo) {
		this.id=id;
		this.tipo=tipo;
		this.saldo=saldo;
	}
	
	
	/*METODO IMPRIMIR*/
	public void imprimir() {
		System.out.println("**********************");
		System.out.println("****** CUENTA *******");
		System.out.println("**********************");
		System.out.println("NUMERO DE CUENTA: "+id);
		System.out.println("TIPO: "+tipo);
		System.out.println("SALDO $: "+saldo);
		System.out.println("**********************");
	}
	
	public void imprimirConEstilo() {
		System.out.println("-------------------------------");
		System.out.println("--   CUENTA BANCARIA   --");
		System.out.println("-------------------------------");
		System.out.println("   NUMERO DE CUENTA: "+id);
		System.out.println("   TIPO: "+tipo);
		System.out.println("   SALDO $: "+saldo);
		System.out.println("__________________________________");
	}
	
	
}
