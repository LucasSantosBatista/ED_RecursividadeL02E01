package controller;

public class MultiplicaController {

	public MultiplicaController() {
		super();
	}

	public int calculaMultiplicacao(int n1, int n2) {
		//Condi��o de parada: n2 � 1 (n1 * 1 � ele mesmo)
		if (n2 == 1) {
			return n1;
		} else {
			return n1 + calculaMultiplicacao(n1, n2 - 1);
		}
	}
}
