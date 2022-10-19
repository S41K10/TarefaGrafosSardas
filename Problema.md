# Nome da Tarefa: Exercício prático
## Descrição *Implemente e submeta uma solução para o problema [DAA 037] Sardas.

### Dicas: 

- Neste problema temos de encontrar a árvore de suporte de custo mínimo que liga as sardas.

- Para saber a distâcia da sarda(x1,y1) a (x2,y2) , basta usar √(x1-x2)² + (y1-y2)²

- Tanto pode usar o algoritmo de Prim, como o algoritmo de Kruskal. Uma sugestão é implementar ambos e verificar que dão a mesma resposta.

- Tendo em conta os limites, não é necessário usar estruturas de dados especializadas, e "qualquer" implementação passa (mesmo que seja quadrática no tempo e no espaço) passa.

- Use doubles para os seus cálculos para não perder precisão (e imprima pelo menos com 3 casas decimais).

*Exercício retirado de https://www.dcc.fc.up.pt/~pribeiro/aulas/daa2021/praticas/aula11.html

Período: Inicia em 10/10/2022 às 00h00 e finaliza em 20/10/2022 às 23h59

## [DAA 037] Sardas
(este problema é essencialmente uma tradução/adaptação de um problema do UVA Online Judge)
A pequena Sara adora ligar as sardas nas costas do seu pai para formar figuras. Considera que as costas do pai podem ser pensadas como um plano com as sardas em várias localizações (x,y). A distância entre dois pontos (x1,y1) e (x2,y2) pode ser vista como a raíz quadrada de (x1-x2)² + (y1-y2)².

## O Problema
A tua tarefa é dizer à Sara qual a maneira de ligar todas as sardas de modo a minimizar a quantidade de tinta usada. A pequena Sara liga as sardas desenhando linhas rectas entre pares de sardas, possivelmente levantando a caneta entre linhas. Quando a Sara termina, deve existir uma sequência de linhas entre uma sarda e qualquer outra sarda.

## Input
A primeira linha contém um único inteiro N, o número de sardas.

Seguem-se N linhas, cada uma com dois inteiros separados por um espaço indicando a posição (x,y) de uma sarda.

## Output
Uma única linha com um número indicando a quantidade de tinta que a Sara deve gastar para ligar todas as sardas.

Para ser considerada correcta, a diferença entre número que escreveu e o número correto deve ser inferior ou igual a 0.01 (este problema tem um avaliador especial para verificar se isso acontece). Por exemplo, se a resposta correcta for "1.2345" qualquer uma das seguintes respostas seria aceite: "1.23", "1.24, "1.22", "1.234" ou "1.235" (já "1.3" não seria aceite, pois |1.2345 - 1.3| > 0.01).

## Restrições
São garantidos os seguintes limites em todos os casos de teste que irão ser colocados ao programa:

- 2 ≤ N ≤ 100	   	Número de sardas
- 0 ≤ x ≤ 1000	   	Coordenada horizontal de uma sarsa
- 0 ≤ y ≤ 1000	   	Coordenada vertical de uma sarsa

## Exemplo de Input
- 3
- 1 1
- 2 2
- 2 4

## Exemplo de Output
3.41421  

## Explicação do Input/Output
O exemplo de input corresponde à seguinte imagem (a castanho os traços de tinta que a Sara tem de fazer):

![Exemplo de input](https://www.dcc.fc.up.pt/~pribeiro/aulas/daa2021/problemas/daa037_ex.png)

