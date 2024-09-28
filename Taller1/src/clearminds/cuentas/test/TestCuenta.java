package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		
		Cuenta cuenta1=new Cuenta("03476");
		Cuenta cuenta2=new Cuenta("03476","C",98);
		Cuenta cuenta3=new Cuenta("03476");
		Cuenta cuenta4=new Cuenta("0987","A",10);
		Cuenta cuenta5=new Cuenta("0557","C",10);
		Cuenta cuenta6=new Cuenta("0666","A",0);
		
		cuenta3.setTipo("C");
		
		System.out.println("----------VALORES INICIALES----------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		cuenta4.imprimir();
		cuenta5.imprimir();
		cuenta6.imprimir();
		
		
		System.out.println("----------VALORES MODIFICADOS----------");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		cuenta4.setSaldo(241);
		cuenta5.setSaldo(723);
		
		System.out.println("---------------------------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		System.out.println("_______________________________");
		
		
		cuenta4.imprimirConEstilo();
		cuenta5.imprimirConEstilo();
		cuenta6.imprimirConEstilo();

	}
	
	

}
