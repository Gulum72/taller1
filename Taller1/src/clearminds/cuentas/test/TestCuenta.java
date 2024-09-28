package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		
		Cuenta cuenta1=new Cuenta("03476");
		Cuenta cuenta2=new Cuenta("03476","C",98);
		Cuenta cuenta3=new Cuenta("03476");
		
		cuenta3.setTipo("C");
		
		System.out.println("----------VALORES INICIALES----------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		System.out.println("----------VALORES MODIFICADOS----------");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		
		System.out.println("---------------------------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();

	}
	
	

}
