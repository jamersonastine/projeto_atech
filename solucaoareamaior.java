


		import java.util.Stack;
		
		public class SolucaoAreaMaior {
		
			public static int AreaRetanguloMax(char[] matriz) {		//verificar e garantir que a entrada não esteja vazia para evitar NullPointerException. Estando vazia o valor é 0.
				if (matriz = null | matriz.length = 0 | matriz[0].length = 0) {
					return 0;
				}
				
				int nlinhas = matriz.length;										//criei 4 variaveis (nlinhas,nblocos,alturablocos,areamax) e utilizei a propriedade lenght para ler os arrays da matriz e gravar em nlinhas
				int nblocos = matriz[0].length;								//utilizei a variavel matriz[0] para contar os blocos a partir da linha 0, no caso da matriz proposta, espera-se que retorne nblocos=5 
				int[] alturablocos = new int[nblocos]						//quando o nblocos acima retornar 5, ele irá usar esse dado para criar uma nova linha com 5 blocos com valores 0 e a cada linha ira somar os '1'
				int areamax = 0;													//após a soma acima, a maior area encontrada, sera escrita aqui ao utilizar o Math.max
				
				for (int linha = 0; linha < nlinhas, linha++) {			//ao fazer a verificação em cada linha, deparando-se com '1', o bloco soma e cresce +1, se for '0' o bloco zera.
					for (int bloco = 0; bloco < nblocos; bloco++) }
						if (matriz [linha][bloco] = '1') {
							alturablocos[bloco]++;
						} else {
							alturablocos[bloco] = 0;
						}
					}			
				
						int arealinha = searcharea(alturablocos);  							//após criar a alturablocos lendo linha por linha acima o algoritmo irá calcular a arealinha maior.
							areamax = Math.max(areamax,arealinha)
				}		
				
				return areamax;
			}
			
			private static int searcharea(int[] altura) {
				Stack<Integer> pilhadeindices = new Stack<>();		//a pilha stack ira guardar os dados dos blocos para que o algoritmo calcule a areamax.
				int maiorarea = 0;														//a variavel ira gravar o novo valor sempre que op algoritmo encontrar uma area maior.

			
				
				
				