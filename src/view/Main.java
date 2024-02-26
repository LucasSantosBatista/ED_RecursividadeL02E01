package view;
import javax.swing.JOptionPane;
import controller.MultiplicaController; 

public class Main {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
//		System.out.println("Resultado esperado: " + n1*n2);
		
		MultiplicaController mCont = new MultiplicaController();
		int resultado = mCont.calculaMultiplicacao(n1,n2);
		System.out.println(n1 + " * " + n2 + " = " + resultado);
	}

}
