package JavaProjectAvaliacao;

import java.util.Arrays;

public class ExercicioMediaVetores1 {

	public static void main(String[] args) {
		
		int soma = 0, q[] = {35,4,22,20,36,30};
		int maior = 0;
		float media = 0;
		
		for(int i =0; i < q.length; i++) {
			soma = soma + q[i];
			media = soma / q.length;
			
			if (q[i] > media) {
				maior = q[i];
			}
		}
		System.out.printf("A media de alunos é: %f\n", media);
		System.out.printf("A maior quantidade de alunos é: %d", maior);
	}

}
