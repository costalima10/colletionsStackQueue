package Collections;

import java.util.Scanner;
import java.util.Stack;

public class CollectionStackLivros {

	public static void main(String[] args) {
		
		String nome;
		Stack<String> pilha = new Stack<String>();
		
		Scanner leia = new Scanner(System.in);
		 int op;
	
		 do {
			 
			 	System.out.println("\n||||||||||||||||||||||||||||||||||||||||||");
				System.out.println("\n1- || ADICIONAR LIVROS NA PILHA:||");
				System.out.println("\n2- || LISTA TODOS OS LIVROS: ||");
				System.out.println("\n3- || RETIRAR LIVROS DA PILHA: ||");
				System.out.println("\n0- SAIR\n");
				System.out.println("\n||||||||||||||||||||||||||||||||||||||||||");
				 op = leia.nextInt();
			 
		 switch(op) {
		  case 1 :
			 	leia.nextLine();
				System.out.println("\n||DIGITE O NOME:||");
				nome = leia.nextLine();
				pilha.add(nome);
				System.out.println("\n|| ADICIONADO...||\n");
				break;
		 case 2:
			 System.out.println("\nLISTA DE LIVROS NA PILHA..."+pilha);
			 if (pilha.isEmpty()) {
					System.out.println("A LIVRARIA ESTA VAZIA");
				}
				break;
		 case 3:
			 if (pilha.isEmpty()) {
					System.out.println("\nA pilha de livros está vazia. Coloque novos livros!");
				}else {
					pilha.pop();
					System.out.println("\nUm livro foi retirado da pilha! Nova pilha: "+pilha);
				}
				break;
		 case 0:
			 System.out.println("\n || FIM DO PROGRAMA ||");
			 }
			  }while(op != 0);
	
}

}
