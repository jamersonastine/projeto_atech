import java.util.Stack;
		
		public class AreaMaior {
		
			public int AreaRetanguloMax(char[][] matriz) {		//verificar e garantir que a entrada não esteja vazia para evitar NullPointerException. Estando vazia o valor é 0.
				if (matriz == null | matriz.length == 0 | matriz[0].length == 0) {
					return 0;
				}
				
				int nlinhas = matriz.length;								//criei 4 variaveis (nlinhas,nblocos,alturablocos,max) e utilizei a propriedade lenght para ler os arrays da matriz e gravar em nlinhas
				int nblocos = matriz[0].length;						//utilizei a variavel matriz[0] para contar os blocos a partir da linha 0, no caso da matriz proposta, espera-se que retorne nblocos=5 
				int[] alturablocos = new int[nblocos];				//quando o nblocos acima retornar 5, ele irá usar esse dado para criar uma nova linha com 5 blocos com valores 0 e a cada linha ira somar os '1'
				int max = 0;													//após a soma acima, a maior area encontrada, sera escrita aqui ao utilizar o Math.max
				Stack<Integer> stack = new Stack<>();			//a pilha stack ira guardar os dados dos blocos para que o algoritmo calcule a max.
				
				
				for (int linha = 0; linha < nlinhas; linha++) {			//faz a verificacao em cada linha, deparando-se com '1', o bloco soma e cresce +1, se for '0' o bloco zera.
					for (int bloco = 0; bloco < nblocos; bloco++) {	
						alturablocos[bloco] = matriz[linha][bloco] == '1' ? alturablocos[bloco] + 1 : 0;
							
					}

					stack.clear();									//limpa a pilha stack
					
					for (int bloco = 0; bloco <= nblocos; bloco++) {						//verifica todas as linhas até encontrar a maiorarea, o algoritmo vai ate nblocos para incluir a altura 0 no fim e garantir que todas as linhas seja processadas
						int altura = (bloco == nblocos) ? 0 : alturablocos[bloco];		//se bloco=nblocos a altura sera 0, if else, a altura sera o valor da linha alturablocos da posição blco.
						
						
						while (!stack.isEmpty () && alturablocos[stack.peek()] >= altura) {    	//continua executando enquanto a pilha nao esteja vazia e o alturablocos seja maior ou igual a altura da proxima linha.
							int essaaltura = alturablocos [stack.pop()];										//calcula a area do bloco pegando a posição no stack.pop() e imprime na var essaaltura.
							int essalargura = stack.isEmpty() ? bloco : bloco - stack.peek() - 1;	//o algoritmo calcula a altura*largura e encontra a area maxima (max).
							max = Math.max (max, essaaltura * essalargura);	
						}
						
						stack.push(bloco);
								
					}
				}				
								
				return max;
			}
					
				public static void main(String[] args) {
					char [][] matrizexemplo = {
						{'1','0','1','0','0'},
						{'1','0','1','1','1'},
						{'1','1','1','1','1'},
						{'1','0','0','1','0'}
					};

						AreaMaior solucao= new AreaMaior ();
						int resultado = solucao.AreaRetanguloMax(matrizexemplo);
						System.out.println("Area Maior de '1' é: "+resultado);
			}
	}			