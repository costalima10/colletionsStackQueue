package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColletionQueueClienteFila {


		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			Queue<String> fila = new LinkedList<String>();
			
			int op;
			
			do {
				System.out.println("\n||||||||||||||||||||||||||||||||||||||||||");
				System.out.println("\n1- || ADICIONAR CLIENTES NA FILA:||");
				System.out.println("\n2- || LISTAR CLIENTES NA FILA: ||");
				System.out.println("\n3- || RETIRAR CLIENTES DA FILA: ||");
				System.out.println("\n0- SAIR\n");
				System.out.println("\n||||||||||||||||||||||||||||||||||||||||||");
				System.out.println("\n|| ENTRE COM A OPÇAO DESEJADA: ||");
				op = ler.nextInt();
				
				switch(op) {
				case 1:
					ler.nextLine();
					System.out.println("\nDIGITE O NOME:");
					String nome = ler.nextLine();
					if(nome.isEmpty()) {
						System.out.println("\nO NOME NAO FOI ADICIONADO NA LISTA...");
					}else {
					fila.add(nome);
					System.out.println("\nCLIENTE ADICIONADO...\n");
					}
					break;
					
				case 2:
					ler.nextLine();
					System.out.println("\nLISTA DE CLIENTES DA FILA...");
					for(Iterator<String> it = fila.iterator();it.hasNext();) {
						System.out.println(it.next());
					}
					break;
					
				case 3:
					ler.nextLine();
					if(fila.isEmpty() == true) {
						System.out.println("\nA FILA ESTA VAZIA...");
					}else {
						System.out.printf("\nO (A) CLIENTE %s FOI CHAMADO(A)!",fila.poll());
						System.out.println("\nFila: \n");
						for(Iterator<String> it = fila.iterator();it.hasNext();) {
							System.out.println(it.next());
						}
						System.out.println();
						}
					break;
					case 0:
					System.out.println("\n PROGRAMA FINALIZADO... ");
					break;
					
					default:
						System.out.println("\n OPÇAO INVALIDA !!! ");
				}
				
				
			}while(op !=0);

		}

}


