#include "Lab12-1-AdjMatGraph.h"

void main() {
	AdjMatGraph g;

	for (int i = 0; i < 4; i++) g.insertVertex('A' + i);
	g.insertEdge(0, 1);
	g.insertEdge(0, 3);
	g.insertEdge(1, 2);
	g.insertEdge(1, 3);
	g.insertEdge(2, 3);
	printf("인접 행렬로 표현한 그래프\n");
	g.display();

	g.store("Lab12-1-Graph.txt");
	g.reset();
	g.load("Lab12-1-Graph.txt");
	printf("인접 행렬로 표현한 그래프(파일:graph.txt)\n");
	g.display();
}