


1. - Avaliação de desempenho: Lógica de programação 

# Encontrando retângulo de maior área em uma matriz binária 2D, onde a saída será =6:

Entrada:
[
  ['1','0','1','0','0'],
  ['1','0','1','1','1'],
  ['1','1','1','1','1'],
  ['1','0','0','1','0']
]
Saída: 6

## Para resolver esse problema, irei transformar a matriz 2D em 1D, dessa forma teremos:

  ['1','0','1','0','0'], = [1,0,1,0,0]
  ['1','0','1','1','1'], = [2,0,2,1,1]
  ['1','1','1','1','1'], = [3,1,3,2,2]
  ['1','0','0','1','0']  = [4,0,0,3,0]
  
  Para transformar a matriz em 1D, faço a contagem de '1's em cada linha e colunas (MxN), de forma vertical e horizontal. O valor é zerado ao se deparar com '0'.
  Na prática, é criado um histograma que irá percorrer cada array e para cada 1 que ele encontrar, irá aumentar a linha seguinte e para cada 0 que ele encontrar, o valor atual irá zerar
  
  ### Calculando e encontrando a maior área da matriz linha por linha:
  
  ['1','0','1','0','0'], = [1,0,1,0,0] = 1x1=1
  ['1','0','1','1','1'], = [2,0,2,1,1] = 2x1=2
  ['1','1','1','1','1'], = [3,1,3,2,2] = 2x3=6
  ['1','0','0','1','0']  = [4,0,0,3,0] = 4x1=4
  
  Fazendo analogia com uma pilha de blocos, o algoritmo irá percorrer por cada linha traçando um retangulo da esquerda para a direita. Sempre que ele encontrar uma
  pilha maior ou igual, o bloco atual é adicionado a pilha. Caso ele encontra um bloco menor, ela é removida da pilha. Quando ele encontra a maior combinação possível para cada pilha e bloco,
  ele multiplica a altura x largura e encontra a maior área do retângulo
  Dessa forma, sem precisar testar um número grande de combinações, ele encontra a maior largura possível naquela pilha. Exemplificando:
  
  [1,0,1,0,0] Se traçarmos um retangulo em todas as 5 pilhas(Largura) onde o 1 seria a altura do bloco, teríamos 5 pilhas sendo dois delas com 1 bloco(Altura).
  [2,0,2,1,1] Se traçarmos um retangulo em todas as 5 pilhas(Largura) onde 2 e 1 seria a altura dos blocos, teríamos 5 pilhas sendo dois delas com 2 blocos de altura e dois com 1
  [3,1,3,2,2] Se traçarmos um retangulo em todas as 5 pilhas(Largura) onde 3,2 e 1 seria a altura dos blocos, teríamos 5 pilhas sendo dois delas com 3 blocos de altura, dois com 2 e um com 1
  [4,0,0,3,0] Se traçarmos um retangulo em todas as 5 pilhas(Largura) onde 4 e 3 seria a altura dos blocos, teríamos 5 pilhas sendo uma delas com 4 blocos de altura e uma com 3 
  
  Então iremos encontrar a matriz [3,1,3,2,2], onde o altura da pilha com dois blocos, junta-se com outras 3 pilhas com 3 e 2 blocos.
  Dessa forma chegamos a altura (2) x (3) largura = 6
  
  
  "# projeto_atech" 
